package com.gustavoams.tempconverter;

import com.gustavoams.tempconverter.tools.Temperature;

import java.io.IOException;
import java.util.Scanner;

/**
 * User: gustavomaedo
 * Date: 4/11/20
 * Time: 11:38 PM
 */
public class App {
    Temperature temperature = new Temperature();

    public void initApp() {
        display();
        convert();
        reset();
    }

    private void convert() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String text = input.next();
        String[] split = text.split(" ");
        int last = split.length - 1;
        try {
            float number = Float.parseFloat(split[0]);
            System.out.print(number);
            if(split[last].contains("c")) {
                System.out.println(" Fahrenheit");
                float converted = temperature.fahrenheitToCelsius(number);
                displayConvert(converted, 0);
            } else if(split[last].contains("f")) {
                System.out.println(" Celsius");
                float converted = temperature.celsiusToFahrenheit(number);
                displayConvert(converted, 1);
            } else {
                System.out.println("Sorry, our servers are down, try again later.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Sorry, our servers are down, try again later.");
        }
    }
    private void display() {
        System.out.println("********************");
        System.out.println(" Temperature Converter ");
        System.out.println("********************");
        System.out.println(" ");
        System.out.println("Hello,");
        System.out.println("  how do you want to convert the temperature?");
        System.out.println("Example:");
        System.out.println("  26 celsius to fahrenheit");
        System.out.println(" ");
        System.out.println("********************");
        System.out.println(" ");
    }

    private void displayConvert(float number, int type) {
        System.out.println("We converted it for you:");
        System.out.print("  ");
        System.out.print(number);
        switch (type) {
            case 0:
                System.out.println(" Celsius");
                break;
            case 1:
                System.out.println(" Fahrenheit");
                break;
            default:
                System.out.println(" Unknown");
        }
    }

    private void reset() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Press enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println(" ");
        initApp();
    }
}
