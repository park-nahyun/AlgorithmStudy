package Test022;

import java.util.Scanner;

/*
 * �Էµ� ���� �Ӹ�������� �Ǻ�
 * �Ӹ����? �Ųٷ� �о �Ȱ��� ��..
 * */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String input = sc.next();
		
		char arr[] = input.toCharArray();
		boolean chk = true;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != arr[arr.length-i-1])
			{
				chk = false;
				break;
			}
		}
		
		if(chk)
			System.out.println("�Ӹ������");
		else
			System.out.println("�ƴ�");
	}
}
