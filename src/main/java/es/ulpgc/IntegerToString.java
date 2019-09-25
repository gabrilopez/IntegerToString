package es.ulpgc;

public class IntegerToString {

    public static String of(int number) {
        int numberOfDigits = ("" + number).length();
        switch(numberOfDigits) {
            case 1:
                return units(number);
            case 2:
                return tens(number);
            case 3:
                return hundred(number);
            case 4:
            case 5:
            case 6:
                return thousand(number);
            case 7:
            case 8:
            case 9:
                return million(number);
        }
        return "";
    }

    private static String units(int index) {
        String [] oneDigitName= {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        return oneDigitName[index];
    }

    private static String tens(int number) {
        int numberOfTens = number/10;
        int numberOfUnits = number % 10;
        switch(numberOfTens){
            case 1:
                String [] oneTenName = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
                return oneTenName[number-10];
            case 2:
                return (number == 20) ? "twenty" : "twenty-" + units(numberOfUnits);
            case 3:
                return (number == 30) ? "thirty" : "thirty-" + units(numberOfUnits);
            case 4:
                return (number == 40) ? "forty" : "forty-" + units(numberOfUnits);
            case 5:
                return (number == 50) ? "fifty" : "fifty-" + units(numberOfUnits);
            case 6:
                return (number == 60) ? "sixty" : "sixty-" + units(numberOfUnits);
            case 7:
                return (number == 70) ? "seventy" : "seventy-" + units(numberOfUnits);
            case 8:
                return (number == 80) ? "eighty" : "eighty-" + units(numberOfUnits);
            case 9:
                return (number == 90) ? "ninety" : "ninety-" + units(numberOfUnits);
        }
        return "";
    }

    private static String hundred(int number) {
        int numberOfHundreds = number/100;
        String hundredString = units(numberOfHundreds) + " hundred";
        return (number%100 == 0) ? hundredString : hundredString + " " + of(number - (numberOfHundreds*100));
    }

    private static String thousand(int number) {
        int numberOfThousands = number/1000;
        String thousandString = of(numberOfThousands) + " thousand";
        return (number%1000 == 0) ? thousandString : thousandString + " " + of(number - (numberOfThousands*1000));
    }

    private static String million(int number) {
        int numberOfMillions = number/1000000;
        String millionString = of(numberOfMillions) + " million";
        return (number%1000000 == 0) ? millionString : millionString + " " + of(number - (numberOfMillions*1000000));
    }
}
