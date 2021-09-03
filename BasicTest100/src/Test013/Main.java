package Test013;

/*
 * 1  2  3  4
 * 2  4  6  8
 * 3  6  9  12
 * 4  8  12 16
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.printf("%4d", (j+1)*(i+1));
			}
			System.out.println();
		}
	}
}
