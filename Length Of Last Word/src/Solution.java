/*
58.) Length Of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        
        if (s.length() == 0) {
            return lengthOfLastWord;
        }
        
        int index = s.length() - 1;
        
        // iterate backwards until the first non-whitespace
        // char is found
        while (index >= 0 && s.charAt(index) == ' ') index--;
        
        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                lengthOfLastWord++;
            }
        }
        return lengthOfLastWord;
    }
}