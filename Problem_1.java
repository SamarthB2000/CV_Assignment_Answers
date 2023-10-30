import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        // Task A
        System.out.println("Task A:");
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));

        // Task B
        System.out.println("\nTask B:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println("Decimal Value: " + decimalValue);

        // Task C
        System.out.println("\nTask C:");
        System.out.print("Enter a sentence to check for pangram: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    // Function to convert Roman numeral to decimal
    private static int romanToDecimal(String roman) {
        // Implement your logic to convert Roman numeral to decimal here
        // For simplicity, a basic conversion logic is provided
        // You may want to enhance this based on your needs
        int decimalValue = 0;
        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            int currentValue = getValue(currentChar);
            if (i + 1 < roman.length()) {
                int nextValue = getValue(roman.charAt(i + 1));
                if (currentValue < nextValue) {
                    decimalValue -= currentValue;
                } else {
                    decimalValue += currentValue;
                }
            } else {
                decimalValue += currentValue;
            }
        }
        return decimalValue;
    }

    // Helper function to get value of a Roman numeral
    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }

    // Function to check if a sentence is a pangram
    private static boolean isPangram(String sentence) {
        // Assuming ASCII encoding for simplicity
        boolean[] alphabetPresent = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                int index = currentChar - 'a';
                alphabetPresent[index] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
