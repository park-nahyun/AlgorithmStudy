package Test023;

import java.util.Scanner;

/*
 * �Էµ� ���ڿ��� ����� ���
 * */

public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		System.out.print("���� : ");
		for(int i=arr.length ; i>0 ; i--)
		{
			System.out.print(arr[i-1]);
		}
	}

}
