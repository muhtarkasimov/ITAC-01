package Day25.CW25_1;

import Day24.CW24_5.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CW25_1 extends Canvas {
    static Random random = new Random();

    static int frameHeight = 600;
    static int frameWidth = 600;
    static int circleAmount = 15;
    static int circleMinRadius = 145;
    static int circleMaxRadius = 150;

    static Color[] colors = {Color.BLACK, Color.BLUE, Color.LIGHT_GRAY, Color.GREEN, Color.magenta};

    public static Circle createRandomCircle(int minRadius, int maxRadius) {
        int radius = random.nextInt((maxRadius - minRadius + 1) + minRadius);
        // 0 - 4
        Color color = colors[random.nextInt(5)];
        Circle circle = new Circle(radius, color);

        return circle;
    }

    public CW25_1() {}

    @Override
    public void paint(Graphics graphics) {

        Circle[] circles = new Circle[circleAmount];
        for (int i = 0; i < circleAmount; i++) {
            circles[i] = createRandomCircle(circleMinRadius, circleMaxRadius);
        }

        setBackground(Color.WHITE);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(50, 50, 100, 100);
        graphics.fillOval(150, 50, 100, 100);
        graphics.fillOval(50, 150, 200, 50);
        graphics.setColor((Color.WHITE));
        graphics.fillOval(50, 150, 200, 40);
        graphics.fillOval(100, 100, 30, 30);
        graphics.fillOval(170, 100, 30, 30);
        //smile

        for (int i = 0; i < circleAmount; i++) {
            graphics.setColor(circles[i].getColor());
            graphics.fillOval(
                    random.nextInt(frameHeight),
                    random.nextInt(frameWidth),(int)circles[i].getRadius(),(int)circles[i].getRadius());
        }

    }

    public static void main(String[] args) {
        CW25_1 canvas = new CW25_1();
        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }


}
