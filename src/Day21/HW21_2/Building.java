package Day21.HW21_2;

public class Building {

    int worktimeStart;
    int worktimeEnd;
    String name;
    double width;
    double length;
    double height;
    String material;

    public Building() {}

    public Building(int worktimeStart, int worktimeEnd, String name, double width, double length, double height, String material) {
        setName(name);
        setWidth(width);
        setLength(length);
        setHeight(height);
        setMaterial(material);
        setWorktimeStart(worktimeStart);
        setWorktimeEnd(worktimeEnd);
    }

    public int getWorktimeStart() {
        return worktimeStart;
    }

    public void setWorktimeStart(int worktimeStart) {
        if (worktimeStart < 0 && worktimeStart > 24) return;
        this.worktimeStart = worktimeStart;
    }

    public int getWorktimeEnd() {
        return worktimeEnd;
    }

    public void setWorktimeEnd(int worktimeEnd) {
        if (worktimeEnd < 0 && worktimeEnd > 24) return;
        this.worktimeEnd = worktimeEnd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) return;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) return;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) return;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material.equals("")) return;
        this.material = material;
    }

    @Override
    public String toString() {
        String s = "Building name: " + name +
                "\nWidth: " + width +
                "\nLength: " + length +
                "\nHeight: " + height +
                "\nMaterial: " + material + "\n";

        return s;
    }
}
