package dev.alphacybersec.alura.challenge2.conversor.service;

import dev.alphacybersec.alura.challenge2.conversor.entity.Moneda;
import dev.alphacybersec.alura.challenge2.conversor.entity.Monedas;

import java.util.Scanner;

public class MonedaService {


    public void menuConversorMonedas() {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido al conversor de monedas basado en el Dólar ");

        int moneda = 0;
        do {

            System.out.println("Ingrese la moneda que desea convertir");
            System.out.println("1.Euro");
            System.out.println("2.Libra Esterlina");
            System.out.println("3.Yen Japonés");
            System.out.println("4.Won sul-coreano");
            System.out.println("5.** Salir del conversor ** ");

            try {
                moneda = input.nextInt();
                if (moneda < 1 || moneda > 5) {
                    throw new Exception("Ingrese una opción del 1 al 5");
                } else if (moneda == 5) {
                    System.out.println("Saliendo del conversor de monedas");
                    break;
                } else {
                    Moneda resultado = conversion(moneda);
                    System.out.println("--------------------------------------------");
                    System.out.println("|   Resumen de la Conversión de Monedas    |");
                    System.out.println("--------------------------------------------");
                    System.out.println(resultado);
                    System.out.println("--------------------------------------------");
                    System.out.println("Tipo de cambio actualizado el 07/04/2023");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (moneda != 5);

    }

    private Moneda conversion(int moneda){

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        moneda = moneda - 1;

        Moneda monedaConversion = new Moneda();

        double conversion = 0;
        double cantidad = 0;
        int opcion;
    do {
        System.out.println("Ingrese la opción numérica que aplica");
        System.out.println("1.Convertir de " + Monedas.values()[moneda].getMONEDA() + " a Dólar");
        System.out.println("2.Convertir de Dólar a " + Monedas.values()[moneda].getMONEDA());
        opcion = input.nextInt();

        try {

            if (opcion < 1 || opcion > 2) {
                throw new Exception("Ingrese una opción válida");
            }else if (opcion ==1){
                System.out.println("Escogió la conversión de " + Monedas.values()[moneda].getMONEDAPLURAL() + " a Dólares");
                System.out.println("Ingrese la cantidad a convertir");
                System.out.print(Monedas.values()[moneda].getMONEDASIMBOLO() +" ");
            }else{
                System.out.println("Escogió la conversión de Dólares a " + Monedas.values()[moneda].getMONEDAPLURAL());
                System.out.println("Ingrese la cantidad a convertir");
                System.out.print("$ ");
            }

            cantidad = input.nextDouble();
            if (cantidad <= 0) {
                throw new Exception("La cantidad no puede ser cero o menor a cero");
            }

            conversion = opcion ==1? cantidad * Monedas.values()[moneda].getVALORMONEDAUSD(): cantidad * Monedas.values()[moneda].getVALORUSDMONEDA();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }while(opcion < 1 || opcion > 2 || cantidad <= 0 );
        monedaConversion.setNombreMoneda(Monedas.values()[moneda].getMONEDA());
        monedaConversion.setCantidadConvertir(cantidad);
        monedaConversion.setConversion(conversion);
        monedaConversion.setTipoConversion(opcion);

        return monedaConversion;


    }
}
