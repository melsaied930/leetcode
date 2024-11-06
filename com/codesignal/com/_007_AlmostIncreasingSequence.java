/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example
For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
*/

package com.codesignal.com;

public class _007_AlmostIncreasingSequence {
    public static void main(String[] args) {
        _007_AlmostIncreasingSequence obj = new _007_AlmostIncreasingSequence();

        TestUtils.testCase(obj::solution, new int[]{1, 3, 2, 1}, false, 1);
        TestUtils.testCase(obj::solution, new int[]{1, 3, 2}, true, 2);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 1, 2}, false, 3);
        TestUtils.testCase(obj::solution, new int[]{3, 6, 5, 8, 10, 20, 15}, false, 4);
        TestUtils.testCase(obj::solution, new int[]{1, 1, 2, 3, 4, 4}, false, 5);
        TestUtils.testCase(obj::solution, new int[]{1, 4, 10, 4, 2}, false, 6);
        TestUtils.testCase(obj::solution, new int[]{10, 1, 2, 3, 4, 5}, true, 7);
        TestUtils.testCase(obj::solution, new int[]{1, 1, 1, 2, 3}, false, 8);
        TestUtils.testCase(obj::solution, new int[]{0, -2, 5, 6}, true, 9);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 3, 4, 5, 3, 5, 6}, false, 10);
        TestUtils.testCase(obj::solution, new int[]{40, 50, 60, 10, 20, 30}, false, 11);
        TestUtils.testCase(obj::solution, new int[]{1, 1}, true, 12);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 5, 3, 5}, true, 13);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 5, 5, 5}, false, 14);
        TestUtils.testCase(obj::solution, new int[]{10, 1, 2, 3, 4, 5, 6, 1}, false, 15);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 3, 4, 3, 6}, true, 16);
        TestUtils.testCase(obj::solution, new int[]{1, 2, 3, 4, 99, 5, 6}, true, 17);
        TestUtils.testCase(obj::solution, new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45}, true, 18);
        TestUtils.testCase(obj::solution, new int[]{3, 5, 67, 98, 3}, true, 19);

        TestUtils.printSummary();
    }

    boolean solution(int[] sequence) {
        int counter = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                counter++;
                if (i > 0 && sequence.length > i + 2) {
                    if (sequence[i - 1] - sequence[i + 1] >= 0 && sequence[i] - sequence[i + 2] >= 0) {
                        counter++;
                    }
                }
            }
        }
        return counter < 2;
    }


    boolean solution1(int[] sequence) {
        int counter = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                counter++;
                if (counter > 1) {
                    return false;
                }
                if (i > 0 && i + 2 < sequence.length &&
                        sequence[i - 1] >= sequence[i + 1] &&
                        sequence[i] >= sequence[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }
}
