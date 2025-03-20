// Note: this file is very important, it contains all the conversion functions for the Main.java to work.

public class Converts {
    // Meters to feet function
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Kilometers to miles function
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Yards to meters function
    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    // Kilograms to pounds function
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Ounces to grams function
    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    // Celsius to Fahrenheit function
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Kelvin to Celsius function
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // seconds to minutes function
    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    // minutes to hours function
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // bytes to kilobytes function
    public static double bytesToKilobytes(double bytes) {
        return bytes / 1024;
    }

    // kilobytes to megabytes function
    public static double kilobytesToMegabytes(double kilobytes) {
        return kilobytes / 1024;
    }

    // megabytes to gigabytes function
    public static double megabytesToGigabytes(double megabytes) {
        return megabytes / 1024;
    }

    // binary to decimal function
    public static int binaryToDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum, 2);
    }
}
