package Test010;

import java.util.Scanner;

public class Main {

// 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형 출력(중첩 반복문)

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		for(int i=1 ; i<=a*a ; i++)
		{
			System.out.printf("%4d", i);
			if(i%a==0)
				System.out.println();
		}
	
	
	
		for(int j=0; j<a ; j++)
		{
			for(int i=0; i<a ; i++)
			{
				System.out.printf("%4d", j*a+i+1);
			}
			System.out.println();
			
		}
	}

}

