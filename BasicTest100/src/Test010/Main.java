package Test010;

import java.util.Scanner;

public class Main {

// �Էµ� ��(N) ��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢�� ���(��ø �ݺ���)

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

