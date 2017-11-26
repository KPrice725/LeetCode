import java.util.Arrays;

public class Solution {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] combined = new int[nums1.length + nums2.length]; //values from nums1 & nums2 will be combined here
		int combinedCount = 0; // combined array index position
		int first = 0; //index position of nums1
		int second = 0; //index position of nums2
		double median = 0;

		//compare the next values of two input arrays, continue to add lowest values to combined array
		//until it reaches the end of one of the two input arrays
		while (first < nums1.length && second < nums2.length) {
			if (nums1[first] == nums2[second]) {
				combined[combinedCount] = nums1[first];
				combinedCount++;
				first++;
				combined[combinedCount] = nums2[second];
				combinedCount++;
				second++;
			} else if (nums1[first] < nums2[second]) {
				combined[combinedCount] = nums1[first];
				combinedCount++;
				first++;
			} else if (nums1[first] > nums2[second]) {
				combined[combinedCount] = nums2[second];
				combinedCount++;
				second++;
			}
		}
		
		//add the rest of the values from nums1 to combined array, if any remain
		while (first < nums1.length) {
			combined[combinedCount] = nums1[first];
			combinedCount++;
			first++;
		}
		
		//add the rest of the values from nums2 to combined array, if any remain
		while (second < nums2.length) {
			combined[combinedCount] = nums2[second];
			combinedCount++;
			second++;
		}
		
		//find median, if the length of the combined array is odd
		if(combined.length % 2 != 0) {
			median = combined[combined.length/2];
		} else { // if the length is even... 
			median = (combined[combined.length/2] + combined[combined.length/2 - 1]) / 2.0; 
		}
		
		return median;
	}

}
