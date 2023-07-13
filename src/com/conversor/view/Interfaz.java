package com.conversor.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz{
    private JPanel mainPanel;
    private JTabbedPane Menu;
    private JTextField txtIngresoMoneda;
    private JComboBox deMoneda;
    private JComboBox aMoneda;
    private JLabel lblResultadoMoneda;
    private JComboBox deTemperatura;
    private JTextField txtIngresoTemperatura;
    private JComboBox aTemperatura;
    private JLabel lblResultadoTemperatura;
    private JComboBox deLongitud;
    private JTextField txtIngresoLongitud;
    private JComboBox aLongitud;
    private JLabel lblResultadoLongitud;
    private JComboBox aMasa;
    private JLabel lblResultadoMasa;
    private JTextField txtIngresoMasa;
    private JComboBox deMasa;
    private JButton btnConvertir;

    public Interfaz() {
        JFrame frame = new JFrame("Conversor de Unidades");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.setResizable(false);
        frame.setSize(850, 550);

        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tab = Menu.getTitleAt(Menu.getSelectedIndex());
                switch (tab){
                    case "Moneda":
                        calcularMoneda();
                        break;
                    case "Temperatura":
                        calcularTemperatura();
                        break;
                    case "Longitud":
                        calcularLongitud();
                        break;
                    case "Masa":
                        calcularMasa();
                        break;
                }
            }
        });
    }

    private boolean validarIngreso(JTextField txtIngreso){
        if (txtIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un valor");
            return false;
        }
        else{
            try{
                Double.parseDouble(txtIngreso.getText());
                return true;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico");
                return false;
            }
        }
    }

    private void calcularMoneda(){
        if (validarIngreso(txtIngresoMoneda)){
            System.out.println("Seleccionado: " + deMoneda.getSelectedItem().toString() + " " + aMoneda.getSelectedItem().toString() + " " + txtIngresoMoneda.getText());
        }
    }

    private void calcularTemperatura(){
        if (validarIngreso(txtIngresoTemperatura)){
            System.out.println("Seleccionado: " + deTemperatura.getSelectedItem().toString() + " " + aTemperatura.getSelectedItem().toString() + " " + txtIngresoTemperatura.getText());
        }
    }

    private void calcularLongitud(){
        if (validarIngreso(txtIngresoLongitud)){
            System.out.println("Seleccionado: " + deLongitud.getSelectedItem().toString() + " " + aLongitud.getSelectedItem().toString() + " " + txtIngresoLongitud.getText());
        }
    }

    private void calcularMasa(){
        if (validarIngreso(txtIngresoMasa)){
            System.out.println("Seleccionado: " + deMasa.getSelectedItem().toString() + " " + aMasa.getSelectedItem().toString() + " " + txtIngresoMasa.getText());
        }
    }

    public static void main(String[] args) {
        new Interfaz();
    }


}
