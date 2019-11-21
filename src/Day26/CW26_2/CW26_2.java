//package Day26.CW26_2;
//
////import Day25.CW25_1.CW25_1;
////import Day26.CW26_1.Rectangle;
////
////import javax.swing.*;
////import java.awt.*;
////import java.util.Random;
////
////public class CW26_2 extends Canvas {
////
////    private static int frameSize = 500;
////    public static void main(String[] args) {
////        CW26_2 canvas = new CW26_2();
////        JFrame frame = new JFrame();
////        frame.setSize(frameSize + 50, frameSize + 50);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.getContentPane().add(canvas);
////        frame.setVisible(true);
////
////        Chessboard chessboard = new Chessboard();
////        int coordX = 0, coordY = 0;
////
////        Rectangle black = new Rectangle(coordX, coordY, "Black", true, 10, 10);
////        Rectangle white = new Rectangle(1, 1, "White", true, 10, 10);
////
////        for (int i = 0; i < chessboard.getBoard().length; ) {
////            for (int j = 0; i < chessboard.getBoard().length; ) {
////                if (i % 2 == 0) chessboard.fill(black, i, j);
////                else chessboard.fill(white, i , j);
////                coordX += 10;
////            }
////            coordY += 10;
////            coordX = 0;
////        }
////
////
////
////    }
////    // можно ли один обьекто раскидать по всей доске,
////    // если да, то как сделать чтобы нельзя было
////    //
////    // как, поставив public final X[] = new X[1];
////    // можно его поменять ?
////    //
////
////    public CW26_2() {}
////
////    @Override
////    public void paint(Graphics graphics) {
////
////    }
////
////
////
////}
//import Day26.CW26_1.Position;
//import Day26.CW26_1.Rectangle;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class MainFigure extends Canvas {
//    @Override
//    public void paint(Graphics g) {
//        Chessboard chessboard = new Chessboard();
//        int coordX = 0, coordY = 0;
//        for(int i = 0; i < chessboard.getBoard().length;i++) {
//            for (int j = 0; j < chessboard.getBoard().length; j++) {
//                chessboard.fill(new Rectangle(coordX, coordY, "", true,40,40),i,j);
//                coordX += 42;
//                chessboard.getBoard()[i][j].draw(g);
//            }
//            coordX = 0;
//            coordY+= 42;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        MainFigure canvas  = new MainFigure();
//        JFrame frame = new JFrame();
//        frame.setSize(500,500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(canvas);
//        frame.setVisible(true);
//
//
//
//    }
//}
