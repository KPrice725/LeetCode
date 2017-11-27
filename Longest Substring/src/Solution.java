
public class Solution {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

	}

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
