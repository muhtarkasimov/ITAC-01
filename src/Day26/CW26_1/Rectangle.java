package Day26.CW26_1;

import java.awt.*;

public class Rectangle extends Figure {

    private int height;
    private int width;
    private boolean isSquare;

    public Rectangle(int x, int y, String color, boolean visibility) {
        super(x, y, color, visibility);
    }

    public Rectangle(Position position, String color, boolean visibility) {
        super(position, color, visibility);
    }

    public Rectangle(int x, int y, String color, boolean visibility, int height, int width) {
        super(x, y, color, visibility);
        this.height = height;
        this.width = width;
        if (width == height) isSquare = true;
    }

    public Rectangle(Position position, String color, boolean visibility, int height, int width) {
        super(position, color, visibility);
        this.height = height;
        this.width = width;
        if (width == height) isSquare = true;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak() {
        String s = super.speak() + "\nWidth: " + width + ", Height: " + height;
        if (isSquare) {
            return s += "\nThis rectangle is square";
        }
        return s;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.CYAN);

    }
}
