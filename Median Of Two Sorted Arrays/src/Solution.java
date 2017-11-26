import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 7, 10, 19, 26, 28, 36 };
		int[] nums2 = { 3, 4, 8, 16, 24, 33, 54 };

		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] combined = new int[nums1.length + nums2.length];
		int combinedCount = 0;
		int first = 0;
		int second = 0;
		double median = 0;

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
		
		while (first < nums1.length) {
			combined[combinedCount] = nums1[first];
			combinedCount++;
			first++;
		}
		
		while (second < nums2.length) {
			combined[combinedCount] = nums2[second];
			combinedCount++;
			second++;
		}
		
		
		System.out.println(Arrays.toString(combined));
		System.out.println(combined.length);
		if(combined.length % 2 != 0) { //odd
			System.out.println("odd");
			median = combined[combined.length/2];
		} else { //even
			System.out.println("even");
			median = (combined[combined.length/2] + combined[combined.length/2 - 1]) / 2.0; 
		}
		

		return median;
	}

}
