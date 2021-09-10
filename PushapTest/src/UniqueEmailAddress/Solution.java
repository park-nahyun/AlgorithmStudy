package UniqueEmailAddress;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
		Set<String> rs = new HashSet<String>();
		
	public int solve(String[] emails) {
		int cnt=0;
		String[] result = emails;
		String[][] split = new String[3][2];

		
		for(int i=0; i< result.length ;i++)
		{
			split[i][0] = result[i].split("@")[0];
			split[i][1] = result[i].split("@")[1];
		}
		
		for(int i=0; i< split.length; i++)
		{
			// . 贸府
			// split[i][0].replace(".", "")
			
			// + 贸府
			int a = 0;
			a = (split[i][0].replace(".", "")).indexOf("+");
			// System.out.println("+ 贸府  : " + split[i][0].replace(".", ""));
			
			if(a>=0)
			{
				split[i][0] = (split[i][0].replace(".", "")).replace((split[i][0].replace(".", "")).substring(a), "");
				// System.out.println("贸府2 : " + split[i][0]);
				// System.out.println("缔何盒 : " + split[i][1]);
			}
			else
				split[i][0] = split[i][0].replace(".", "");
			
			rs.add(split[i][0]+ "@" + split[i][1]);
			// System.out.println("皋老 葛剧 " + i + " : " + split[i][0]+ "@" + split[i][1]);
			
			
		}
		
		cnt = rs.size();
		
		return cnt;
	}	
	public static void main(String[] args) {
		
		/*
		String emails[] = {"test.email+james@coding.com",
				"test.e.mail+toto.jane@coding.com",
				"testemail.tom@cod.ing.com"};
		*/
		
		
		String emails[] = {"a@coding.com", "b@coding.com", "c@coding.com"};
		
		Solution sol = new Solution();
		
		System.out.println(sol.solve(emails) + "俺");
		
		System.out.println("explanation : ");
		
		Iterator<String> iter = sol.rs.iterator();

		while(iter.hasNext())
			System.out.println(iter.next
					());
		
		
	}
}
