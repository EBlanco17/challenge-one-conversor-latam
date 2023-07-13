package com.conversor.controller;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.format;
public class MonedaConversor {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/2ae16c2925a85f91f51b9bbb/pair/";

    private String monedaActual;
    private String monedaCambio;
    private double cantidad;

    public String getMonedaActual() {
        return monedaActual;
    }

    public void setMonedaActual(String monedaActual) {
        this.monedaActual = monedaActual;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public void setMonedaCambio(String monedaCambio) {
        this.monedaCambio = monedaCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public MonedaConversor(String monedaActual, String monedaCambio, double cantidad) {
        this.monedaActual = monedaActual;
        this.monedaCambio = monedaCambio;
        this.cantidad = cantidad;
    }
    public Double cambioMoneda() {
        double resultado = 0;
        try {
            String exchangeRateData = convertCurrency();

            JSONObject json = new JSONObject(exchangeRateData);
            resultado = json.getDouble("conversion_result");


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return resultado;
    }
    private String convertCurrency() throws IOException {
        String apiUrl = format("%s/%s/%s/%s", API_URL, this.monedaActual, this.monedaCambio, this.cantidad);
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }
}
