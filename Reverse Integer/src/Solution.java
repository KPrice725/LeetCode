
public class Solution {

	public static void main(String[] args) {

		System.out.println(reverse(-2147483412));

	}

	public static int reverse(int x) {

		int input = x;
		int result = 0;

		while (input != 0) {

			if (((result + input % 10) - (input % 10))  != result) {
				return 0;
			}
			result = result + (input % 10);
			input = input / 10;
			if (input != 0) {

				if ((result * 10) / 10 != result) {
					return 0;
				}
				result = result * 10;
				System.out.println(result);
			}
		}

		return result;
	}

}
