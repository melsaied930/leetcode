package com.leetcode.com.hard;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _041_FirstMissingPositive {
    public static void main(String[] args) {
//        int missing = firstMissingPositive(new int[]{2, 3, 7, -4, 6, 4, 5, -1, 1});
//        System.out.println("missing = " + missing);
//        System.out.println("missing = " + firstMissingPositive(new int[]{7,8,9,11,12}));
        System.out.println("missing = " + firstMissingPositive(new int[]{-7,-8,-9,-11,-12}));
    }

    private static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        for (int num : nums) {
            if (num > 0) {
                if (!(num <= missing)) {
                    return missing;
                } else {
                    missing = num + 1;
                }
            }
        }
        return missing;
    }

}
