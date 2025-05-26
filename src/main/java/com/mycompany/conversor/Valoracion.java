/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.mycompany.conversor;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/**
 *
 * @author facuu
 */
public record Valoracion(
    @SerializedName("conversion_rates")
    Map<String, Double> conversionRates) {

}
