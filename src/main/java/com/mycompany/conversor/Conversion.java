/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor;

import java.util.Map;

/**
 *
 * @author facuu
 */
public class Conversion {
    private Map<String, Double> valoraciones;
    
    public Conversion(Map<String, Double> valoraciones) {
        this.valoraciones = valoraciones;
    }
    public double convertir(double importe, String monedaOriginal, String monedaDeInteres){
        double valorMonedaOrigen = obtenerValorMoneda(monedaOriginal);
        double valorMonedaDeInteres = obtenerValorMoneda(monedaDeInteres);        
        
        return importe * (valorMonedaDeInteres / valorMonedaOrigen);        
    }

    private double obtenerValorMoneda(String moneda) {
        //Recorre y muestra las valoraciones de las distintas monedas
        for (Map.Entry<String, Double> entry : valoraciones.entrySet()) {
            if (entry.getKey().equals(moneda)) {
                return entry.getValue();
            }
            
//            String key = entry.getKey();
//            Double val = entry.getValue();
//            System.out.println(key + " - " + val);
        }
        return 0;
    }
}
