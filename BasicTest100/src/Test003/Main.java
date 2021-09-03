package Test003;

// 10개의 랜덤 숫자 중 최빈수 구하기

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
			
		int[] count = new int[10]; // 0~9의 숫자가 몇 번씩 나오는지 세는 용도
		
		// "count[3] = 5, => 3번 숫자가 5번 출현했다"
		
		
		// arr[]의 값들이 count의 index가 되는 것
		
		for (int i=0; i<10 ; i++)
		{
			count[arr[i]]++;
		}
		
		int num = 0; // 최빈수
		int cnt = 0; // 최빈수가 나온 횟수
		
		for (int i=0; i<10 ; i++)
		{
			// System.out.print(i + "의 횟수 : " + count[i] + " ");
			if(cnt<count[i])
			{
				cnt = count[i];
				num = i;
			}
		}
		
		System.out.print(num + "의 횟수 : " + cnt);
	}
}
