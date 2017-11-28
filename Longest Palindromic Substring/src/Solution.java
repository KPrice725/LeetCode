/*
 Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"

*/

public class Solution {
	int longestSize = 0;
	int lowestIndex = 0;

	public String longestPalindrome(String s) {

		if (s.length() < 2 || s == null) {
			return s;
		}

		for (int index = 0; index < s.length() - 1; index++) {
			checkPalindrome(s, index, index);
			checkPalindrome(s, index, index + 1);
		}
		String result = s.substring(lowestIndex, lowestIndex + longestSize);
		return result;

	}

	private void checkPalindrome(String s, int leftIndex, int rightIndex) {
		while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
			leftIndex--;
			rightIndex++;
		}
		if (longestSize < rightIndex - leftIndex - 1) {
			lowestIndex = leftIndex + 1;
			longestSize = rightIndex - leftIndex - 1;
		}

	}

}
