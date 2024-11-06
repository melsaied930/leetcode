package com.codesignal.com;/*
Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c.
Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.

Example
For numbers = [1, 2, 1, 3, 4], the output should be solution(numbers) = [1, 1, 0].
(numbers[0], numbers[1], numbers[2]) = (1, 2, 1) is a zigzag, because 1 < 2 > 1;
(numbers[1], numbers[2] , numbers[3]) = (2, 1, 3) is a zigzag, because 2 > 1 < 3;
(numbers[2], numbers[3] , numbers[4]) = (1, 3, 4) is not a zigzag, because 1 < 3 < 4;
For numbers = [1, 2, 3, 4], the output should be solution(numbers) = [0, 0];
Since all the elements of numbers are increasing, there are no zigzags.
For numbers = [1000000000, 1000000000, 1000000000], the output should be solution(numbers) = [0].
Since all the elements of numbers are the same, there are no zigzags.
*/

import java.util.Arrays;

public class Zigzag {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1000000000, 1000000000, 1000000000})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1, 2, 4, 3, 1})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{3, 5, 2, 6, 10})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1, 3, 4, 5, 6, 14, 14})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{1, 5, 7, 3, 10, 2, 4, 9, 8, 6})));
        System.out.println(Arrays.toString(new Zigzag().solution(new int[]{11, 14, 3, 17, 16, 13, 3, 7, 19, 8})));
    }

    int[] solution(int[] numbers) {
        int[] sol = new int[numbers.length - 2];
        for (int i = 0; i < sol.length; i++) {
            if ((numbers[i] < numbers[i + 1] && numbers[i + 1] > numbers[i + 2])
                    || (numbers[i] > numbers[i + 1] && numbers[i + 1] < numbers[i + 2])) {
                sol[i] = 1;
            }
        }
        return sol;
    }
}
