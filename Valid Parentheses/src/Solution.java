/*
  20. Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


 
*/


import java.util.Stack;

public class Solution {


	public static boolean isValid(String s) {

		if (s == null || s.length() == 0) {
			return false;
		}

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				stack.push("Round");
				break;
			case '{':
				stack.push("Curly");
				break;
			case '[':
				stack.push("Square");
				break;
			case ')':
				if(stack.isEmpty() || !stack.peek().equals("Round")) {
					return false;
				} else {
					stack.pop();
					break;
				}
			case '}':
				if(stack.isEmpty() || !stack.peek().equals("Curly")) {
					return false;
				} else {
					stack.pop();
					break;
				}
			case ']':
				if(stack.isEmpty() || !stack.peek().equals("Square")) {
					return false;
				} else {
					stack.pop();
					break;
				}
			default:

			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}
