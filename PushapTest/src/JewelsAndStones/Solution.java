package JewelsAndStones;

import java.util.ArrayList;

public class Solution {
	public int solve(String jew, String stones)
	{
		int output=0;
		
		String j = jew;
		String s = stones;
		
		char[] jChar = j.toCharArray();
		ArrayList<Character> sChar = new ArrayList<Character>();
		
		for(int i=0; i<s.length() ;i++)
		{
			sChar.add(s.charAt(i));
		}
		
		for(char cnt : sChar)
		{
			for(int i=0 ; i<jChar.length ; i++)
			{
				if(cnt==jChar[i])
					output++;
			}
		}
		
		
		return output;
	}
	
	public static void main(String[] args) {
		
		String jew = "z";
		String stones ="ZZZZZZZ";
		
		Solution sol = new Solution();
		
		System.out.println("Á¤´ä : " + sol.solve(jew, stones));
	}


}
