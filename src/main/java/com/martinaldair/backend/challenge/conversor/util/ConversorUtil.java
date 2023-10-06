package com.martinaldair.backend.challenge.conversor.util;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

/**
* @author Martin_Aldair
*/
public class ConversorUtil {
	 
    /**
     * Declaracion de variables de los tipos de monedas con su cantidad 
     * respectiva
     */
    static Double dolarUS_MX = 17.41;
    static Double eur_MX = 18.67;
    static Double libraEsterlina_MX = 21.93;
    static Double yen_MX = 8.00;
    static Double won_MX = 74.00;
    
    /**
     * Metodo de conversion de divisas
     * @param tipoMoneda
     * @param tipoConversion
     * @param cantidad
     * @return double
     */
    public static Double conversorDivisas (String tipoMoneda, String tipoConversion, 
            Double cantidad) {
        // Tipo de formato del tipo de dato double
        DecimalFormat dFormat = new DecimalFormat("#.##");
        // Declaracion de variable
        Double moneda = null;
        // Eleccion de moneda
        switch(tipoMoneda){
            // Moneda Peso mx
            case "mx":
                switch(tipoConversion){
                    // Conversion peso a dolar
                    case "usa":
                        moneda = cantidad * dolarUS_MX;
                        break;
                    // Conversion peso a euro
                    case "eur":
                        moneda = cantidad * eur_MX;
                        break;
                    // Conversion peso a euro
                    case "gbp":
                        moneda = cantidad * libraEsterlina_MX;
                        break;
                     // Conversion peso a yen
                    case "yen":
                        moneda = cantidad * yen_MX;
                        break;
                    // Conversion peso a won
                    case "won":
                       moneda = cantidad * won_MX;
                       break;
                }
                break;
            // Moneda Dolar Estadounidense
            case "usa":
                switch(tipoConversion){
                    // Conversion dolar us a peso mx
                    case "mx":
                        moneda = cantidad / dolarUS_MX;
                        break;
                }
                break;
            // Moneda Euro
            case "eur":
                switch(tipoConversion){
                    // Conversion euro a peso mx
                    case "mx":
                        moneda = cantidad / eur_MX;
                        break;
                }
                break;
            // Moneda Euro
            case "gbp":
                switch(tipoConversion){
                    // Conversion libra esterlina a peso mx
                    case "mx":
                        moneda = cantidad / libraEsterlina_MX;
                        break;
                }
                break;
            // Moneda Yen Japones
            case "yen":
                switch(tipoConversion){
                    // Conversion yen japones a peso mx
                    case "mx":
                        moneda = cantidad / yen_MX;
                        break;
                }
                break;
            // Moneda Won Coreano
            case "won":
                switch(tipoConversion){
                    // Conversion won coreano a peso mx
                    case "mx":
                        moneda = cantidad / won_MX;
                        break;
                }
                break;
        }
        // Conversion del formato del tipo de dato double
        return Double.valueOf(dFormat.format(moneda));
    }
    
    /*
     * Metodo de validadacion de tipo numerico
     **/
    public static Boolean validarInput(String inputMoneda){
        Boolean isValido = Pattern.compile("[0-9.]+").matcher(inputMoneda).matches();
        return isValido;
    }
    
}
