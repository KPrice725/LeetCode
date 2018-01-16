
/*
16. 3Sum Closest

Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


*/

import java.util.Arrays;

public class Solution {

	public int threeSumClosest(int[] nums, int target) {

		int closest = 0;
		if (nums == null || (nums.length >= 0 && nums.length <= 2)) {
			return closest;
		}

		if (nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}

		Arrays.sort(nums);

		int i = 0;
		int j = i + 1;
		int k = nums.length - 1;
		closest = nums[i] + nums[j] + nums[k];
		if (closest == target) {
			return closest;
		}
		while (true) {
			System.out.println("Current Closest: " + closest);

			int sum = nums[i] + nums[j] + nums[k];
			if (sum == target) {
				closest = sum;
				return closest;
			}
			System.out.println(Math.abs(target - sum));
			if (Math.abs(target - sum) < Math.abs(target - closest)) {
				closest = sum;
			}
			if (sum < target) { // we need to move j forward to get a higher
								// value
				if (j + 1 < k) { // j + 1 can't equal k
					j++;
				} else { // if it does, we move i up 1 and reset the other two
							// indices
					i++;
					j = i + 1;
					k = nums.length - 1;
				}
			} else if (sum > target) { // we need to move k down to get a lower
										// value
				if (k - 1 > j) { // k - 1 cannot equal j
					k--;
				} else {
					i++;
					j = i + 1;
					k = nums.length - 1;
				}
			}
			if (j == k) { // j&k reached the end of the array
				break;
			}
		}
		return closest;
	}

}
