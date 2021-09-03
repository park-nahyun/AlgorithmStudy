package Test019;

/*
 * n, m 입력받고
 * n의 m승의 결과
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		
		for(int i=1 ; i<=b ; i++)
		{
			result *= a;
		}
		
		System.out.println("정답 : " + result);
				
	}
}
