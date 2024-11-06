package com.leetcode.com.easy;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
public class _013_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] input = s.toCharArray();
        char preceeding = ' ';
        for (int i = input.length - 1; i >= 0; i--) {
            switch (input[i]) {
                case 'I':
                    if (preceeding == 'V' || preceeding == 'X')
                        result -= 1;
                    else
                        result += 1;
                    break;
                case 'X':
                    if (preceeding == 'L' || preceeding == 'C')
                        result -= 10;
                    else
                        result += 10;
                    break;
                case 'C':
                    if (preceeding == 'D' || preceeding == 'M')
                        result -= 100;
                    else
                        result += 100;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
            preceeding = input[i];
        }
        return result;
    }












    public static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static int romanToInt2(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    res += s1;
                } else {
                    res += (s2 - s1);
                    i++;
                }
            } else {
                res += s1;
            }
        }
        return res;
    }

    public static int romanToInt1(String s) {

        int res = 0; // Initialize the result
        for (int i = 0; i < s.length(); i++) {

            // Get the value of the current symbol
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {

                // Get the value of the next symbol
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {

                    // If the current value is greater or
                    // equal, add it to the result
                    res += s1;
                } else {

                    // Else, add the difference and skip the
                    // next symbol
                    res += (s2 - s1);
                    i++;
                }
            } else {

                // Add the last symbol to the result
                res += s1;
            }
        }
        return res;
    }
}