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
		
		i--; // i�� �� �� �� ī��Ʈ�ǹǷ�
		
		for (; i>=0; i--) // for�� �� �� ���� �ʱ�ȭ�� ����. ���� �����ϴ� i���� ī��Ʈ �ϴ� ��..
		{
			System.out.print(bin[i]);
		}
	}

}
