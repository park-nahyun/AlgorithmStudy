package Test018;

/*
 *숫자 입력 받아 별찍기
 * 	   *
 *    **
 *   ***
 *  ****
 * ***** 
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				if(n-i<j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
