import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Welcome to BasicCLIconvert, a simple command-line program to convert units.");
            while (true) {
                System.out.println("Type '0' to exit.");
                System.out.println("What you want to do?");
                System.out.println("Section 1: Length");
                System.out.println("1. Meters to Feet");
                System.out.println("2. Kilometers to Miles");
                System.out.println("3. Yards to Meters");
                System.out.println("Section 2: Weight");
                System.out.println("4. Kilograms to Pounds");
                System.out.println("5. Ounces to Grams");
                System.out.println("Section 3: Temperature");
                System.out.println("6. Celsius to Fahrenheit");
                System.out.println("7. Kelvin to Celsius");
                System.out.println("Section 4: Time");
                System.out.println("8. Seconds to Minutes");
                System.out.println("9. Minutes to Hours");
                System.out.println("Section 5: Data Storage");
                System.out.println("10. Bytes to Kilobytes");
                System.out.println("11. Kilobytes to Megabytes");
                System.out.println("12. Megabytes to Gigabytes");
                int userInput = scan.nextInt();
                switch (userInput) {
                    case 0 -> {
                        System.out.println("Info: Exit.");
                        System.exit(0);
                    }
                    case 1 -> {
                        System.out.println("Info: you're converting from meters to feet.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToFeet(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 2 -> {
                        System.out.println("Info: you're converting from kilometers to miles.");
                        System.out.println("Number of kilometers?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilometersToMiles(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 3 -> {
                        System.out.println("Info: you're converting from yards to meters.");
                        System.out.println("Number of yards?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.yardsToMeters(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 4 -> {
                        System.out.println("Info: you're converting from kilograms to pounds.");
                        System.out.println("Number of kilograms?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilogramsToPounds(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 5 -> {
                        System.out.println("Info: you're converting from ounces to grams.");
                        System.out.println("Number of ounces?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.ouncesToGrams(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 6 -> {
                        System.out.println("Info: you're converting from celsius to fahrenheit.");
                        System.out.println("Number of celsius?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.celsiusToFahrenheit(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 7 -> {
                        System.out.println("Info: you're converting from kelvin to celsius.");
                        System.out.println("Number of kelvin?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kelvinToCelsius(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 8 -> {
                        System.out.println("Info: you're converting from seconds to minutes.");
                        System.out.println("Number of seconds?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.secondsToMinutes(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 9 -> {
                        System.out.println("Info: you're converting from minutes to hours.");
                        System.out.println("Number of minutes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.minutesToHours(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 10 -> {
                        System.out.println("Info: you're converting from bytes to kilobytes.");
                        System.out.println("Number of bytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.bytesToKilobytes(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 11 -> {
                        System.out.println("Info: you're converting from kilobytes to megabytes.");
                        System.out.println("Number of kilobytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilobytesToMegabytes(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 12 -> {
                        System.out.println("Info: you're converting from megabytes to gigabytes.");
                        System.out.println("Number of megabytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.megabytesToGigabytes(userInput2);
                        System.out.println("Result: " + result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    default -> throw new InputMismatchException();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Invalid, Message for more details: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
    }
}