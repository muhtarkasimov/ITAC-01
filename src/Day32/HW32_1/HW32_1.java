package Day32.HW32_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HW32_1 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("songFile.txt");
        Scanner scan = new Scanner(fr);

        String songName = "";
        String singerName = "";
        String songGenre = "";
        String songText = "";

        songName += scan.nextLine();
        singerName += scan.nextLine();
        songGenre += scan.nextLine();
        while (scan.hasNextLine()) {
            songText += scan.nextLine() + "\n";
        }

        Song song = new Song(songName, singerName, songGenre, songText);

        System.out.println(song);
        fr.close();
    }
}
