package com.conversor.controller;

public class Masa extends Conversor{

    @Override
    public double convertir() {

        String unidadActual = getUnidadActual();
        String unidadCambio = getUnidadCambio();
        double valor = getCantidad();

        if (unidadActual.equals("g")) {
            if (unidadCambio.equals("dag")) {
                return valor * 0.1;
            } else if (unidadCambio.equals("hg")) {
                return valor * 0.01;
            } else if (unidadCambio.equals("kg")) {
                return valor * 0.001;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.000001;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 0.035274;
            } else if (unidadCambio.equals("lb")) {
                return valor * 0.00220462;
            }
        } else if (unidadActual.equals("dag")) {
            if (unidadCambio.equals("g")) {
                return valor * 10;
            } else if (unidadCambio.equals("hg")) {
                return valor * 0.1;
            } else if (unidadCambio.equals("kg")) {
                return valor * 0.01;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.00001;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 0.35274;
            } else if (unidadCambio.equals("lb")) {
                return valor * 0.0220462;
            }
        } else if (unidadActual.equals("hg")) {
            if (unidadCambio.equals("g")) {
                return valor * 100;
            } else if (unidadCambio.equals("dag")) {
                return valor * 10;
            } else if (unidadCambio.equals("kg")) {
                return valor * 0.1;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.0001;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 3.5274;
            } else if (unidadCambio.equals("lb")) {
                return valor * 0.220462;
            }
        } else if (unidadActual.equals("kg")) {
            if (unidadCambio.equals("g")) {
                return valor * 1000;
            } else if (unidadCambio.equals("dag")) {
                return valor * 100;
            } else if (unidadCambio.equals("hg")) {
                return valor * 10;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.001;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 35.274;
            } else if (unidadCambio.equals("lb")) {
                return valor * 2.20462;
            }
        } else if (unidadActual.equals("t")) {
            if (unidadCambio.equals("g")) {
                return valor * 1000000;
            } else if (unidadCambio.equals("dag")) {
                return valor * 100000;
            } else if (unidadCambio.equals("hg")) {
                return valor * 10000;
            } else if (unidadCambio.equals("kg")) {
                return valor * 1000;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 35274;
            } else if (unidadCambio.equals("lb")) {
                return valor * 2204.62;
            }
        } else if (unidadActual.equals("Oz")) {
            if (unidadCambio.equals("g")) {
                return valor * 28.3495;
            } else if (unidadCambio.equals("dag")) {
                return valor * 2.83495;
            } else if (unidadCambio.equals("hg")) {
                return valor * 0.283495;
            } else if (unidadCambio.equals("kg")) {
                return valor * 0.0283495;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.0000283495;
            } else if (unidadCambio.equals("lb")) {
                return valor * 0.0625;
            }
        } else if (unidadActual.equals("lb")) {
            if (unidadCambio.equals("g")) {
                return valor * 453.592;
            } else if (unidadCambio.equals("dag")) {
                return valor * 45.3592;
            } else if (unidadCambio.equals("hg")) {
                return valor * 4.53592;
            } else if (unidadCambio.equals("kg")) {
                return valor * 0.453592;
            } else if (unidadCambio.equals("t")) {
                return valor * 0.000453592;
            } else if (unidadCambio.equals("Oz")) {
                return valor * 16;
            }
        }

        return valor;
    }
}
