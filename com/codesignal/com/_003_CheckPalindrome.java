/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
*/
package com.codesignal.com;

public class _003_CheckPalindrome {
    public static void main(String[] args) {
        _003_CheckPalindrome obj = new _003_CheckPalindrome();

        TestUtils.testCase(obj::solution, "aabaa", true, 1);
        TestUtils.testCase(obj::solution, "abac", false, 2);
        TestUtils.testCase(obj::solution, "a", true, 3);
        TestUtils.testCase(obj::solution, "az", false, 4);
        TestUtils.testCase(obj::solution, "abacaba", true, 5);
        TestUtils.testCase(obj::solution, "z", true, 6);
        TestUtils.testCase(obj::solution, "aaabaaaa", false, 7);
        TestUtils.testCase(obj::solution, "zzzazzazz", false, 8);
        TestUtils.testCase(obj::solution, "hlbeeykoqqqqokyeeblh", true, 9);
        TestUtils.testCase(obj::solution, "hlbeeykoqqqokyeeblh", true, 10);
    }

     boolean solution(String inputString) {
        char[] characters = inputString.toCharArray();
        for (int i = 0; i < (characters.length / 2); i++) {
            if (characters[i] != characters[characters.length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }
}
