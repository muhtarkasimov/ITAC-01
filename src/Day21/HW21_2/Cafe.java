package Day21.HW21_2;

public class Cafe extends Building {

    Menu menu;
    Person[] staff;
    Furniture[] furnitures;

    public Cafe() {}

    public Cafe(String name, int worktimeStart, int worktimeEnd, Menu menu, Person[] staff) {
        super.setName(name);
        super.setWorktimeStart(worktimeStart);
        super.setWorktimeEnd(worktimeEnd);
        setMenu(menu);
        setStaff(staff);
//        setFurnitures(furnitures);
    }

    public Cafe(String name, double width, double length, double height, String material, int worktimeStart, int worktimeEnd, Menu menu, Person[] staff) {
        super.setName(name);
        super.setWidth(width);
        super.setLength(length);
        super.setHeight(height);
        super.setMaterial(material);
        super.setWorktimeStart(worktimeStart);
        super.setWorktimeEnd(worktimeEnd);
        setMenu(menu);
        setStaff(staff);
//        setFurnitures(furnitures);
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Person[] getStaff() {
        return staff;
    }

    public void setStaff(Person[] staff) {
        this.staff = staff;
    }

    public Furniture[] getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(Furniture[] furnitures) {
        this.furnitures = furnitures;
    }
}
