package Day44.HW44_1;

public class Town {

    private int id;
    private String name;
    private int country;
    private int mayor;
    private long population;


    @Override
    public String toString() {
        return "id: " + id +
                "\nname: " + name +
                "\ncountry: " + country +
                "\nmayor: " + mayor +
                "\npopulation: " + population;
    }

    public Town(int id, String name, int country, int mayor, long population) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.mayor = mayor;
        this.population = population;
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

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
