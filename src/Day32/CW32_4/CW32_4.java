package Day32.CW32_4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CW32_4 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("CW32_2.txt");
        Scanner scanFile = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("CW32_4.txt");

        while (scanFile.hasNextLine()) {
            char[] array = scanFile.nextLine().toCharArray();
            for (int i = 1; i <= array.length; i++) {

                if (i % 3 == 0) {
                    fileWriter.write(array[i-1]);
                    fileWriter.write("\n");
                }
            }
            fileWriter.write("\n");
        }
        fileReader.close();
        fileWriter.close();
        scanFile.close();
    }
}
