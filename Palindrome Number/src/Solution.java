/*
Determine whether an integer is a palindrome. Do this without extra space.
*/

public class Solution {

	public static void main(String[] args) {

		System.out.println(isPalindrome(1235));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-1001));
		System.out.println(isPalindrome(6888886));

	}

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
