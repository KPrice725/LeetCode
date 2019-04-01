/*
67.) Add Binary
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"

11 + 1

1	1
0	1
	
p0: 1 & 1 = 0, carry the 1
p1: 1 & 0 = 1, but with the carried 1, now is 0, carry the one
p2: 0 & 0 = 0, but with the carried 1, now is 1, no more carryover

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

p0: 1 & 0 = 1
p1: 1 & 1 = 0, carry the 1
p2: 0 & 0 = 0, but with the carried 1, now is 1
p3: 1 & 1 = 0, carry the 1
p4: 0 & 0 = 0, but with the carried 1, now is 1


*/

public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder output = new StringBuilder();
		int carryTheOne = 0;
		int indexA = a.length() - 1;
		int indexB = b.length() - 1;
		
		while (indexA >= 0 && indexB >= 0) {
			char charA = a.charAt(indexA);
			char charB = b.charAt(indexB);
			output.append(getAddedBit(charA, charB, carryTheOne));
			if ((charA == '1' && charB == '1') || (charA == '1' && carryTheOne == 1)
					|| (charB == '1' && carryTheOne == 1)) {
				carryTheOne = 1;
			} else {
				carryTheOne = 0;
			}
			indexA--;
			indexB--;
		}
		
		while (indexA >= 0) {
			char charA = a.charAt(indexA);
			char charB = '0';
			output.append(getAddedBit(charA, charB, carryTheOne));
			if (charA == '1' && carryTheOne == 1) {
				carryTheOne = 1;
			} else {
				carryTheOne = 0;
			}
			indexA--;
		}
		
		while (indexB >= 0) {
			char charA = '0';
			char charB = b.charAt(indexB);
			output.append(getAddedBit(charA, charB, carryTheOne));
			if (charB == '1' && carryTheOne == 1) {
				carryTheOne = 1;
			} else {
				carryTheOne = 0;
			}
			indexB--;
		}
		
		if (carryTheOne == 1) {
			output.append(1);
		}
		
		return output.reverse().toString();
	}
	
	public int getAddedBit(char charA, char charB, int carryTheOne) {
		return (charA ^ charB) ^ carryTheOne;
	}
}