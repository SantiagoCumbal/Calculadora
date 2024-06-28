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
    private JButton CLRButton;

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
                int base=Integer.parseInt(numero1.getText());
                int indice=Integer.parseInt(numero2.getText());
                double raiz=Math.pow(base,1.0/indice);
                double raizR = Math.round(raiz * 100.0) / 100.0;
                Respuesta.setText(raizR+"");
            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int base=Integer.parseInt(numero1.getText());
                int exponente=Integer.parseInt(numero2.getText());
                double potencia=Math.pow(base,exponente);
                double potenciaR = Math.round(potencia * 100.0) / 100.0;
                Respuesta.setText(potenciaR+"");
            }
        });
        CLRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1.setText(null);
                numero2.setText(null);
                Respuesta.setText(null);
            }
        });
        secButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor=Double.parseDouble(numero1.getText());
                numero2.setText(" - ");
                double valorRad=Math.toRadians(valor);
                double sec= Math.sin(valorRad);
                double secR= Math.round(sec*100.0)/100.0;
                Respuesta.setText(secR+"");
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor=Double.parseDouble(numero1.getText());
                numero2.setText(" - ");
                double valorRad=Math.toRadians(valor);
                double cos= Math.cos(valorRad);
                double cosR= Math.round(cos*100.0)/100.0;
                Respuesta.setText(cosR+"");
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor=Double.parseDouble(numero1.getText());
                numero2.setText(" - ");
                double valorRad=Math.toRadians(valor);
                double tan= Math.tan(valorRad);
                double tanR= Math.round(tan*100.0)/100.0;
                Respuesta.setText(tanR+"");
            }
        });
    }


}
