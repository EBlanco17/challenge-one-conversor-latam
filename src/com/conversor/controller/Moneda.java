package com.conversor.controller;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.format;
public class Moneda extends Conversor {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/2ae16c2925a85f91f51b9bbb/pair/";

    public Moneda() {
        super();
    }

    @Override
    public double convertir() {
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
        String apiUrl = format("%s/%s/%s/%s", API_URL, getUnidadActual(), getUnidadCambio(), getCantidad());
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
