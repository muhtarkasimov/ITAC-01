package Day25.HW25_1;

import Day24.CW24_5.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

final public class HW25_1 extends Canvas {

    //    static int frameWidth = 1000;
//    static int frameHeight = 1000;
    final static int frameSize = 500;

    public HW25_1() {}

    @Override
    public void paint(Graphics graphics) {
        setBackground(Color.WHITE);

        //const lines
        graphics.setColor(Color.BLUE);
        graphics.drawLine(0,frameSize/2,frameSize,frameSize/2);
        graphics.setColor(Color.RED);
        graphics.drawLine(frameSize/2,0,frameSize/2,frameSize);
        //const lines

        graphics.setColor(Color.GREEN);

//        //x, y, width, height   --- Y = X^2
//        for (double y = 0; y > -(frameSize/2); y -= 0.01) {
//            graphics.fillOval((int)y + frameSize/2, (int)(y*y) + frameSize/2 - 1,2,2);
//            System.out.println("X: " + y + " Y: " + y*y);
//        }
//
//        for (double y = frameSize/2; y > 0; y -= 0.01) {
//            graphics.fillOval((int)y + frameSize/2, (int)(y*y) + frameSize/2 - 1,2,2);
//            System.out.println("X: " + y + " Y: " + y*y);
//        }



        //x, y, width, height --- Y = X^3
        for (double y = 0; y > -(frameSize/2); y -= 0.01) {
            graphics.fillOval((int)y + frameSize/2, (int)(y*y*y) + frameSize/2 - 1,2,2);
            System.out.println("X: " + y + " Y: " + y*y*y);
        }

        for (double y = frameSize/2; y > 0; y -= 0.01) {
            graphics.fillOval((int)y + frameSize/2, (int)(y*y*y) + frameSize/2 - 1,2,2);
            System.out.println("X: " + y + " Y: " + y*y*y);
        }

//        graphics.setColor(Color.BLACK);
//        graphics.fillOval(50, 50, 100, 100);
//        graphics.fillOval(150, 50, 100, 100);
//        graphics.fillOval(50, 150, 200, 50);
//        graphics.setColor((Color.WHITE));
//        graphics.fillOval(50, 150, 200, 40);
//        graphics.fillOval(100, 100, 30, 30);
//        graphics.fillOval(170, 100, 30, 30);
//        //smile

    }

    public static void main(String[] args) {
        HW25_1 canvas = new HW25_1();
        JFrame frame = new JFrame();
        frame.setSize(frameSize+20, frameSize+45);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }


}