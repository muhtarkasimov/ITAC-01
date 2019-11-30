package Day32.CW32_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CW32_3 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("CW32_2.txt");
        Scanner scanFile = new Scanner(fileReader);
        int i = 1;
        while (scanFile.hasNextLine()) {
            System.out.println(i + ": " + scanFile.nextLine());
            i++;
        }
        scanFile.close();
        fileReader.close();
    }
}
