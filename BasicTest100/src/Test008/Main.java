package Test008;


import java.util.Scanner;

// �Էµ� ���� ���丮�� ���ϱ�

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int fact=1;
		int i=1;
		
		while(i<=a)
		{
			fact *= i;
			i++;
		}
		
		System.out.println("���� : " + fact);
	}
}

