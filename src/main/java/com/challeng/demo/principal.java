package com.challeng.demo;

import java.util.Scanner;

public class principal {
    
    public static void main(String[] args){

        Scanner challeng = new Scanner(System.in);
        consultaApi api = new consultaApi();
        conversorMoneda conversor = new conversorMoneda();

        System.out.println("\n**************************************");
        System.out.println("\nBienvenido/a al conversor de moneda:");

        System.out.println("1) Dolar --> Peso argentino");
        System.out.println("2) Peso argentino --> Dolar");
        System.out.println("3) Dolar --> Real brasileño");
        System.out.println("4) Real brasileño --> Dolar");
        System.out.println("5) Dolar --> Peso colombiano");
        System.out.println("6) Peso colombiano --> Dolar");
        System.out.println("7) Dolar --> Sol peruano");
        System.out.println("8) Sol peruano --> Dolar");
        System.out.println("9) Salir");

        System.out.println("\n**************************************");

        int opcion;

        do{
            System.out.println("\nElija una opcion valida:");
            opcion = challeng.nextInt();

            switch (opcion) {
                case 1:
                    conversor.convertirMoneda(api, challeng, "USD", "ARS");
                    break;
                case 2:
                    conversor.convertirMoneda(api, challeng, "ARS", "USD");
                    break;           
                case 3:
                    conversor.convertirMoneda(api, challeng, "USD", "BRL");
                    break;
                case 4:
                    conversor.convertirMoneda(api, challeng, "BRL", "USD");
                    break;
                case 5:
                    conversor.convertirMoneda(api, challeng, "USD", "COP");
                    break;
                case 6:
                    conversor.convertirMoneda(api, challeng, "COP", "USD");
                    break;
                case 7:
                    conversor.convertirMoneda(api, challeng, "USD", "PEN");
                    break;
                case 8:
                    conversor.convertirMoneda(api, challeng, "PEN", "USD");
                    break;                
                case 9:
                    System.out.println("Saliendo ...");
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo otra vez");
                    break;
            }
    
        } while( opcion != 9);

    }

    
}
