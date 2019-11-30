package Day32.CW32_1;

import java.io.FileWriter;
import java.io.IOException;

public class CW32_1 {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("Hello from the other side");
        fileWriter.close();

    }
}
