package Day33.HW33_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class HW33_1 {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("./src/Day33/HW33_1/newFile.java");
        FileReader fr = new FileReader("./src/Day33/HW33_1/HW33_1.java");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            fw.write("//" + scan.nextLine() + "\n");
        }
        //adding comment signs to not to confuse my intelliJ

        fw.close();
        fr.close();
        scan.close();
    }
}
