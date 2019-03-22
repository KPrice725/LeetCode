package solution;

/*
53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/
public class Solution {
	
	public int maxSubArray(int[] nums) {
		int maxSubArray = nums[0];
        int currentSum = maxSubArray;
        
        for (int i = 1; i < nums.length; i++) {
            if (currentSum > 0) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            if (currentSum > maxSubArray) {
                maxSubArray = currentSum;
            }
        }
            
        return maxSubArray;  
	}

}
