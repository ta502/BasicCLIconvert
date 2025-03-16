public class Converts {
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double bytesToKilobytes(double bytes) {
        return bytes / 1024;
    }

    public static double kilobytesToMegabytes(double kilobytes) {
        return kilobytes / 1024;
    }

    public static double megabytesToGigabytes(double megabytes) {
        return megabytes / 1024;
    }

    public static int binaryToDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum, 2);
    }
}
