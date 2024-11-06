/*
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
+--------+--------+--------+--------+
|  n = 1 |  n = 2 |  n = 3 |  n = 4 |
+--------+--------+--------+--------+
|        |        |        |        |
|   *    |   *    |   *    |   *    |
|  *#*   |  *#*   |  *#*   |  *#*   |
|   *    | **#**  | **#**  | **#**  |
|        |  ***   | **#**  | **#**  |
|        |   *    | *****  | **#**  |
|        |        |  ***   | *****  |
|        |        |   *    |  ***   |
|        |        |        |   *    |
|        |        |        |        |
+--------+--------+--------+--------+



Example

For n = 2, the output should be
solution(n) = 5;
For n = 3, the output should be
solution(n) = 13.
*/

package com.codesignal.com;

public class _005_ShapeArea {
    public static void main(String[] args) {
        System.out.println(new _005_ShapeArea().solution(2));
        System.out.println(new _005_ShapeArea().solution(3));
        System.out.println(new _005_ShapeArea().solution(1));
        System.out.println(new _005_ShapeArea().solution(5));
        System.out.println(new _005_ShapeArea().solution(7000));
        System.out.println(new _005_ShapeArea().solution(8000));
        System.out.println(new _005_ShapeArea().solution(9999));
        System.out.println(new _005_ShapeArea().solution(9998));
        System.out.println(new _005_ShapeArea().solution(8999));
        System.out.println(new _005_ShapeArea().solution(100));
    }

    int solution(int n) {
        int area = (n * 2) - 1;
        for (int i = n - 1; i > 0; i--) {
            area += (((i * 2) - 1) * 2);
        }
        return area;
    }
}
