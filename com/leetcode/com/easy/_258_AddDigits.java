/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2

Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
*/
package com.leetcode.com.easy;

public class _258_AddDigits {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("result = " + addDigits(number));
        System.out.println("result = " + addDigits1(number));
    }

    private static int addDigits1(int num) {
        while (num > 9) {
            num = num / 10 + num % 10;
        }
        return num;
    }

    private static int addDigits(int num) {
        int result = num / 10 + num % 10;
        if (result > 9) {
            return addDigits(result);
        } else {
            return result;
        }
    }
}
