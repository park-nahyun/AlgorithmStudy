package Test021;

import java.util.Scanner;
/*
 * 1~100까지 숫자가 입력될 때 한 번이라도 입력되었으면 출력하시오
 * 입력 : 1 2 3 1 1 2 3 4 5 5
 * 정답 : 1 2 3 4 5
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();
		String arr[] = input.split(" ");
		int cnt[] = new int[100];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			cnt[Integer.parseInt(arr[i])-1]++;
		}
		
		System.out.print("정답 : ");
		for(int i=0 ; i<cnt.length ; i++)
		{
			if(cnt[i]>0)
				System.out.print(i+1 + " ");
		}
	}
}
