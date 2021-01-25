package com.company;

import java.util.Arrays;

public class TicTacToe {
    private static final int FIELD_SIZE = 3;
    private FieldType[][] board = new FieldType[FIELD_SIZE][FIELD_SIZE];
    private boolean player1Active;

    public TicTacToe() {
        restart();
    }

    public void restart() {
        player1Active = true;
        for (FieldType[] row : board) {
            Arrays.fill(row, FieldType.EMPTY);
        }
    }
}
