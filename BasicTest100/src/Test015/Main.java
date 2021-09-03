package Test015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=a ; j<=b ; j++)
			{
				System.out.printf("%d * %d = %2d   ", j, i, i*j);
			}
			System.out.println();
		}
	}
}
