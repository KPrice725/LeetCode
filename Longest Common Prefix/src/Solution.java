/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
*/

public class Solution {
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		boolean sentinel = true;
		int i = 0;
		while(true) { //index of char
			if(strs[0] == null || strs[0].equals("") || i >= strs[0].length()) {
				break;
			}
			char c = strs[0].charAt(i);
			for(String s : strs) { //loop through strs
				if(s == null || s.equals("") || i >= s.length() || s.charAt(i) != c) {
					sentinel = false;
					break;
				}
			}
			if(sentinel) {
				sb.append(c);
				i++;
			} else {
				break;
			}
		}
		
		

		return sb.toString();
	}
}
