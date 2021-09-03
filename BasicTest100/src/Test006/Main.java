package Test006;

import java.util.Scanner;

// 입력된 두 수의 최대공약수를 구하시오(for, while, if)

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		if(a>=b)
			c=a;
		else
			c=b;
		
		int num = 1;
		
		for(int i=1 ; i<=c ; i++)
		{
			if(a%i==0 && b%i==0)
				num = i;
		}
		
		System.out.println("정답 : " + num);
	}
}
