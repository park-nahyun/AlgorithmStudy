package Test020;

import java.util.Scanner;

/*
 * 100���� 369 ���� (�޼ҵ� ���� ������)
 * */
public class Main {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%10==3 || i%10==6 || i%10==9)
				System.out.print("¦ ");
			else if(i/10==3 || i/10==6 || i/10==9)
				System.out.print("¦ ");
			else				
				System.out.print(i + " ");
		}
	}
}
