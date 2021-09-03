package Test009;

import java.util.Scanner;

public class Main {

// 입력된 각 자리 수의 합

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 0;
		
		int num = 0;
		
		while(a>0)
		{
			b = a%10;
			a /= 10;
			
			num += b;
		}
		
		System.out.println("정답 : " + num);
	}

}
