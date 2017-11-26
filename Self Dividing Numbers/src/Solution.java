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
