package Test004;

import java.util.Scanner;

// 10������ 2������ ��ȯ�Ͻÿ� (while, for)

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String biNum = "";
		
		while(num>=1)
		{
			if(num%2==0)
			{
				biNum = "0" + biNum;
				num = num/2;
			}
			else
			{
				biNum = "1" + biNum;
				num = num/2;
			}
		}
		
		System.out.println("���� : " + biNum);
	}

}
