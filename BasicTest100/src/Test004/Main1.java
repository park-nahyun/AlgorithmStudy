package Test004;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int bin[] = new int[100];
		
		int i = 0;
		int mok = num;
		
		while(mok>0)
		{
			bin[i] = mok % 2;
			mok /= 2;
			i++;
 		}
		
		i--; // i가 한 번 더 카운트되므로
		
		for (; i>=0; i--) // for문 맨 앞 비우면 초기화가 없다. 현재 존재하는 i부터 카운트 하는 것..
		{
			System.out.print(bin[i]);
		}
	}

}
