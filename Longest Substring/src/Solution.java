/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/


public class Solution {

	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s == "") {
			return 0;
		}

		int currentLength = 0;
		int longestLength = 0;
		String stringBuilder = "";
		String currentChar = "";
		int index = 0;

		while (index < s.length()) {
			currentChar = s.substring(index, index + 1);

			if (stringBuilder.length() == 0) {
				stringBuilder += currentChar;
				currentLength = stringBuilder.length();
				if (longestLength < currentLength) {
					longestLength = currentLength;
				}
				index++;


			} else {
				//// unique character////
				if (!stringBuilder.contains(currentChar)) {
					stringBuilder += currentChar;
					currentLength = stringBuilder.length();
					if (longestLength < currentLength) {
						longestLength = currentLength;
					}
					index++;

				} else { //// match found ///
					int searchIndex = index - 1;
					String matchingChar = s.substring(searchIndex, searchIndex + 1);
					while (!matchingChar.equals(currentChar)) {
						searchIndex--;
						matchingChar = s.substring(searchIndex, searchIndex + 1);
					}
					/// match location found///
					stringBuilder = s.substring(searchIndex + 1, index + 1);
					currentLength = stringBuilder.length();
					index++;
					
				}
			}
		}

		
		return longestLength;
	}

}
