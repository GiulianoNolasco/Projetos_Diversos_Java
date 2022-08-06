package com.mycompany.conversortemperatura;

import java.util.Scanner;

/**
 * Conversor de temperaturas entre Fahrenheit, Celsius e Kelvin.
 * @author Giuliano
 */
public class ConversorTemperatura {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura inicial (Exemplo: 25,50)");
        double temperaturaInicial = scanner.nextDouble();

        System.out.println("Qual a unidade atual? Digite 'F' para farenheit, 'C' para celsius e 'K' para Kelvin.");
        String tipoTemperaturaInicial = scanner.next().toUpperCase();

        System.out.println("Para qual unidade deseja converter? Digite 'F' para farenheit, 'C' para celsius e 'K' para Kelvin.");
        String tipoTemperaturaFinal = scanner.next().toUpperCase();

        double valorConvertido = 0.0;
        String medidaUm = "";
        String medidaDois = "";

        if (tipoTemperaturaInicial.equals("F") && (tipoTemperaturaFinal.equals("C"))) {
            valorConvertido = (Math.round((((temperaturaInicial - 32) * 5 / 9)) * 100.0) / 100.0);
            medidaUm = "°F (Fahrenheit)";
            medidaDois = "C° (Celsius)";
        } else if (tipoTemperaturaInicial.equals("F") && (tipoTemperaturaFinal.equals("K"))) {
            valorConvertido = (Math.round(((temperaturaInicial - 32) * 5 / 9 + 273.15) * 100.0) / 100.0);
            medidaUm = "°F (Fahrenheit)";
            medidaDois = "K (Kelvin)";
        } else if (tipoTemperaturaInicial.equals("C") && (tipoTemperaturaFinal.equals("F"))) {
            valorConvertido = (Math.round(((temperaturaInicial * 9 / 5) + 32) * 100.0) / 100.0);
            medidaUm = "C° (Celsius)";
            medidaDois = "°F (Fahrenheit)";
        } else if (tipoTemperaturaInicial.equals("C") && (tipoTemperaturaFinal.equals("K"))) {
            valorConvertido = (Math.round((temperaturaInicial + 273.15) * 100.0) / 100.0);
            medidaUm = "C° (Celsius)";
            medidaDois = "K (Kelvin)";
        } else if (tipoTemperaturaInicial.equals("K") && (tipoTemperaturaFinal.equals("F"))) {
            valorConvertido = (Math.round(((temperaturaInicial - 273.15) * 9 / 5 + 32) * 100.0) / 100.0);
            medidaUm = "K (Kelvin)";
            medidaDois = "°F (Fahrenheit)";
        } else if (tipoTemperaturaInicial.equals("K") && (tipoTemperaturaFinal.equals("C"))) {
            valorConvertido = (Math.round((temperaturaInicial - 273.15) * 100.0) / 100.0);
            medidaUm = "K (Kelvin)";
            medidaDois = "C° (Celsius)";
        } else {
            System.out.println("Medida de conversão inválida;");
        }

        System.out.println("A temperatura " + temperaturaInicial + medidaUm + " convertida fica " + valorConvertido + medidaDois);

        scanner.close();
    }
}
