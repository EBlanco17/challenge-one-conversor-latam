package com.conversor.controller;

public abstract class Conversor {
    private String unidadActual;
    private String unidadCambio;
    private double cantidad;

    public String getUnidadActual() {
        return unidadActual;
    }

    public void setUnidadActual(String unidadActual) {
        this.unidadActual = unidadActual;
    }

    public String getUnidadCambio() {
        return unidadCambio;
    }

    public void setUnidadCambio(String unidadCambio) {
        this.unidadCambio = unidadCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Conversor() {
    }

    public abstract double convertir();
}
