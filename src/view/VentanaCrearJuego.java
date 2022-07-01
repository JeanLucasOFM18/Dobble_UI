package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dobblegame.*;

public class VentanaCrearJuego extends JFrame implements ActionListener {

    private Dobble_20885272_RiveraRodriguez datosMazo;
    private DobbleGame_20885272_RiveraRodriguez datosJuego;

    private JLabel labelQuestion;
    private JLabel labelQuestion1;
    private JLabel labelQuestion2;
    private JTextField fieldWeight;
    private JTextField fieldWeight1;
    private JTextField fieldWeight2;
    private JButton botonAccion;

    public VentanaCrearJuego() {
        super("Crear Juego");
        this.datosMazo = new Dobble_20885272_RiveraRodriguez();
        this.datosJuego = new DobbleGame_20885272_RiveraRodriguez();
        initComponent();
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initComponent() {
        labelQuestion = new JLabel("Ingrese cantidad de elementos que quiere agregar:");
        fieldWeight = new JTextField(5);
        labelQuestion1 = new JLabel("Ingrese cantidad de elementos por carta:");
        fieldWeight1 = new JTextField(5);
        labelQuestion2 = new JLabel("Ingrese cantidad de cartas que quiere generar:");
        fieldWeight2 = new JTextField(5);
        botonAccion = new JButton("OK");

        add(labelQuestion);
        add(fieldWeight);
        add(labelQuestion1);
        add(fieldWeight1);
        add(labelQuestion2);
        add(fieldWeight2);
        add(botonAccion);


        setLayout(new FlowLayout());

        botonAccion.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getSource() == botonAccion) {
                int cant_elements = Integer.parseInt(fieldWeight.getText());
                int numC = Integer.parseInt(fieldWeight1.getText());
                int maxC = Integer.parseInt(fieldWeight2.getText());
                if ((datosMazo.calculo(numC)) <= cant_elements) {
                    JOptionPane.showMessageDialog(this, "Puedes crear el mazo");
                } else {
                    //message = String.format(message, amountWaterToDrink);
                    JOptionPane.showMessageDialog(this, "No puedes crear el mazo");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Valor incorrecto :(");
        }
    }

}
