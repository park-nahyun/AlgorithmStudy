package Test023;

import java.util.Scanner;

/*
 * 입력된 문자열을 뒤집어서 출력
 * */

public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		System.out.print("정답 : ");
		for(int i=arr.length ; i>0 ; i--)
		{
			System.out.print(arr[i-1]);
		}
	}

}
