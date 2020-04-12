package com.gustavoams.tempconverter.tools;

/**
 * User: gustavomaedo
 * Date: 4/11/20
 * Time: 11:34 PM
 */
public class Temperature {

    public float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
