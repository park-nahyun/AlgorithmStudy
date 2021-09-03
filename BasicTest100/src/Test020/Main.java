package Test020;

import java.util.Scanner;

/*
 * 100까지 369 게임 (메소드 따로 만들어보기)
 * */
public class Main {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%10==3 || i%10==6 || i%10==9)
				System.out.print("짝 ");
			else if(i/10==3 || i/10==6 || i/10==9)
				System.out.print("짝 ");
			else				
				System.out.print(i + " ");
		}
	}
}
