package Day32.CW32_2;

import java.io.FileWriter;
import java.io.IOException;

public class CW32_2 {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("CW32_2.txt");

        for (int i = 65; i < 91; i++) {
            fileWriter.write((char)i);
        }
        fileWriter.write("\n");
        for (int i = 0; i < 10; i++) {
            fileWriter.write("" + i);
        }



        fileWriter.close();

    }
}
