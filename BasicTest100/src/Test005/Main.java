package Test005;

import java.util.Scanner;

// 대문자는 소문자로, 소문자는 대문자로 변환
// A-65, Z-90, a-97, z-122

public class Main {
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		// String 을 char 문자열로 바꿔주는 메소드
		
		
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
