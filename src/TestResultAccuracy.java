// Note: this file is just a file testing the Converts.java methods to see if they're working, and displaying accurate results.

public class TestResultAccuracy {
    public static void main(String[] args) {
        System.out.println("Comparing the program's conversion results to the actual conversion, testing accuracy.");

        // Section 1: Length
        // 1. Meters to Feet
        System.out.println("20 meters is 65.6168 feet");
        double programResult1 = Converts.metersToFeet(20);
        System.out.println("Program Result: " + programResult1);

        // 2. Kilometers to Miles
        System.out.println("7 kilometers is 4.3496 miles");
        double programResult2 = Converts.kilometersToMiles(7);
        System.out.println("Program Result: " + programResult2);

        // 3. Yards to Meters
        System.out.println("7 yards is 6.4008 meters");
        double programResult3 = Converts.yardsToMeters(7);
        System.out.println("Program Result: " + programResult3);

        // 4. Meters to Kilometers
        System.out.println("5000 meters is 5 kilometers");
        double programResult4 = Converts.metersToKilometers(5000);
        System.out.println("Program Result: " + programResult4);

        // 5. Centimeters to Meters
        System.out.println("250 centimeters is 2.5 meters");
        double programResult5 = Converts.centimetersToMeters(250);
        System.out.println("Program Result: " + programResult5);

        // 6. Meters to Centimeters
        System.out.println("2.5 meters is 250 centimeters");
        double programResult6 = Converts.metersToCentimeters(2.5);
        System.out.println("Program Result: " + programResult6);

        // 7. Millimeters to Meters
        System.out.println("5000 millimeters is 5 meters");
        double programResult7 = Converts.millimetersToMeters(5000);
        System.out.println("Program Result: " + programResult7);

        // 8. Meters to Millimeters
        System.out.println("5 meters is 5000 millimeters");
        double programResult8 = Converts.metersToMillimeters(5);
        System.out.println("Program Result: " + programResult8);

        // 9. Inches to Centimeters
        System.out.println("10 inches is 25.4 centimeters");
        double programResult9 = Converts.inchesToCentimeters(10);
        System.out.println("Program Result: " + programResult9);

        // 10. Centimeters to Inches
        System.out.println("25.4 centimeters is 10 inches");
        double programResult10 = Converts.centimetersToInches(25.4);
        System.out.println("Program Result: " + programResult10);

        // 11. Feet to Meters
        System.out.println("10 feet is 3.048 meters");
        double programResult11 = Converts.feetToMeters(10);
        System.out.println("Program Result: " + programResult11);

        // 12. Meters to Yards
        System.out.println("10 meters is 10.9361 yards");
        double programResult12 = Converts.metersToYards(10);
        System.out.println("Program Result: " + programResult12);

        // Section 2: Weight
        // 13. Kilograms to Pounds
        System.out.println("7 kilograms is 15.4324 pounds");
        double programResult13 = Converts.kilogramsToPounds(7);
        System.out.println("Program Result: " + programResult13);

        // 14. Ounces to Grams
        System.out.println("8 ounces is 226.796 grams");
        double programResult14 = Converts.ouncesToGrams(8);
        System.out.println("Program Result: " + programResult14);

        // Section 3: Temperature
        // 15. Celsius to Fahrenheit
        System.out.println("16 celsius is 60.8 fahrenheit");
        double programResult15 = Converts.celsiusToFahrenheit(16);
        System.out.println("Program Result: " + programResult15);

        // 16. Kelvin to Celsius
        System.out.println("321 kelvin is 47.85 celsius");
        double programResult16 = Converts.kelvinToCelsius(321);
        System.out.println("Program Result: " + programResult16);

        // Section 4: Volume
        // 17. Liters to Milliliters
        System.out.println("5 liters is 5000 milliliters");
        double programResult17 = Converts.litersToMilliliters(5);
        System.out.println("Program Result: " + programResult17);

        // 18. Milliliters to Liters
        System.out.println("5000 milliliters is 5 liters");
        double programResult18 = Converts.millilitersToLiters(5000);
        System.out.println("Program Result: " + programResult18);

        // 19. Gallons to Liters
        System.out.println("5 gallons is 18.9271 liters");
        double programResult19 = Converts.gallonsToLiters(5);
        System.out.println("Program Result: " + programResult19);

        // 20. Liters to Gallons
        System.out.println("18.9271 liters is 5 gallons");
        double programResult20 = Converts.litersToGallons(18.9271);
        System.out.println("Program Result: " + programResult20);

        // 21. Pints to Liters
        System.out.println("10 pints is 4.73176 liters");
        double programResult21 = Converts.pintsToLiters(10);
        System.out.println("Program Result: " + programResult21);

        // 22. Liters to Pints
        System.out.println("4.73176 liters is 10 pints");
        double programResult22 = Converts.litersToPints(4.73176);
        System.out.println("Program Result: " + programResult22);

        // Section 5: Area
        // 23. Square Meters to Square Kilometers
        System.out.println("500000 square meters is 0.5 square kilometers");
        double programResult23 = Converts.squareMetersToSquareKilometers(500000);
        System.out.println("Program Result: " + programResult23);

        // 24. Square Kilometers to Square Meters
        System.out.println("0.5 square kilometers is 500000 square meters");
        double programResult24 = Converts.squareKilometersToSquareMeters(0.5);
        System.out.println("Program Result: " + programResult24);

        // 25. Acres to Square Meters
        System.out.println("5 acres is 20234.3 square meters");
        double programResult25 = Converts.acresToSquareMeters(5);
        System.out.println("Program Result: " + programResult25);

        // 26. Square Meters to Acres
        System.out.println("20234.3 square meters is 5 acres");
        double programResult26 = Converts.squareMetersToAcres(20234.3);
        System.out.println("Program Result: " + programResult26);

        // Section 6: Speed
        // 27. Meters per Second to Kilometers per Hour
        System.out.println("10 meters per second is 36 kilometers per hour");
        double programResult27 = Converts.metersPerSecondToKilometersPerHour(10);
        System.out.println("Program Result: " + programResult27);

        // 28. Kilometers per Hour to Meters per Second
        System.out.println("36 kilometers per hour is 10 meters per second");
        double programResult28 = Converts.kilometersPerHourToMetersPerSecond(36);
        System.out.println("Program Result: " + programResult28);

        // 29. Miles per Hour to Kilometers per Hour
        System.out.println("60 miles per hour is 96.5606 kilometers per hour");
        double programResult29 = Converts.milesPerHourToKilometersPerHour(60);
        System.out.println("Program Result: " + programResult29);

        // 30. Kilometers per Hour to Miles per Hour
        System.out.println("96.5606 kilometers per hour is 60 miles per hour");
        double programResult30 = Converts.kilometersPerHourToMilesPerHour(96.5606);
        System.out.println("Program Result: " + programResult30);

        // Section 7: Time
        // 31. Seconds to Minutes
        System.out.println("90 seconds is 1.5 minutes");
        double programResult31 = Converts.secondsToMinutes(90);
        System.out.println("Program Result: " + programResult31);

        // 32. Minutes to Hours
        System.out.println("90 minutes is 1.5 hours");
        double programResult32 = Converts.minutesToHours(90);
        System.out.println("Program Result: " + programResult32);

        // 33. Hours to Minutes
        System.out.println("1.5 hours is 90 minutes");
        double programResult33 = Converts.hoursToMinutes(1.5);
        System.out.println("Program Result: " + programResult33);

        // 34. Days to Hours
        System.out.println("2 days is 48 hours");
        double programResult34 = Converts.daysToHours(2);
        System.out.println("Program Result: " + programResult34);

        // 35. Hours to Days
        System.out.println("48 hours is 2 days");
        double programResult35 = Converts.hoursToDays(48);
        System.out.println("Program Result: " + programResult35);

        // Section 8: Data Storage
        // 36. Bytes to Kilobytes
        System.out.println("2048 bytes is 2 kilobytes");
        double programResult36 = Converts.bytesToKilobytes(2048);
        System.out.println("Program Result: " + programResult36);

        // 37. Kilobytes to Megabytes
        System.out.println("2048 kilobytes is 2 megabytes");
        double programResult37 = Converts.kilobytesToMegabytes(2048);
        System.out.println("Program Result: " + programResult37);

        // 38. Megabytes to Gigabytes
        System.out.println("2048 megabytes is 2 gigabytes");
        double programResult38 = Converts.megabytesToGigabytes(2048);
        System.out.println("Program Result: " + programResult38);

        // Section 9: Number Conversion
        // 39. Binary to Decimal
        System.out.println("Binary number 11011011 is 219 in decimal");
        int programResult39 = Converts.binaryToDecimal("11011011");
        System.out.println("Program Result: " + programResult39);
    }
}