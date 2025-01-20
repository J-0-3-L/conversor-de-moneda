package com.challeng.demo;

import java.util.Scanner;

public class conversorMoneda {

    public void convertirMoneda( consultaApi api, Scanner scanner , String monedaOrigen, String monedaDestino) {

        System.out.print("Ingrese la cantidad que desea convertir:");
        double cantidad = scanner.nextDouble();

        try {
            double tasa = api.obtenerCambioMoneda(monedaOrigen, monedaDestino);
            double resultado = cantidad * tasa;
            System.out.printf("El valor %.1f %s corresponde al valor final de --> %.2f %s%n", cantidad, monedaOrigen, resultado, monedaDestino);
        } catch (RuntimeException e) {
            System.out.println("Error en la conversión: " + e.getMessage());
        }
    }
}
