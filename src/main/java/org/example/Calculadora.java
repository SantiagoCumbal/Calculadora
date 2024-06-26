package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public JPanel mainPanel;
    private JTextField numero1;
    private JTextField numero2;
    private JButton sumabutton;
    private JButton restabutton;
    private JButton multibutton;
    private JButton raizButton;
    private JButton potenciaButton;
    private JButton divibutton;
    private JButton secButton;
    private JButton cosButton;
    private JButton tanButton;
    private JLabel Respuesta;

    public Calculadora() {
        sumabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int suma=numero1V+numero2V;
                Respuesta.setText(suma+"");
            }
        });
        restabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int resta=numero1V-numero2V;
                Respuesta.setText(resta+"");
            }
        });
        multibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int multi=numero1V*numero2V;
                Respuesta.setText(multi+"");
            }
        });

        divibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Integer.parseInt(numero1.getText());
                double numero2V=Integer.parseInt(numero2.getText());
                if(numero2V==0){
                    Respuesta.setText("NO EXISTE DIVISION PARA 0");
                } else{
                    double divi=numero1V/numero2V;
                    Respuesta.setText(divi+"");
                }
            }
        });
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
