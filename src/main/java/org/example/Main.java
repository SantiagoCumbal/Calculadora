package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame calcu = new JFrame("Calculadora");
        calcu.setSize(500,1000);
        calcu.setContentPane(new Calculadora().mainPanel);
        calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcu.pack();
        calcu.setVisible(true);
    }
}