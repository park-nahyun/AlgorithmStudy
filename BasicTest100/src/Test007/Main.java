package Test007;

import java.util.Scanner;

// �Էµ� ���� �Ҽ����� �Ǻ�

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		/*
		if (a==1 || a==2 || a==3 || a==5 || a==7)
			System.out.println("����  : " + a + "�� �Ҽ��Դϴ�.");
		else if(a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0)
			System.out.println("����  : " + a + "�� �Ҽ��Դϴ�.");
		else
			System.out.println("����  : " + a + "�� �Ҽ��� �ƴմϴ�.");
		*/
		
		boolean flag = false;
		
		for (int i=2 ; i<a ; i++)
		{
			if(a%i==0)
			{
				flag = true;
				System.out.println("����  : " + a + "�� �Ҽ��� �ƴմϴ�.");
				break;
			}
		}
			
		if (!flag)
			System.out.println("����  : " + a + "�� �Ҽ��Դϴ�.");
	}
}
