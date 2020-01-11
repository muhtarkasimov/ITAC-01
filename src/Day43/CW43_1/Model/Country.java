package Day43.CW43_1.Model;

public class Country {

    private int id;
    private String name;
    private String code;
    private long population;
    private int president;

    @Override
    public String toString() {
        return "id: " + id +
                "\nname: " + name +
                "\ncode: " + code +
                "\npopualtion: " + population +
                "\npresident: " + president;
    }

    public Country(int id, String name, String code, long population, int president) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.population = population;
        this.president = president;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getPresident() {
        return president;
    }

    public void setPresident(int president) {
        this.president = president;
    }
}
