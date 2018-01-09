
public class Solution {

	public static boolean judgeCircle(String moves) {

		int x = 0;
		int y = 0;
		
		for(int i = 0; i < moves.length(); i++) {
			switch(moves.charAt(i)) {
			case 'R' :
				x++;
				break;
			case 'L' :
				x--;
				break;
			case 'U' :
				y++;
				break;
			case 'D' :
				y--;
				break;
			default :
				break;
			}
		}
		
		if(x == 0 && y == 0) {
			return true;
		} else {
			return false;
		}
	}

}
