
/*
 
38. Count and Say
 
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 
 */

public class App {

	public String countAndSay(int n) {

		String result = "";

		for (int i = 0; i < n; i++) {
			result = getNextSequence(result);
		}

		return result;
	}

	private String getNextSequence(String input) {
		if (input == null || input.equals("")) {
			return "1";
		}

		StringBuilder result = new StringBuilder();

		// tracks the current number
		char currentNumber = input.charAt(0);

		// tracks the count of currentNumber
		int count = 1;

		//Iterate over each character of the input.
		for (int i = 1; i < input.length(); i++) {
			if (currentNumber == input.charAt(i)) {
				//next char matches current char, increment count
				count++;
			} else {
				//char doesn't match, append count and current number to the result, then reset count to 1 and currentNumber to the new number
				result.append(Integer.toString(count) + currentNumber);
				currentNumber = input.charAt(i);
				count = 1;
			}

		}
		//final append
		result.append(Integer.toString(count) + currentNumber);

		return result.toString();

	}

}
