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
    private JButton senButton;
    private JButton cosButton;
    private JButton tanButton;
    private JLabel Respuesta;
    private JButton CLRButton;

    public Calculadora() {
        sumabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Double.parseDouble(numero1.getText());
                double numero2V=Double.parseDouble(numero2.getText());
                double suma=numero1V+numero2V;
                double sumaR = Math.round(suma * 100.0) / 100.0;
                Respuesta.setText(sumaR+"");
            }
        });
        restabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Double.parseDouble(numero1.getText());
                double numero2V=Double.parseDouble(numero2.getText());
                double resta=numero1V-numero2V;
                double restaR = Math.round(resta * 100.0) / 100.0;
                Respuesta.setText(restaR+"");
            }
        });
        multibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Double.parseDouble(numero1.getText());
                double numero2V=Double.parseDouble(numero2.getText());
                double multi=numero1V*numero2V;
                double multiR = Math.round(multi * 100.0) / 100.0;
                Respuesta.setText(multiR+"");
            }
        });

        divibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Double.parseDouble(numero1.getText());
                double numero2V=Double.parseDouble(numero2.getText());
                if(numero2V==0){
                    Respuesta.setText("NO EXISTE DIVISION PARA 0");
                } else{
                    double divi=numero1V/numero2V;
                    double diviR = Math.round(divi * 100.0) / 100.0;
                    Respuesta.setText(diviR+"");
                }
            }
        });
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base=Double.parseDouble(numero1.getText());
                double indice=Double.parseDouble(numero2.getText());
                double raiz=Math.pow(base,1.0/indice);
                double raizR = Math.round(raiz * 100.0) / 100.0;
                Respuesta.setText(raizR+"");
            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base=Double.parseDouble(numero1.getText());
                double exponente=Double.parseDouble(numero2.getText());
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
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor=Double.parseDouble(numero1.getText());
                numero2.setText(" - ");
                double valorRad=Math.toRadians(valor);
                double sen= Math.sin(valorRad);
                double senR= Math.round(sen*100.0)/100.0;
                Respuesta.setText(senR+"");
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
