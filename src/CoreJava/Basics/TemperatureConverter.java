package CoreJava.Basics;

import java.util.Scanner;

public class TemperatureConverter {
    public static void convertTemperatureFromCelsius(double temperature) {
        double fahrenheit = (temperature * 9/5) + 32;
        double kelvin = temperature + 273.15;
        System.out.println(temperature + "°C is equal to " + fahrenheit + "°F and " + kelvin + "°K");
    }
    public static void convertTemperatureFromFahrenheit(double temperature) {
        double celsius = (temperature - 32) * 5/9;
        double kelvin = celsius + 273.15;
        System.out.println(temperature + "°F is equal to " + celsius + "°C and " + kelvin + "°K");
    }
    public static void convertTemperatureFromKelvin(double temperature) {
        double celsius = temperature - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(temperature + "K is equal to " + celsius + "°C and " + fahrenheit + "°F");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit/Kelvin");
        System.out.println("2. Kelvin to Celsius/Fahrenheit");
        System.out.println("3. Fahrenheit to Celsius/Kelvin");
        System.out.print("Choose an option (1-3): ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        switch (choice) {
            case 1:
                convertTemperatureFromCelsius(temperature);
                break;
            case 2:
                convertTemperatureFromKelvin(temperature);
                break;
            case 3:
                convertTemperatureFromFahrenheit(temperature);
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 3.");
        }
    }
}
