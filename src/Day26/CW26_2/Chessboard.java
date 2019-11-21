package Day26.CW26_2;

import Day26.CW26_1.Rectangle;

public class Chessboard {

    private final Rectangle[][] board = new Rectangle[8][8];

    public Chessboard() {}

    // final - запрещаем Override'ить данный метод
    final public boolean fill(Rectangle rectangle, int row, int column) {
        if (row > 7 || column > 7 || row < 0 || column < 0) return false;
        board[row][column] = rectangle;
        return true;
    }

    public Rectangle getRectangle(int row, int column) {
        return board[row][column];
    }

    public Rectangle[][] getBoard() {
        return board;
    }


}
