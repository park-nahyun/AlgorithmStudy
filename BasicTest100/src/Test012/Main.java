package Test012;

import java.util.Scanner;

/*
 * 입력된 수 N 만큼 N행 N열로 숫자 정사각형 출력
 * 1   5   9  13
 * 2   6  10  14
 * 3   7  11  15
 * 4   8  12  16
 * */

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n ;i++)
		{
			for(int j=0; j<n ; j++)
			{
				System.out.printf("%4d", i+1+j*n);
			}
			System.out.println();
		}
	}
}
