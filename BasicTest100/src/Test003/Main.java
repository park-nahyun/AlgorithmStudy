package Test003;

// 10���� ���� ���� �� �ֺ�� ���ϱ�

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i=0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
			
		int[] count = new int[10]; // 0~9�� ���ڰ� �� ���� �������� ���� �뵵
		
		// "count[3] = 5, => 3�� ���ڰ� 5�� �����ߴ�"
		
		
		// arr[]�� ������ count�� index�� �Ǵ� ��
		
		for (int i=0; i<10 ; i++)
		{
			count[arr[i]]++;
		}
		
		int num = 0; // �ֺ��
		int cnt = 0; // �ֺ���� ���� Ƚ��
		
		for (int i=0; i<10 ; i++)
		{
			// System.out.print(i + "�� Ƚ�� : " + count[i] + " ");
			if(cnt<count[i])
			{
				cnt = count[i];
				num = i;
			}
		}
		
		System.out.print(num + "�� Ƚ�� : " + cnt);
	}
}
