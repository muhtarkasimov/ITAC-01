package Day19.HW19_1;

public class Farm {

    String address;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String ownerFullName;

    public Farm() {
        cows = new Cow[0];
        sheeps = new Sheep[0];
        horses = new Horse[0];
    }

    public Farm(String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerFullName) {
        setAddress(address);
        setCows(cows);
        setSheeps(sheeps);
        setHorses(horses);
        setOwnerFullName(ownerFullName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.equals("")) return;
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        if (cows == null) return;
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        if (sheeps == null) return;
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        if (horses == null) return;
        this.horses = horses;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        if (ownerFullName.equals("")) return;
        this.ownerFullName = ownerFullName;
    }

    public void printInfo() {
        System.out.println("address = " + address);
        System.out.println("ownerFullName = " + ownerFullName);
        System.out.println("cows = " + cows.length);
        System.out.println("horses = " + horses.length);
        System.out.println("sheeps = " + sheeps.length);
        System.out.println();
    }
}
