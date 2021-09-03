package Test017;

import java.util.Scanner;

/*
 *숫자 입력 받아 별찍기
 * *****
 *  ****
 *   ***
 *    **
 *     * 
 * */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=n ; j>0 ; j--)
			{
				if(n-j+1<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

