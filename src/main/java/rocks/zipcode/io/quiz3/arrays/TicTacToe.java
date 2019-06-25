package rocks.zipcode.io.quiz3.arrays;

import javafx.scene.SnapshotParametersBuilder;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[0][0];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        column[0] = board[0][value];
        column[1] = board[1][value];
        column[2] = board[2][value];
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if (getRow(rowIndex)[0].equals(getRow(rowIndex)[1]) && getRow(rowIndex)[0].equals(getRow(rowIndex)[2])){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1]) && getColumn(columnIndex)[0].equals(getColumn(columnIndex)[2])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i) || isColumnHomogeneous(i)) {
                return board[i][i];
            } else if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
                return board[1][1];
            } else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
                return board[1][1];
            }
        }
        return "Tie";
    }

    public String[][] getBoard() {
        return this.board;
    }
}
