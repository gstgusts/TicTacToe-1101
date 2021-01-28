package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeForm extends JFrame {

    JPanel mainPanel;
    JPanel gamePanel;
    JButton btn_0_0;
    JButton btn_0_1;
    JButton btn_0_2;
    JButton btn_1_0;
    JButton btn_1_1;
    JButton btn_1_2;
    JButton btn_2_0;
    JButton btn_2_1;
    JButton btn_2_2;
    JMenuBar menuBar;

    private TicTacToe game = new TicTacToe();

    public TicTacToeForm() {
        super("Tic Tac Toe");
        setSize(300, 320);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void open() {
        initUi();
        setVisible(true);
    }

    private void initUi() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));

        menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenuItem restartItem = new JMenuItem("Restart");

        restartItem.addActionListener(e -> {
            game.restart();
            handleButtonState(true);
            clearButtonText();
        });

        gameMenu.add(restartItem);
        menuBar.add(gameMenu);

        mainPanel.add(BorderLayout.NORTH, menuBar);

        //mainPanel.setBackground(Color.blue);
        btn_0_0 = new JButton();
        btn_0_1 = new JButton();
        btn_0_2 = new JButton();
        btn_1_0 = new JButton();
        btn_1_1 = new JButton();
        btn_1_2 = new JButton();
        btn_2_0 = new JButton();
        btn_2_1 = new JButton();
        btn_2_2 = new JButton();

        gamePanel.add(btn_0_0);
        gamePanel.add(btn_0_1);
        gamePanel.add(btn_0_2);
        gamePanel.add(btn_1_0);
        gamePanel.add(btn_1_1);
        gamePanel.add(btn_1_2);
        gamePanel.add(btn_2_0);
        gamePanel.add(btn_2_1);
        gamePanel.add(btn_2_2);

        btn_0_0.addActionListener(e -> {
            handleBtnClick(0,0, btn_0_0);
        });

        btn_0_1.addActionListener(e -> {
            handleBtnClick(0,1, btn_0_1);
        });

        btn_0_2.addActionListener(e -> {
            handleBtnClick(0,2, btn_0_2);
        });

        btn_1_0.addActionListener(e -> {
            handleBtnClick(1,0, btn_1_0);
        });

        btn_1_1.addActionListener(e -> {
            handleBtnClick(1,1, btn_1_1);
        });

        btn_1_2.addActionListener(e -> {
            handleBtnClick(1,2, btn_1_2);
        });

        btn_2_0.addActionListener(e -> {
            handleBtnClick(2,0, btn_2_0);
        });

        btn_2_1.addActionListener(e -> {
            handleBtnClick(2,1, btn_2_1);
        });

        btn_2_2.addActionListener(e -> {
            handleBtnClick(2,2, btn_2_2);
        });

        mainPanel.add(BorderLayout.CENTER, gamePanel);

        setContentPane(mainPanel);
    }

    private void clearButtonText() {
        btn_0_0.setText("");
        btn_0_1.setText("");
        btn_0_2.setText("");
        btn_1_0.setText("");
        btn_1_1.setText("");
        btn_1_2.setText("");
        btn_2_0.setText("");
        btn_2_1.setText("");
        btn_2_2.setText("");
    }

    private void handleBtnClick(int row, int column, JButton btn) {
        var result = game.placeMark(row, column);
        var symb = game.getValue(row, column);
        btn.setText(String.valueOf(symb));

        switch (result) {
            case DEUCE -> {
                handleButtonState(false);
                JOptionPane.showMessageDialog(null, "DEUCE");
                break;
            }
            case X_WON -> {
                handleButtonState(false);
                JOptionPane.showMessageDialog(null, "X WON !!!");
                break;
            }
            case O_WON -> {
                handleButtonState(false);
                JOptionPane.showMessageDialog(null, "O WON !!!");
                break;
            }
        }
    }

    private void handleButtonState(boolean enabled) {
        btn_0_0.setEnabled(enabled);
        btn_0_1.setEnabled(enabled);
        btn_0_2.setEnabled(enabled);
        btn_1_0.setEnabled(enabled);
        btn_1_1.setEnabled(enabled);
        btn_1_2.setEnabled(enabled);
        btn_2_0.setEnabled(enabled);
        btn_2_1.setEnabled(enabled);
        btn_2_2.setEnabled(enabled);
    }
}
