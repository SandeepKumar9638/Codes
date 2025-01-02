
package sk;
public class Numbers {

    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] thousands = {
            "", "thousand", "million", "billion", "trillion"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "zero";
        }

        int group = 0;
        String words = "";

        do {
            int num = number % 1000;
            if (num != 0) {
                String word = convertLessThanThousand(num);
                words = word + thousands[group] + " " + words;
            }
            group++;
            number /= 1000;
        } while (number > 0);

        return words.trim();
    }

    private static String convertLessThanThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = units[number % 100];
            number /= 100;
        } else {
            current = units[number % 10];
            number /= 10;

            current = tens[number % 10] + " " + current;
            number /= 10;
        }

        if (number == 0) {
            return current;
        }

        return units[number] + " hundred " + current;
    }

    public static void main(String[] args) {
        int number = 400;
        int number1 = 269;
        int number2 = 10002;
        int number3 = 8965742;
        
        System.out.println(number + " in words: " + convert(number));
        System.out.println(number1 + " in words: " + convert(number1));
        System.out.println(number2 + " in words: " + convert(number2));
        System.out.println(number3 + " in words: " + convert(number3));
    }
}



