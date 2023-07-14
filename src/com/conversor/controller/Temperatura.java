package com.conversor.controller;

public class Temperatura extends Conversor{

    @Override
    public double convertir() {

        String unidadActual = getUnidadActual();
        String unidadCambio = getUnidadCambio();
        double valor = getCantidad();

        if (unidadActual.equals("C") && unidadCambio.equals("F"))
            return convertirCelsiusAFahrenheit(valor);
        else if (unidadActual.equals("F") && unidadCambio.equals("C"))
            return convertirFahrenheitACelsius(valor);
        else if (unidadActual.equals("C") && unidadCambio.equals("K"))
            return convertirCelsiusAKelvin(valor);
        else if (unidadActual.equals("K") && unidadCambio.equals("C"))
            return convertirKelvinACelsius(valor);
        else if (unidadActual.equals("F") && unidadCambio.equals("K")) {
            double celsius = convertirFahrenheitACelsius(valor);
            return convertirCelsiusAKelvin(celsius);
        } else if (unidadActual.equals("K") && unidadCambio.equals("F")) {
            double celsius = convertirKelvinACelsius(valor);
            return convertirCelsiusAFahrenheit(celsius);
        }  else
            return valor;

    }

    public double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double convertirCelsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertirKelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
