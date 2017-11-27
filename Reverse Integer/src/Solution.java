/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

*/

public class Solution {

	public static int reverse(int x) {

		int input = x;
		int result = 0;

		while (input != 0) {

			if (((result + input % 10) - (input % 10))  != result) {
				return 0;
			}
			result = result + (input % 10);
			input = input / 10;
			if (input != 0) {

				if ((result * 10) / 10 != result) {
					return 0;
				}
				result = result * 10;
			}
		}

		return result;
	}

}
