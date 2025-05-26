/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversor;

import java.util.Scanner;

/**
 *
 * @author facuu
 */
public class ConversorDeMonedas {

    private static Scanner entrada = new Scanner(System.in);
    private static ConsultarMonedas consulta = new ConsultarMonedas();
    private static Valoracion valoracion = consulta.buscarValoracion();
    private static Conversion conversion = new Conversion(valoracion.conversionRates());

    public static void main(String[] args) {

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("******************************************");
            System.out.println("""
                           Sea bienvenido/a al conversor de monedas - 
                           
                           1 - Dolar -> Peso Argentino
                           2 - Peso Argentino -> Dolar
                           3 - Dolar -> Real
                           4 - Real -> Dolar
                           5 - Dolar -> Peso Colombiano
                           6 - Peso Colombiano -> Dolar
                           0 - Finalizar                   
                            """);
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println("******************************************");

            switch (opcion) {
                case 1 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[USD] corresponde al valor final de "
                            + conversion.convertir(importe, "USD", "ARS") + "[ARS]");
                }
                case 2 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[ARS] corresponde al valor final de "
                            + conversion.convertir(importe, "ARS", "USD") + "[USD]");
                }
                case 3 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[USD] corresponde al valor final de "
                            + conversion.convertir(importe, "USD", "BRL") + "[BRL]");
                }
                case 4 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[BRL] corresponde al valor final de "
                            + conversion.convertir(importe, "BRL", "USD") + "[USD]");
                }
                case 5 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[USD] corresponde al valor final de "
                            + conversion.convertir(importe, "USD", "COP") + "[COP]");
                }
                case 6 -> {
                    double importe = ingresarImporte();
                    System.out.println("El valor " + importe + "[COP] corresponde al valor final de "
                            + conversion.convertir(importe, "COP", "USD") + "[USD]");
                }
                case 0 ->
                    System.out.println("Fin de la aplicacion.");
                default ->
                    System.out.println("Ingrese una opcion valida.");
            }

        }
    }

    public static double ingresarImporte() {
        try {
            System.out.print("Ingrese el importe a convertir: ");
            return Double.parseDouble(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un valor numerico. " + e.getMessage());
        }
        return 0;
    }
}
