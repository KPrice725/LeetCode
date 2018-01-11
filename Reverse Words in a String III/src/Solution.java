/*
557. Reverse Words in a String III
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.



*/
public class Solution {

	public String reverseWords(String s) {

		StringBuilder sb = new StringBuilder();
		

		for (int i = 0; i < s.length(); i++) {

			if (s.substring(i, i + 1).equals(" ")) {
				int counter = i - 1;
				while (counter >= 0) {

					if (s.substring(counter, counter + 1).equals(" ")) {
						break;
					}
					sb.append(s.substring(counter, counter + 1));
					counter--;

				}
				sb.append(s.substring(i, i + 1));
			}

			if (i == s.length() - 1) {
				int counter = i;
				while (counter >= 0) {

					if (s.substring(counter, counter + 1).equals(" ")) {
						break;
					}
					sb.append(s.substring(counter, counter + 1));
					counter--;

				}
			}
		}

		return sb.toString();
	}

}
