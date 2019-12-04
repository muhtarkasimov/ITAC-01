package Day33.HW33_1;

import java.io.*;
import java.util.Scanner;

public class HW33_1 {

    public static void main(String[] args) throws Exception {
        try {
            File existingFile = new File("./src/Day33/HW33_1/HW33_1.java");
            File newFile = new File("./src/Day33/HW33_1/newFile.java");
            File noSpaceFile = new File("./src/Day33/HW33_1/noSpaceFile.txt");

            FileWriter noSpaceWriter = new FileWriter(noSpaceFile);
            FileWriter fw = new FileWriter(newFile);
            FileReader fr = new FileReader(existingFile);
            Scanner scan = new Scanner(fr);

            String line;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                fw.write("//" + line + "\n");
                noSpaceWriter.write("//" + line.trim() + "\n");
            }
            //trim() don't works with comments done by [ctrl] + [/]
            //may be it will work if do trim() twice, but i don't checked it
            //adding comment signs to not to confuse my intelliJ

            //System.out.println("incode works");

            fw.close();
            fr.close();
            scan.close();
            noSpaceWriter.close();

            if (newFile.length() > 100) {
                throw new IllegalStateException("newFile.java code is too big (more than 100 bytes)");
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //System.out.println("Finally works");
        }
    }
}
