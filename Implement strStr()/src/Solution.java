/*
28. Implement strStr()

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1


*/

public class Solution {


	public int strStr(String haystack, String needle) {
		
		if(haystack == null || needle == null) {
			return -1;
		}
		
		if(haystack.length() == 0 && needle.length() > 0) {
			return -1;
		}
		
		if(needle.length() == 0) {
			return 0;
		}

		for(int i = 0; i < haystack.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				int check = 0;
				boolean sentinel = true;
				while(sentinel && i + check < haystack.length()) {
					if(haystack.charAt(i + check) == needle.charAt(check)) {
						check++;
						if(check == needle.length()) {
							return i;
						}
					} else {
						sentinel = false;
					}
				}
			}
		}
		return -1;
	}

}
