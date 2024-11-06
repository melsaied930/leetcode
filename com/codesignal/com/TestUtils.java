package com.codesignal.com;

import java.util.Arrays;
import java.util.function.Function;

public class TestUtils {
    private static int totalTests = 0;
    private static int passedTests = 0;
    private static int failedTests = 0;

    public static <T, R> void testCase(Function<T, R> solutionMethod, T input, R expectedOutput, int testCaseNumber) {
        totalTests++;  // Increment the total number of tests
        R actualOutput = solutionMethod.apply(input);

        boolean isEqual = compareOutputs(expectedOutput, actualOutput); // Use custom comparison
        String status = isEqual ? "Pass" : "Fail";

        if (isEqual) {
            passedTests++;  // Increment passed test count
        } else {
            failedTests++;  // Increment failed test count
        }

        // Display input, expected output, actual output, and status
        System.out.println("Test " + testCaseNumber + ": " + status);
        System.out.println("Input: " + formatInput(input));
        System.out.println("Expected Output: " + formatOutput(expectedOutput));
        System.out.println("Actual Output: " + formatOutput(actualOutput));
        System.out.println();
    }

    // Custom method to compare expected and actual outputs, handling arrays properly
    private static <R> boolean compareOutputs(R expectedOutput, R actualOutput) {
        if (expectedOutput instanceof int[] && actualOutput instanceof int[]) {
            // If both are arrays, compare their contents
            return Arrays.equals((int[]) expectedOutput, (int[]) actualOutput);
        }
        // For non-array types, use equals() method
        return expectedOutput != null && expectedOutput.equals(actualOutput);
    }

    // Format input to handle array types
    private static <T> String formatInput(T input) {
        if (input instanceof int[]) {
            // If the input is a 1D array, use Arrays.toString() to format it
            return Arrays.toString((int[]) input);
        }
        return String.valueOf(input); // For other types of input, use toString()
    }

    // Format output to handle array types
    private static <R> String formatOutput(R output) {
        if (output instanceof int[]) {
            // If the output is a 1D array, use Arrays.toString() to format it
            return Arrays.toString((int[]) output);
        }
        return String.valueOf(output); // For other types of output, use toString()
    }

    // Print summary when all test cases are done
    public static void printSummary() {
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + failedTests);
    }
}
