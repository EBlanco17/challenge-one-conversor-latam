package com.conversor.view;

import com.conversor.controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    private JLabel footerLabel;
    private JPanel footer;
    private JLabel dateLabel;

    public Interfaz() {
        JFrame frame = new JFrame("Conversor de Unidades");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Desactiva el comportamiento predeterminado de cierre

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de que deseas cerrar la aplicación?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                   frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(850, 550);

        dateLabel.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now()));
        footerLabel.setText("<html><p style=\"text-align:center;\">Desarrollado por EBlanco <br> Oracle Next Education G5 <br> Colombia 2023</p></html>");

        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tab = Menu.getTitleAt(Menu.getSelectedIndex());
                switch (tab) {
                    case "Moneda" -> calcularMoneda();
                    case "Temperatura" -> calcularTemperatura();
                    case "Longitud" -> calcularLongitud();
                    case "Masa" -> calcularMasa();
                }
            }
        });
    }

    private boolean validarIngreso(JTextField txtIngreso){
        if (txtIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un valor","Error...",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            try{
                Double.parseDouble(txtIngreso.getText());
                return true;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico","Error...",JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }

    private void calcularMoneda(){
        if (validarIngreso(txtIngresoMoneda)){
            String monedaActual = deMoneda.getSelectedItem().toString().substring(0, 3);
            String monedaCambio = aMoneda.getSelectedItem().toString().substring(0, 3);
            double cantidad = Double.parseDouble(txtIngresoMoneda.getText());

            Moneda conversion = new Moneda();
            conversion.setUnidadActual(monedaActual);
            conversion.setUnidadCambio(monedaCambio);
            conversion.setCantidad(cantidad);
            lblResultadoMoneda.setText(String.valueOf(conversion.convertir()));
        }
    }

    private void calcularTemperatura(){
        if (validarIngreso(txtIngresoTemperatura)){
            String temperaturaActual = sustraerTexto(deTemperatura.getSelectedItem().toString());
            String temperaturaCambio = sustraerTexto(aTemperatura.getSelectedItem().toString());
            double cantidad = Double.parseDouble(txtIngresoTemperatura.getText());

            Temperatura conversion = new Temperatura();
            conversion.setUnidadActual(temperaturaActual);
            conversion.setUnidadCambio(temperaturaCambio);
            conversion.setCantidad(cantidad);
            lblResultadoTemperatura.setText(String.valueOf(conversion.convertir()));

        }
    }

    private void calcularLongitud(){
        if (validarIngreso(txtIngresoLongitud)){
            String longitudActual = sustraerTexto(deLongitud.getSelectedItem().toString());
            String longitudCambio = sustraerTexto(aLongitud.getSelectedItem().toString());
            double cantidad = Double.parseDouble(txtIngresoLongitud.getText());

            Longitud conversion = new Longitud();
            conversion.setUnidadActual(longitudActual);
            conversion.setUnidadCambio(longitudCambio);
            conversion.setCantidad(cantidad);
            lblResultadoLongitud.setText(String.valueOf(conversion.convertir()));

        }
    }

    private void calcularMasa(){
        if (validarIngreso(txtIngresoMasa)){
            String masaActual = sustraerTexto(deMasa.getSelectedItem().toString());
            String masaCambio = sustraerTexto(aMasa.getSelectedItem().toString());
            double cantidad = Double.parseDouble(txtIngresoMasa.getText());

            Masa conversion = new Masa();
            conversion.setUnidadActual(masaActual);
            conversion.setUnidadCambio(masaCambio);
            conversion.setCantidad(cantidad);
            lblResultadoMasa.setText(String.valueOf(conversion.convertir()));
        }
    }

    private String sustraerTexto(String texto){
        int indice1 = texto.indexOf("(") + 1;
        int indice2 = texto.indexOf(")");
        return texto.substring(indice1, indice2);
    }

    public static void main(String[] args) {
        new Interfaz();
    }


}
