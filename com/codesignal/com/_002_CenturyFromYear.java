package com.codesignal.com;

public class _002_CenturyFromYear {
    public static void main(String[] args) {
        _002_CenturyFromYear obj = new _002_CenturyFromYear();

        TestUtils.testCase(obj::solution, 1905, 20, 1);
        TestUtils.testCase(obj::solution, 1700, 17, 2);
        TestUtils.testCase(obj::solution, 1988, 20, 3);
        TestUtils.testCase(obj::solution, 2000, 20, 4);
        TestUtils.testCase(obj::solution, 2001, 21, 5);
        TestUtils.testCase(obj::solution, 200, 2, 6);
        TestUtils.testCase(obj::solution, 374, 4, 7);
        TestUtils.testCase(obj::solution, 45, 1, 8);
        TestUtils.testCase(obj::solution, 8, 1, 9);
    }

    int solution(int year) {
        return year % 100 > 0 ? year / 100 + 1 : year / 100;
    }
}
