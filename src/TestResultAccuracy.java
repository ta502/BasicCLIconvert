// Note: this file is just a file testing the Converts.java methods to see if they're working, and displaying accurate results.

public class TestResultAccuracy {
    public static void main(String[] args) {
        System.out.println("Comparing the program's conversion results to the actual conversion, testing accuracy.");
        // Testing meters to feet accuracy
        System.out.println("20 meters is 65.6168 feet");
        double programResult1 = Converts.metersToFeet(20);
        System.out.println(programResult1);
        // Testing kilometers to miles accuracy
        System.out.println("7 kilometers are 4.349598 miles");
        double programResult2 = Converts.kilometersToMiles(7);
        System.out.println(programResult2);
        // Testing yards to meters accuracy
        System.out.println("7 yards is 6.4008 meters");
        double programResult3 = Converts.yardsToMeters(7);
        System.out.println(programResult3);
        // Testing kilograms to pounds accuracy
        System.out.println("7 kilograms is 15.43236 pounds");
        double programResult4 = Converts.kilogramsToPounds(7);
        System.out.println(programResult4);
        // Testing ounces to grams accuracy
        System.out.println("8 ounces is 226.7962 grams");
        double programResult5 = Converts.ouncesToGrams(8);
        System.out.println(programResult5);
        // Testing Celsius to Fahrenheit accuracy
        System.out.println("16 celsius is 60.8 fahrenheit");
        double programResult6 = Converts.celsiusToFahrenheit(16);
        System.out.println(programResult6);
        // Testing kelvin to Celsius accuracy
        System.out.println("321 kelvin is 47.85 celsius");
        double programResult7 = Converts.kelvinToCelsius(321);
        System.out.println(programResult7);
        // Testing seconds to minutes accuracy
        System.out.println("90 seconds is minute and a half (1.5 minutes)");
        double programResult8 = Converts.secondsToMinutes(90);
        System.out.println(programResult8);
        // Testing minutes to hours accuracy
        System.out.println("90 minutes is hour and a half (1.5 hours)");
        double programResult9 = Converts.minutesToHours(90);
        System.out.println(programResult9);
        // Testing bytes to kilobytes accuracy
        System.out.println("2048 bytes is 2 kilobytes");
        double programResult10 = Converts.bytesToKilobytes(2048);
        System.out.println(programResult10);
        // Testing kilobytes to megabytes accuracy
        System.out.println("2048 kilobytes is 2 megabytes");
        double programResult11 = Converts.kilobytesToMegabytes(2048);
        System.out.println(programResult11);
        // Testing megabytes to gigabytes accuracy
        System.out.println("5 gigabytes is 5120 megabytes");
        double programResult12 = Converts.megabytesToGigabytes(5120);
        System.out.println(programResult12);
        // Testing binary to decimal accuracy
        System.out.println("binary number 11011011 is 219 in decimal");
        int programResult13 = Converts.binaryToDecimal("11011011");
        System.out.println(programResult13);
    }
}
