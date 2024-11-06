package com.codesignal.com;

public class _006_MakeArrayConsecutive_2 {
    public static void main(String[] args) {
        System.out.println(new _006_MakeArrayConsecutive_2().solution(new int[]{6, 2, 3, 8}));
        System.out.println(new _006_MakeArrayConsecutive_2().solution(new int[]{0, 3}));
        System.out.println(new _006_MakeArrayConsecutive_2().solution(new int[]{5, 4, 6}));
        System.out.println(new _006_MakeArrayConsecutive_2().solution(new int[]{6, 3}));
        System.out.println(new _006_MakeArrayConsecutive_2().solution(new int[]{1}));
    }

    int solution(int[] statues) {
        int min = statues[0];
        int max = statues[0];
        for (int j : statues) {
            if (j > max) {
                max = j;
            }
            if (min > j) {
                min = j;
            }

        }
        return 1 + max - min - statues.length;
    }
}
