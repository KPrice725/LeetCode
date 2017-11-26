
public class Solution {
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}
