/*

Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180],
the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

*/

package com.codesignal.com;

import java.util.Arrays;
import java.util.List;

public class _012_SortByHeight {
    public static void main(String[] args) {
        _012_SortByHeight obj = new _012_SortByHeight();

        TestUtils.testCase(obj::solution, new int[]{-1, 150, 190, 170, -1, -1, 160, 180}, new int[]{-1, 150, 160, 170, -1, -1, 180, 190}, 1);
        TestUtils.testCase(obj::solution, new int[]{-1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1}, 2);
        TestUtils.testCase(obj::solution, new int[]{-1}, new int[]{-1}, 3);
        TestUtils.testCase(obj::solution, new int[]{4, 2, 9, 11, 2, 16}, new int[]{2, 2, 4, 9, 11, 16}, 4);
        TestUtils.testCase(obj::solution, new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1}, new int[]{1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2}, 5);
        TestUtils.testCase(obj::solution, new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3}, new int[]{1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77}, 6);

        TestUtils.printSummary();
    }

    int[] solution(int[] a) {
        List<Integer> list = Arrays
                .stream(a)
                .filter(i -> i > 0)
                .sorted()
                .boxed()
                .toList();

        final int[] index = {0};

        return Arrays
                .stream(a)
                .boxed()
                .map(i -> {
                    if (i > 0) {
                        return list.get(index[0]++);
                    } else {
                        return i;
                    }
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }

    int[] solution1(int[] a) {
        int[] heights = a.clone();
        Arrays.sort(heights);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && heights[i] < 0) {
                for (int j = i; j < heights.length; j++) {
                    if (heights[j] > 0) {
                        heights[i] = heights[j];
                        heights[j] = -1;
                        break;
                    }
                }
            }
        }
        return heights;
    }
}
