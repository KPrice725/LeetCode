/*
371. Sum of Two Integers
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/

public class Solution {

	public int getSum(int a, int b) {

		int sum = 0;
		int carry = 0;
		if (b == 0) {
			return a;
		} else {
			sum = a ^ b;
			carry = (a & b) << 1;
			return getSum(sum, carry);
		}
	}
}
