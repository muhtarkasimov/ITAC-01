package Day26.CW26_1;


import java.awt.*;

public class Figure {

    private static int counter = 0;
    private Position position;
    private String color;
    private boolean visibility;

    public Figure( int x, int y, String color, boolean visibility) {
        position = new Position(x, y);
        this.color = color;
        this.visibility = visibility;
        counter++;
    }
    public Figure(Position position, String color, boolean visibility) {
        this.position = position;
        this.color = color;
        this.visibility = visibility;
        counter++;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public static int getCounter() {
        return counter;
    }

    public String speak() {
        return "Figure:\n" + position.speak() + "\nColor: " + color + ", Visibility: " + visibility;
    }

}
