package Day33.HW33_1;

import java.io.*;
import java.util.Scanner;

public class HW33_1 {

    public static void main(String[] args) throws Exception {
        try {
            File existingFile = new File("./src/Day33/HW33_1/HW33_1.java");
            File newFile = new File("./src/Day33/HW33_1/newFile.java");
            FileWriter fw = new FileWriter(newFile);
            FileReader fr = new FileReader(existingFile);
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                fw.write("//" + scan.nextLine() + "\n");
            }
            //adding comment signs to not to confuse my intelliJ

//            System.out.println("incode works");

            fw.close();
            fr.close();
            scan.close();

            if (newFile.length() > 100) {
                throw new IllegalStateException("newFile.java code is too big (more than 100 bytes)");
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
//            System.out.println("Finally works");
        }
    }
}
