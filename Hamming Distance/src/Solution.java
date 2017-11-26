
public class Solution {

	public static void main(String[] args) {

		
		
		System.out.println(Integer.bitCount(5^3));
		System.out.println(42 ^ 15);
		System.out.println(hammingDistance(42, 15));
		
		System.out.println();
		System.out.println();
		
		
		int[] values = {0, 536870911, 0, 536870911};
		System.out.println(totalHammingDistance(values));
		
		

	}

	public static int hammingDistance(int x, int y) {

		return Integer.bitCount(x ^ y);

	}
	
	public static int totalHammingDistance(int[] nums) {
		
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				System.out.println(Integer.bitCount(nums[i] ^ nums[j]));
				result += Integer.bitCount(nums[i] ^ nums[j]);
			}
			
			
		}
		
		
		return result;
	}
	

}
