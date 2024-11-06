/*
After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free,
but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
your task is to return the total sum of all rooms that are suitable for the CodeBots
(ie: add up all the values that don't appear below a 0).

Example For
matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
the output should be solution(matrix) = 9.
👻  1   1    2
👻  5   👻   👻
[2] 👻  [3]  [3]


There are several haunted rooms, so we'll disregard them as well as any rooms beneath them.
Thus, the answer is [1 + 5 + 1 + 2] = 9.

Example For
matrix = [[1, 1, 1, 0],
          [0, 5, 0, 1],
          [2, 1, 3, 10]]
the output should be
solution(matrix) = 9.
1    1   1    👻
👻   5   👻   [1]
[2]  1   [3]  [10]

Note that the free room in the final column makes the full column unsuitable for bots
(not just the room directly beneath it). Thus, the answer is [1 + 1 + 1 + 5 + 1] = 9.

*/

package com.codesignal.com;

public class _008_MatrixElementsSum {
    public static void main(String[] args) {
        _008_MatrixElementsSum obj = new _008_MatrixElementsSum();

        TestUtils.testCase(obj::solution, new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}, 9, 1);
        TestUtils.testCase(obj::solution, new int[][]{{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}}, 9, 2);
        TestUtils.testCase(obj::solution, new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}, 18, 3);
        TestUtils.testCase(obj::solution, new int[][]{{0}}, 0, 4);
        TestUtils.testCase(obj::solution, new int[][]{{1, 0, 3}, {0, 2, 1}, {1, 2, 0}}, 5, 5);
        TestUtils.testCase(obj::solution, new int[][]{{1}, {5}, {0}, {2}}, 6, 6);
        TestUtils.testCase(obj::solution, new int[][]{{1, 2, 3, 4, 5}}, 15, 7);
        TestUtils.testCase(obj::solution, new int[][]{{2}, {5}, {10}}, 17, 8);
        TestUtils.testCase(obj::solution, new int[][]{{4, 0, 1}, {10, 7, 0}, {0, 0, 0}, {9, 1, 2}}, 15, 9);
        TestUtils.testCase(obj::solution, new int[][]{{1}}, 1, 10);

        TestUtils.printSummary();
    }

    int solution(int[][] matrix) {
        int counter = 0;
        boolean[] free = new boolean[matrix[0].length];
        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] > 0 && !free[j]) {
                    counter += i[j];
                } else {
                    free[j] = true;
                }
            }
        }
        return counter;
    }
}
