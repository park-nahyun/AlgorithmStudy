package Test011;

import java.util.Scanner;

/*
 * 입력된 수 N 만큼 N행 N열로 숫자 정사각형 출력
 * 1  2  3  4
 * 8  7  6  5
 * 9  10 11 12
 * 16 15 14 13
 * */

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n ;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i%2!=0)
					System.out.printf("%4d", i*n+(n-j+1));
				else
					System.out.printf("%4d", i*n+j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		
		int arr[][] = new int[n][n];
		
		System.out.println(0%2);
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i%2==0)
					arr[i][j] = i*n+(j+1);
				else
					arr[i][j] = i*n+(n-j);
				
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
