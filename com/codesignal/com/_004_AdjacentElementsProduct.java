/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.
*/
package com.codesignal.com;

public class _004_AdjacentElementsProduct {
    public static void main(String[] args) {
        _004_AdjacentElementsProduct obj = new _004_AdjacentElementsProduct();

        TestUtils.testCase(obj::solution, new int[]{3, 6, -2, -5, 7, 3}, 21, 1);
        TestUtils.testCase(obj::solution, new int[]{-1, -2}, 2, 2);
        TestUtils.testCase(obj::solution, new int[]{5, 1, 2, 3, 1, 4}, 6, 3);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 3, 0}, 6, 4);
        TestUtils.testCase(obj::solution, new int[]{9, 5, 10, 2, 24, -1, -48}, 50, 5);
        TestUtils.testCase(obj::solution, new int[]{5, 6, -4, 2, 3, 2, -23}, 30, 6);
        TestUtils.testCase(obj::solution, new int[]{4, 1, 2, 3, 1, 5}, 6, 7);
        TestUtils.testCase(obj::solution, new int[]{-23, 4, -3, 8, -12}, -12, 8);
        TestUtils.testCase(obj::solution, new int[]{1, 0, 1, 0, 1000}, 0, 9);

        TestUtils.printSummary();
    }

    int solution(int[] inputArray) {
        int index = inputArray.length;
        int produc = inputArray[0] * inputArray[1];
        for (int i = 1; i < index - 1; i++) {
            if ((inputArray[i] * inputArray[i + 1]) > produc) {
                produc = inputArray[i] * inputArray[i + 1];
            }
        }
        return produc;
    }
}
