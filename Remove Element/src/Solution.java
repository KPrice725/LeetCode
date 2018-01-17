/*
27. Remove Element
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.
*/

import java.util.Arrays;

public class Solution {

	public int removeElement(int[] nums, int val) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);

		int matches = 0;
		int i = 0;

		while (i + matches < nums.length) {
			if (val == nums[i + matches]) {
				matches++;
			} else {
				nums[i] = nums[i + matches];
				i++;
			}
		}

		return nums.length - matches;
	}

}
