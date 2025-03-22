import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create scanner so the program can receive user input, using try-with-resources so it automatically closes
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Welcome to BasicCLIconvert, a simple command-line program to convert units.");
            // Make a loop so the program can run forever until the user inputs 0 to exit
            while (true) {
                System.out.println("Type '0' to exit.");
                System.out.println("What you want to do?");
                System.out.println("Section 1: Length");
                System.out.println("1. Meters to Feet");
                System.out.println("2. Kilometers to Miles");
                System.out.println("3. Yards to Meters");
                System.out.println("4. Meters to Kilometers");
                System.out.println("5. Centimeters to Meters");
                System.out.println("6. Meters to Centimeters");
                System.out.println("7. Millimeters to Meters");
                System.out.println("8. Meters to Millimeters");
                System.out.println("9. Inches to Centimeters");
                System.out.println("10. Centimeters to Inches");
                System.out.println("11. Feet to Meters");
                System.out.println("12. Meters to Yards");
                System.out.println("Section 2: Weight");
                System.out.println("13. Kilograms to Pounds");
                System.out.println("14. Ounces to Grams");
                System.out.println("Section 3: Temperature");
                System.out.println("15. Celsius to Fahrenheit");
                System.out.println("16. Kelvin to Celsius");
                System.out.println("Section 4: Volume");
                System.out.println("17. Liters to Milliliters");
                System.out.println("18. Milliliters to Liters");
                System.out.println("19. Gallons to Liters");
                System.out.println("20. Liters to Gallons");
                System.out.println("21. Pints to Liters");
                System.out.println("22. Liters to Pints");
                System.out.println("Section 5: Area");
                System.out.println("23. Square Meters to Square Kilometers");
                System.out.println("24. Square Kilometers to Square Meters");
                System.out.println("25. Acres to Square Meters");
                System.out.println("26. Square Meters to Acres");
                System.out.println("Section 6: Speed");
                System.out.println("27. Meters per Second to Kilometers per Hour");
                System.out.println("28. Kilometers per Hour to Meters per Second");
                System.out.println("29. Miles per Hour to Kilometers per Hour");
                System.out.println("30. Kilometers per Hour to Miles per Hour");
                System.out.println("Section 7: Time");
                System.out.println("31. Seconds to Minutes");
                System.out.println("32. Minutes to Hours");
                System.out.println("33. Hours to Minutes");
                System.out.println("34. Days to Hours");
                System.out.println("35. Hours to Days");
                System.out.println("Section 8: Data Storage");
                System.out.println("36. Bytes to Kilobytes");
                System.out.println("37. Kilobytes to Megabytes");
                System.out.println("38. Megabytes to Gigabytes");
                System.out.println("Section 9: Number Conversion");
                System.out.println("39. Binary to Decimal");
                // Receive user input
                int userInput = scan.nextInt();
                // Get the user's desired function based on their input
                switch (userInput) {
                    case 0 -> {
                        // Exit the program
                        System.out.println("Info: Exit.");
                        System.exit(0);
                    }
                    case 1 -> {
                        System.out.println("Info: you're converting from meters to feet.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToFeet(userInput2);
                        System.out.println("Result: " + result + " feet");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 2 -> {
                        System.out.println("Info: you're converting from kilometers to miles.");
                        System.out.println("Number of kilometers?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilometersToMiles(userInput2);
                        System.out.println("Result: " + result + " miles");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 3 -> {
                        System.out.println("Info: you're converting from yards to meters.");
                        System.out.println("Number of yards?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.yardsToMeters(userInput2);
                        System.out.println("Result: " + result + " meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 4 -> {
                        System.out.println("Info: you're converting from meters to kilometers.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToKilometers(userInput2);
                        System.out.println("Result: " + result + " kilometers");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 5 -> {
                        System.out.println("Info: you're converting from centimeters to meters.");
                        System.out.println("Number of centimeters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.centimetersToMeters(userInput2);
                        System.out.println("Result: " + result + " meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 6 -> {
                        System.out.println("Info: you're converting from meters to centimeters.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToCentimeters(userInput2);
                        System.out.println("Result: " + result + " centimeters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 7 -> {
                        System.out.println("Info: you're converting from millimeters to meters.");
                        System.out.println("Number of millimeters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.millimetersToMeters(userInput2);
                        System.out.println("Result: " + result + " meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 8 -> {
                        System.out.println("Info: you're converting from meters to millimeters.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToMillimeters(userInput2);
                        System.out.println("Result: " + result + " millimeters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 9 -> {
                        System.out.println("Info: you're converting from inches to centimeters.");
                        System.out.println("Number of inches?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.inchesToCentimeters(userInput2);
                        System.out.println("Result: " + result + " centimeters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 10 -> {
                        System.out.println("Info: you're converting from centimeters to inches.");
                        System.out.println("Number of centimeters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.centimetersToInches(userInput2);
                        System.out.println("Result: " + result + " inches");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 11 -> {
                        System.out.println("Info: you're converting from feet to meters.");
                        System.out.println("Number of feet?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.feetToMeters(userInput2);
                        System.out.println("Result: " + result + " meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 12 -> {
                        System.out.println("Info: you're converting from meters to yards.");
                        System.out.println("Number of meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersToYards(userInput2);
                        System.out.println("Result: " + result + " yards");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 13 -> {
                        System.out.println("Info: you're converting from kilograms to pounds.");
                        System.out.println("Number of kilograms?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilogramsToPounds(userInput2);
                        System.out.println("Result: " + result + " pounds");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 14 -> {
                        System.out.println("Info: you're converting from ounces to grams.");
                        System.out.println("Number of ounces?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.ouncesToGrams(userInput2);
                        System.out.println("Result: " + result + " grams");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 15 -> {
                        System.out.println("Info: you're converting from celsius to fahrenheit.");
                        System.out.println("Number of celsius?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.celsiusToFahrenheit(userInput2);
                        System.out.println("Result: " + result + " fahrenheit");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 16 -> {
                        System.out.println("Info: you're converting from kelvin to celsius.");
                        System.out.println("Number of kelvin?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kelvinToCelsius(userInput2);
                        System.out.println("Result: " + result + " celsius");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 17 -> {
                        System.out.println("Info: you're converting from liters to milliliters.");
                        System.out.println("Number of liters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.litersToMilliliters(userInput2);
                        System.out.println("Result: " + result + " milliliters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 18 -> {
                        System.out.println("Info: you're converting from milliliters to liters.");
                        System.out.println("Number of milliliters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.millilitersToLiters(userInput2);
                        System.out.println("Result: " + result + " liters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 19 -> {
                        System.out.println("Info: you're converting from gallons to liters.");
                        System.out.println("Number of gallons?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.gallonsToLiters(userInput2);
                        System.out.println("Result: " + result + " liters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 20 -> {
                        System.out.println("Info: you're converting from liters to gallons.");
                        System.out.println("Number of liters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.litersToGallons(userInput2);
                        System.out.println("Result: " + result + " gallons");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 21 -> {
                        System.out.println("Info: you're converting from pints to liters.");
                        System.out.println("Number of pints?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.pintsToLiters(userInput2);
                        System.out.println("Result: " + result + " liters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 22 -> {
                        System.out.println("Info: you're converting from liters to pints.");
                        System.out.println("Number of liters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.litersToPints(userInput2);
                        System.out.println("Result: " + result + " pints");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 23 -> {
                        System.out.println("Info: you're converting from square meters to square kilometers.");
                        System.out.println("Number of square meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.squareMetersToSquareKilometers(userInput2);
                        System.out.println("Result: " + result + " square kilometers");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 24 -> {
                        System.out.println("Info: you're converting from square kilometers to square meters.");
                        System.out.println("Number of square kilometers?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.squareKilometersToSquareMeters(userInput2);
                        System.out.println("Result: " + result + " square meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 25 -> {
                        System.out.println("Info: you're converting from acres to square meters.");
                        System.out.println("Number of acres?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.acresToSquareMeters(userInput2);
                        System.out.println("Result: " + result + " square meters");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 26 -> {
                        System.out.println("Info: you're converting from square meters to acres.");
                        System.out.println("Number of square meters?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.squareMetersToAcres(userInput2);
                        System.out.println("Result: " + result + " acres");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 27 -> {
                        System.out.println("Info: you're converting from meters per second to kilometers per hour.");
                        System.out.println("Number of meters per second?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.metersPerSecondToKilometersPerHour(userInput2);
                        System.out.println("Result: " + result + " kilometers per hour");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 28 -> {
                        System.out.println("Info: you're converting from kilometers per hour to meters per second.");
                        System.out.println("Number of kilometers per hour?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilometersPerHourToMetersPerSecond(userInput2);
                        System.out.println("Result: " + result + " meters per second");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 29 -> {
                        System.out.println("Info: you're converting from miles per hour to kilometers per hour.");
                        System.out.println("Number of miles per hour?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.milesPerHourToKilometersPerHour(userInput2);
                        System.out.println("Result: " + result + " kilometers per hour");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 30 -> {
                        System.out.println("Info: you're converting from kilometers per hour to miles per hour.");
                        System.out.println("Number of kilometers per hour?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilometersPerHourToMilesPerHour(userInput2);
                        System.out.println("Result: " + result + " miles per hour");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 31 -> {
                        System.out.println("Info: you're converting from seconds to minutes.");
                        System.out.println("Number of seconds?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.secondsToMinutes(userInput2);
                        System.out.println("Result: " + result + " minutes");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 32 -> {
                        System.out.println("Info: you're converting from minutes to hours.");
                        System.out.println("Number of minutes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.minutesToHours(userInput2);
                        System.out.println("Result: " + result + " hours");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 33 -> {
                        System.out.println("Info: you're converting from hours to minutes.");
                        System.out.println("Number of hours?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.hoursToMinutes(userInput2);
                        System.out.println("Result: " + result + " minutes");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 34 -> {
                        System.out.println("Info: you're converting from days to hours.");
                        System.out.println("Number of days?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.daysToHours(userInput2);
                        System.out.println("Result: " + result + " hours");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 35 -> {
                        System.out.println("Info: you're converting from hours to days.");
                        System.out.println("Number of hours?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.hoursToDays(userInput2);
                        System.out.println("Result: " + result + " days");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 36 -> {
                        System.out.println("Info: you're converting from bytes to kilobytes.");
                        System.out.println("Number of bytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.bytesToKilobytes(userInput2);
                        System.out.println("Result: " + result + " kilobytes");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 37 -> {
                        System.out.println("Info: you're converting from kilobytes to megabytes.");
                        System.out.println("Number of kilobytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.kilobytesToMegabytes(userInput2);
                        System.out.println("Result: " + result + " megabytes");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 38 -> {
                        System.out.println("Info: you're converting from megabytes to gigabytes.");
                        System.out.println("Number of megabytes?");
                        double userInput2 = scan.nextDouble();
                        double result = Converts.megabytesToGigabytes(userInput2);
                        System.out.println("Result: " + result + " gigabytes");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 39 -> {
                        System.out.println("Info: you're converting from binary to decimal.");
                        System.out.println("Binary number?");
                        String userInput2 = scan.next();
                        int result = Converts.binaryToDecimal(userInput2);
                        System.out.println("Result: " + result + " decimal");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    // Throw invalid input exception if the user types incorrect number
                    default -> throw new InputMismatchException();
                }
            }
        } catch (InputMismatchException e) {
            // Catch invalid input
            System.err.println("Input Invalid, Message for more details: " + e.getMessage());
        } catch (InterruptedException e) {
            // Catch interrupted exception
            System.err.println("Interrupted.");
        } catch (NumberFormatException e) {
            // Catch incorrect number format
            System.err.println("Number Invalid, Message for more details: " + e.getMessage());
        }
    }
}