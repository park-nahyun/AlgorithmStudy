package Test005;

import java.util.Scanner;

// �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ
// A-65, Z-90, a-97, z-122

public class Main {
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		// String �� char ���ڿ��� �ٲ��ִ� �޼ҵ�
		
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>91)
				arr[i] = (char)(arr[i]-32);
			
			else
				arr[i] = (char)(arr[i]+32);
		}
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}

	}
}
