package Test021;

import java.util.Scanner;
/*
 * 1~100���� ���ڰ� �Էµ� �� �� ���̶� �ԷµǾ����� ����Ͻÿ�
 * �Է� : 1 2 3 1 1 2 3 4 5 5
 * ���� : 1 2 3 4 5
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String input = sc.nextLine();
		String arr[] = input.split(" ");
		int cnt[] = new int[100];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			cnt[Integer.parseInt(arr[i])-1]++;
		}
		
		System.out.print("���� : ");
		for(int i=0 ; i<cnt.length ; i++)
		{
			if(cnt[i]>0)
				System.out.print(i+1 + " ");
		}
	}
}
