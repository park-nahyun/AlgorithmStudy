package Test024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int[] scr = new int[n];
		int avg=0;
		int cnt=0;
		double result; 
		String score = sc.nextLine();
		String[] s = score.split(" ");
		int[] sr = new int[s.length];
		
		String score2="";

		
		for(int i=0 ; i<s.length ; i++)
		{
			score2 = s[i];
			sr[i] = Integer.parseInt(score2);
		}
	
		/*
		for(int i=0 ; i<sr.length ; i++)
		{
			avg += sr[i];
		}
		avg /= n;

		for(int i=0 ; i<sr.length ; i++)
		{
			if(sr[i] > avg)
				cnt++;
		}
		
		result = cnt/n*100;
		
		// System.out.printf("정답 : %.2f", result);
		
		*/
		
	}
}
