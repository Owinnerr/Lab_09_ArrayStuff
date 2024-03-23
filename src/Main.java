import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        final int ARRAY_SIZE = 100; // Create a constant for the size of the array
        int[] dataPoints = new int[ARRAY_SIZE]; // Declare a variable dataPoints and set the length to 100 (ARRAY_SIZE)
        int sum = 0; // Initialize sum variable to calculate average
        int average = 0; // Initialize average variable
        // Part 1
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            dataPoints[i] = gen.nextInt(100) + 1; // Set dataPoints[i] (every character in the array) to a random number between 1 and 100
        }
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            if (i == 99) { // Condition: If i equals to 99 (last character in array),
                System.out.print(dataPoints[i]); // Print dataPoints[i] (this will be the last character in the array, and therefore, there is no need to add a | after it)
            } else {
                System.out.print(dataPoints[i] + " | "); // Print dataPoints[i] + | (each value will be printed and separated by a |)
            }
        }
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            sum += dataPoints[i]; // Set sum to sum + dataPoints[i] (this is to add every element in the array)
        }
        average = sum / ARRAY_SIZE; // Set average to sum divided by ARRAY_SIZE (average of the array)
        System.out.println("\n\nThe sum of all the numbers is: " + sum); // Output the sum of all the numbers in array
        System.out.println("\nThe average of all the numbers is: " + average); // Output the average of all the numbers in array
        // Part 2
        int userInt = SafeInput.getRangedInt(in,"Enter a number between 1 and 100",1,100); // Prompt the user for a number between 1 and 100 and use the getRangedInt method to make sure it is in that range, and set their response as a variable
        int numberOfTimes = 0; // Initialize numberOfTimes variable
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            if (dataPoints[i] == userInt) { // Condition: If dataPoints[i] is equal to the number the user entered,
                numberOfTimes += 1; // Set numberOfTimes to numberOfTimes plus 1 (Whenever the user's number is in the array, it adds one to this variable)
            }
        }
        System.out.println("\n\nYour number, " + userInt + ", was in the array " + numberOfTimes + " times."); // Outputs how many times the user's number was in the array



        userInt = SafeInput.getRangedInt(in,"Enter a number between 1 and 100",1,100); // Prompt the user for a number between 1 and 100 and use the getRangedInt method to make sure it is in that range, and set their response as a variable
        boolean foundTarget = false; // Initialize foundTarget variable
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            if (dataPoints[i] == userInt) { // Condition: If dataPoints[i] is equal to the number the user entered,
                foundTarget = true; // Set foundTarget to true (to indicate that there the user's number is in the array)
                System.out.println("The value " + userInt + " was found at array index " + i); // Output the index where the user's number was first found
                break;
            }
        }
        if (!foundTarget) { // Condition: If not foundTarget (if foundTarget is false)
            System.out.println("The value " + userInt + " was not in the array."); // Output that the user's number was not in the array
        }



        int min = dataPoints[0]; // Initialize min variable and set it to the first character in the array
        int max = dataPoints[0]; // Initialize max variable and set it to the first character in the array
        for(int i = 0; i < dataPoints.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of dataPoints array, repeatedly increase i by 1
            if (min > dataPoints[i]) { // Condition: If min is greater than dataPoints[i] (an element of dataPoints array)
                min = dataPoints[i]; // Set min to dataPoints[i] (update min after there is a new min value)
            }
            if (max < dataPoints[i]) { // Condition: If max is less than dataPoints[i] (an element of dataPoints array)
                max = dataPoints[i]; // Set max to dataPoints[i] (update max after there is a new max value)
            }
        }
        System.out.println("The min is " + min); // Output the min value of the array
        System.out.println("The max is " + max); // Output the max value of the array


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints)); // Output the average of the array using getAverage method
    }
    public static double getAverage(int[] values) {
        double sum = 0; // Initialize sum variable (to calculate average)
        double average = 0; // Initialize average variable
        for(int i = 0; i < values.length; i++) { // Loop: Initialize variable i to 0, set it less than the length of values array, repeatedly increase i by 1
            sum += values[i]; // Set sum to sum + values[i] (this is to add every element in the array)
        }
        average = sum / values.length; // Set average to sum divided by values.length (average of the whole array)
        return average; // Return average
    }
}