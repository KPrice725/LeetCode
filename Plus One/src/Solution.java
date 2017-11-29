/*
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
*/

public class Solution {

	public static int[] plusOne(int[] digits) {

		int index = digits.length - 1;

		while (digits[index] == 9) {
			digits[index] = 0;
			if (index == 0) {
				int[] result = new int[digits.length + 1];
				result[0] = 1;
				for (int i = 0; i < digits.length; i++) {
					result[i + 1] = digits[i];
				}
				return result;
			}
			index--;
			if (digits[index] != 9) {
				digits[index] += 1;
				return digits;
			}
		}
		digits[digits.length - 1] += 1;

		return digits;
	}
}
