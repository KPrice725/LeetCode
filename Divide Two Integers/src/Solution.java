/*
29. Divide Two Integers
Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.
*/

public class Solution {

	public int divide(int dividend, int divisor) {

		if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
			return Integer.MAX_VALUE;
		}
		if (divisor == 1) {
			return dividend;
		}
		if (divisor == -1) {
			return -dividend;
		}

		boolean positive;
		if ((dividend >= 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
			positive = true;
		} else {
			positive = false;
		}

		long x = Math.abs((long) dividend);
		long y = Math.abs((long) divisor);
		long result = 0;

		while (x >= y) {
			long factoredY = y;
			long factor = 1;
			while (x >= (factoredY << 1)) {
				factoredY <<= 1;
				factor <<= 1;
			}
			result += factor;
			x -= factoredY;
		}

		if (positive) {
			return (int) result;
		} else {
			return (int) -result;
		}
	}

}
