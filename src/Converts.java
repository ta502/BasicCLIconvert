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

    // Seconds to minutes function
    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    // Minutes to hours function
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // Bytes to kilobytes function
    public static double bytesToKilobytes(double bytes) {
        return bytes / 1024;
    }

    // Kilobytes to megabytes function
    public static double kilobytesToMegabytes(double kilobytes) {
        return kilobytes / 1024;
    }

    // Megabytes to gigabytes function
    public static double megabytesToGigabytes(double megabytes) {
        return megabytes / 1024;
    }

    // Binary to decimal function
    public static int binaryToDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum, 2);
    }

    // Meters to kilometers function
    public static double metersToKilometers(double meters) {
        return meters * 0.001;
    }

    // Centimeters to meters function
    public static double centimetersToMeters(double centimeters) {
        return centimeters * 0.01;
    }

    // Meters to centimeters function
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    // Feet to meters function
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Millimeters to meters function
    public static double millimetersToMeters(double millimeters) {
        return millimeters * 0.001;
    }

    // Meters to millimeters function
    public static double metersToMillimeters(double meters) {
        return meters * 1000;
    }

    // Inches to centimeters function
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Centimeters to inches function
    public static double centimetersToInches(double centimeters) {
        return centimeters * 0.393701;
    }

    // Meters to yards function
    public static double metersToYards(double meters) {
        return meters * 1.09361;
    }

    // Gallons to liters function
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Liters to gallons function
    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Pints to liters function
    public static double pintsToLiters(double pints) {
        return pints * 0.473176;
    }

    // Liters to pints function
    public static double litersToPints(double liters) {
        return liters * 2.11338;
    }
    // Meters per second to kilometers per hour function
    public static double metersPerSecondToKilometersPerHour(double mps) {
        return mps * 3.6;
    }

    // Kilometers per hour to meters per second function
    public static double kilometersPerHourToMetersPerSecond(double kph) {
        return kph * 0.277778;
    }

    // Miles per hour to kilometers per hour function
    public static double milesPerHourToKilometersPerHour(double mph) {
        return mph * 1.60934;
    }

    // Kilometers per hour to miles per hour function
    public static double kilometersPerHourToMilesPerHour(double kph) {
        return kph * 0.621371;
    }

    // Square meters to square kilometers function
    public static double squareMetersToSquareKilometers(double m2) {
        return m2 * 0.000001;
    }

    // Square kilometers to square meters function
    public static double squareKilometersToSquareMeters(double km2) {
        return km2 * 1000000;
    }

    // Acres to square meters function
    public static double acresToSquareMeters(double acres) {
        return acres * 4046.86;
    }

    // Square meters to acres function
    public static double squareMetersToAcres(double m2) {
        return m2 * 0.000247105;
    }

    // Hours to minutes function
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    // Days to hours function
    public static double daysToHours(double days) {
        return days * 24;
    }

    // Hours to days function
    public static double hoursToDays(double hours) {
        return hours / 24;
    }

    // Millimeters to Liters function
    public static double millilitersToLiters(double milliliters) {
        return milliliters / 1000.0;
    }

    // Liters to Milliliters function
    public static double litersToMilliliters(double liters) {
        return liters * 1000.0;
    }
}