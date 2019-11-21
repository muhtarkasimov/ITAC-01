package Day21.HW21_2;

public class Furniture {

    String material;
    double width;
    double height;
    double length;

    public Furniture() {}

    public Furniture(String material, double width, double height, double length) {
        setMaterial(material);
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material.equals("")) return;
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) return;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) return;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) return;
        this.length = length;
    }

    //napisat' toString method
}
