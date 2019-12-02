package Day32.HW32_1;

public class Song {

    private String name;
    private String genre;
    private String singerName;
    private String lyrics;

    public Song(String name, String genre, String singerName, String lyrics) {
        setName(name);
        setGenre(genre);
        setSingerName(singerName);
        setLyrics(lyrics);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Empty song name error");
            return;
        }
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        if (singerName.equals("")) {
            System.out.println("Empty singer name error");
            return;
        }
        this.singerName = singerName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre.equals("")) {
            System.out.println("Empty genre name error");
            return;
        }
        this.genre = genre;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        if (lyrics.equals("")) {
            System.out.println("Empty lyrics error");
            return;
        }
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "" + getName() + "\n" +
                getSingerName() + "\n" +
                getGenre() + "\n" +
                getLyrics() + "\n";
    }
}
