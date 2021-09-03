package Test022;

import java.util.Scanner;

/*
 * 입력된 수가 팰린드롬인지 판별
 * 팰린드롬? 거꾸로 읽어도 똑같은 것..
 * */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = sc.next();
		
		char arr[] = input.toCharArray();
		boolean chk = true;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != arr[arr.length-i-1])
			{
				chk = false;
				break;
			}
		}
		
		if(chk)
			System.out.println("팰린드롬임");
		else
			System.out.println("아님");
	}
}
