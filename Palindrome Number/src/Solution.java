/*
Determine whether an integer is a palindrome. Do this without extra space.
*/

public class Solution {

	public static boolean isPalindrome(int x) {

		int input = x;
		int pal = 0;

		while (input != 0) {
			pal = pal + (input % 10);
			input = input / 10;
			if (input != 0) {
				pal = pal * 10;
			}
		}

		if (pal == x && pal >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
