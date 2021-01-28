package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeForm extends JFrame {

    JPanel mainPanel;
    JButton btn_0_0;
    JButton btn_0_1;
    JButton btn_0_2;
    JButton btn_1_0;
    JButton btn_1_1;
    JButton btn_1_2;
    JButton btn_2_0;
    JButton btn_2_1;
    JButton btn_2_2;

    public TicTacToeForm() {
        super("Tic Tac Toe");
        setSize(300, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void open() {
        initUi();
        setVisible(true);
    }

    private void initUi() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,3));

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

        mainPanel.add(btn_0_0);
        mainPanel.add(btn_0_1);
        mainPanel.add(btn_0_2);
        mainPanel.add(btn_1_0);
        mainPanel.add(btn_1_1);
        mainPanel.add(btn_1_2);
        mainPanel.add(btn_2_0);
        mainPanel.add(btn_2_1);
        mainPanel.add(btn_2_2);

        btn_0_0.addActionListener(e -> {
            System.out.println("0 0");
        });

        btn_0_1.addActionListener(e -> {
            System.out.println("0 1");
        });

        btn_0_2.addActionListener(e -> {
            System.out.println("0 2");
        });

        btn_1_0.addActionListener(e -> {
            System.out.println("1 0");
        });

        btn_1_1.addActionListener(e -> {
            System.out.println("1 1");
        });

        btn_1_2.addActionListener(e -> {
            System.out.println("1 2");
        });

        btn_2_0.addActionListener(e -> {
            System.out.println("2 0");
        });

        btn_2_1.addActionListener(e -> {
            System.out.println("2 1");
        });

        btn_2_2.addActionListener(e -> {
            System.out.println("2 2");
        });

        setContentPane(mainPanel);
    }
}
