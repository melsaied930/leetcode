import java.util.Arrays;

/*
1. Two Sum, Solved, Easy, Topics Companies
Hint
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
public class _001_TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum1(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum1(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum1(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2, 3}, 6)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum1(int[] nums, int target) {
        int size = nums.length;
        int[] out = new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }
        return out;
    }

}