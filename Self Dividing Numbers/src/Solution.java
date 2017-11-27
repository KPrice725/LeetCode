/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> results = new ArrayList<>();

		while (left <= right) {
			ArrayList<Integer> digits = new ArrayList<>();
			int divider = left;
			boolean sentinel = true; //this ultimately indicates if the int is self-divisible
			while (divider != 0) { //extract each digit from the int, right to left, and add it to digits array
				if(divider % 10 == 0) { //divider ends in 0, ints with 0's are excluded
					sentinel = false;
					break;
				}
				digits.add(divider % 10);
				divider = divider / 10;
			}
			
			
			for(Integer values : digits) {
				if(!((left % values) == 0)) { //if there is a % remainder, the int is not self-divisible 
					sentinel = false;
					break;
				}
			}
			if (sentinel == true) {
				results.add(left);
			}
			left++;

		}

		return results;

    }
}
