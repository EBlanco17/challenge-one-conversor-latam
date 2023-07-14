package com.conversor.controller;

public class Longitud extends Conversor{

    @Override
    public double convertir() {

        String unidadActual = getUnidadActual();
        String unidadCambio = getUnidadCambio();
        double valor = getCantidad();

        switch (unidadActual) {
            case "km" -> {
                switch (unidadCambio) {
                    case "m" -> {
                        return valor * 1000;
                    }
                    case "cm" -> {
                        return valor * 100000;
                    }
                    case "mm" -> {
                        return valor * 1000000;
                    }
                    case "mi" -> {
                        return valor * 0.621371;
                    }
                    case "yd" -> {
                        return valor * 1093.61;
                    }
                    case "ft" -> {
                        return valor * 3280.84;
                    }
                    case "in" -> {
                        return valor * 39370.1;
                    }
                    case "nmi" -> {
                        return valor * 0.539957;
                    }
                }
            }
            case "m" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 1000;
                    }
                    case "cm" -> {
                        return valor * 100;
                    }
                    case "mm" -> {
                        return valor * 1000;
                    }
                    case "mi" -> {
                        return valor * 0.000621371;
                    }
                    case "yd" -> {
                        return valor * 1.09361;
                    }
                    case "ft" -> {
                        return valor * 3.28084;
                    }
                    case "in" -> {
                        return valor * 39.3701;
                    }
                    case "nmi" -> {
                        return valor * 0.000539957;
                    }
                }
            }
            case "cm" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 100000;
                    }
                    case "m" -> {
                        return valor / 100;
                    }
                    case "mm" -> {
                        return valor * 10;
                    }
                    case "mi" -> {
                        return valor * 0.0000062137;
                    }
                    case "yd" -> {
                        return valor * 0.0109361;
                    }
                    case "ft" -> {
                        return valor * 0.0328084;
                    }
                    case "in" -> {
                        return valor * 0.393701;
                    }
                    case "nmi" -> {
                        return valor * 0.00000539957;
                    }
                }
            }
            case "mm" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 1000000;
                    }
                    case "m" -> {
                        return valor / 1000;
                    }
                    case "cm" -> {
                        return valor / 10;
                    }
                    case "mi" -> {
                        return valor * 0.00000062137;
                    }
                    case "yd" -> {
                        return valor * 0.00109361;
                    }
                    case "ft" -> {
                        return valor * 0.00328084;
                    }
                    case "in" -> {
                        return valor * 0.0393701;
                    }
                    case "nmi" -> {
                        return valor * 0.000000539957;
                    }
                }
            }
            case "mi" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 0.621371;
                    }
                    case "m" -> {
                        return valor / 0.000621371;
                    }
                    case "cm" -> {
                        return valor / 0.0000062137;
                    }
                    case "mm" -> {
                        return valor / 0.00000062137;
                    }
                    case "yd" -> {
                        return valor * 1760;
                    }
                    case "ft" -> {
                        return valor * 5280;
                    }
                    case "in" -> {
                        return valor * 63360;
                    }
                    case "nmi" -> {
                        return valor / 1.15078;
                    }
                }
            }
            case "yd" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 1093.61;
                    }
                    case "m" -> {
                        return valor / 1.09361;
                    }
                    case "cm" -> {
                        return valor / 0.0109361;
                    }
                    case "mm" -> {
                        return valor / 0.00109361;
                    }
                    case "mi" -> {
                        return valor / 1760;
                    }
                    case "ft" -> {
                        return valor * 3;
                    }
                    case "in" -> {
                        return valor * 36;
                    }
                    case "nmi" -> {
                        return valor / 2025.37;
                    }
                }
            }
            case "ft" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 3280.84;
                    }
                    case "m" -> {
                        return valor / 3.28084;
                    }
                    case "cm" -> {
                        return valor / 0.0328084;
                    }
                    case "mm" -> {
                        return valor / 0.00328084;
                    }
                    case "mi" -> {
                        return valor / 5280;
                    }
                    case "yd" -> {
                        return valor / 3;
                    }
                    case "in" -> {
                        return valor * 12;
                    }
                    case "nmi" -> {
                        return valor / 6076.12;
                    }
                }
            }
            case "in" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 39370.1;
                    }
                    case "m" -> {
                        return valor / 39.3701;
                    }
                    case "cm" -> {
                        return valor / 0.393701;
                    }
                    case "mm" -> {
                        return valor / 0.0393701;
                    }
                    case "mi" -> {
                        return valor / 63360;
                    }
                    case "yd" -> {
                        return valor / 36;
                    }
                    case "ft" -> {
                        return valor / 12;
                    }
                    case "nmi" -> {
                        return valor / 72913.4;
                    }
                }
            }
            case "nmi" -> {
                switch (unidadCambio) {
                    case "km" -> {
                        return valor / 0.539957;
                    }
                    case "m" -> {
                        return valor / 0.000539957;
                    }
                    case "cm" -> {
                        return valor / 0.00000539957;
                    }
                    case "mm" -> {
                        return valor / 0.000000539957;
                    }
                    case "mi" -> {
                        return valor * 1.15078;
                    }
                    case "yd" -> {
                        return valor * 2025.37;
                    }
                    case "ft" -> {
                        return valor * 6076.12;
                    }
                    case "in" -> {
                        return valor * 72913.4;
                    }
                }
            }
        }

        return valor;
    }

}
