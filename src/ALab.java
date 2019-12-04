import java.io.*;
import java.util.Random;

public class ALab {
    public static void main(String[] args) throws Exception {
        File file = new File("./songFile.txt");
        long len = file.length();
        System.out.println(len);
    }
}

