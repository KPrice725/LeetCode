/*
344. Reverse String

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".


*/

public class Solution {
	
	public static String reverseString(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
}
