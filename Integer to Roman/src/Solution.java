/*
12. Integer to Roman
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

*/

public class Solution {

	public static String intToRoman(int num) {

		StringBuilder sb = new StringBuilder();
		
		while(num > 0) {
			if(num - 1000 >= 0) {
				sb.append("M");
				num -= 1000;
				continue;
			} else if(num / 100 == 9) {
				sb.append("CM");
				num -= 900;
				continue;
			} else if(num - 500 >= 0) {
				sb.append("D");
				num -= 500;
				continue;
			} else if(num / 100 == 4) {
				sb.append("CD");
				num -= 400;
				continue;
			} else if(num - 100 >= 0) {
				sb.append("C");
				num -= 100;
				continue;
			} else if(num / 10 == 9) {
				sb.append("XC");
				num -= 90;
				continue;
			} else if(num - 50 >= 0) {
				sb.append("L");
				num -= 50;
				continue;
			} else if(num / 10 == 4) {
				sb.append("XL");
				num -= 40;
				continue;
			} else if(num - 10 >= 0) {
				sb.append("X");
				num -= 10;
				continue;
			} else if(num / 1 == 9) {
				sb.append("IX");
				num -= 9;
				continue;
			} else if(num - 5 >= 0) {
				sb.append("V");
				num -= 5;
				continue;
			} else if(num / 1 == 4) {
				sb.append("IV");
				num -= 4;
				continue;
			} else if(num - 1 >= 0) {
				sb.append("I");
				num -= 1;
				continue;
			}
		}
		
		return sb.toString();
	}

}
