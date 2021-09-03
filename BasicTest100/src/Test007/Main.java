package Test007;

import java.util.Scanner;

// 입력된 수가 소수인지 판별

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		/*
		if (a==1 || a==2 || a==3 || a==5 || a==7)
			System.out.println("정답  : " + a + "는 소수입니다.");
		else if(a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0)
			System.out.println("정답  : " + a + "는 소수입니다.");
		else
			System.out.println("정답  : " + a + "는 소수가 아닙니다.");
		*/
		
		boolean flag = false;
		
		for (int i=2 ; i<a ; i++)
		{
			if(a%i==0)
			{
				flag = true;
				System.out.println("정답  : " + a + "는 소수가 아닙니다.");
				break;
			}
		}
			
		if (!flag)
			System.out.println("정답  : " + a + "는 소수입니다.");
	}
}
