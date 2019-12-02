package Day32.HW32_2;

import Day32.HW32_1.Song;

import java.io.FileWriter;

public class HW32_2 {

    public static void main(String[] args) throws Exception{
        Song song = new Song("Nothing else matters", "Metallica", "\"Power ballad\"","So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n" +
                "...");

        FileWriter fw = new FileWriter("" + song.getName() + ".txt");
        fw.write(song.getName() + "\n");
        fw.write(song.getGenre() + "\n");
        fw.write(song.getSingerName() + "\n");
        fw.write(song.getLyrics() + "\n");

        fw.close();
    }

}
