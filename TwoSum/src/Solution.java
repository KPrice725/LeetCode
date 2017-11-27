/*
 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] values = {3, 7, 11, 15, 18, 5, 8, 5};
		int goal = 9;
		System.out.println("program started");
		System.out.println(Arrays.toString(values));
		System.out.println(goal);
		int[] solution = twoSum(values, goal);
		System.out.println(Arrays.toString(solution));

	}
	
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(j == i) {
                	System.out.println("these values match");
                    break;
                } else {
                	System.out.println("these values don't match");
                    int sum = nums[i] + nums[j];
                    if (sum == target) {
                        int[] result = {i, j};
                        return result;
                    }
                }
            }
        }
        /// If no values are found... ///
        System.out.println("Given array does not contain values that add up to given target.");
		return null;
    }

}
