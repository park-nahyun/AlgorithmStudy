package Test014;

/*
 * �Էµ� ������ ������ ����϶�
 * 134544453
 * 1 �� �� ~ 3 �� �� ~
 * 
 * 
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] arr = new char[n.length()];
		arr = n.toCharArray();
		int[] arrInt = new int[n.length()];
		int[] arrCnt = new int[10];
		
		for(int i=0; i<n.length(); i++)
		{
			arrInt[i] = arr[i]-48;
			arrCnt[arrInt[i]]++;
		}
		
		for(int i=0; i<arrCnt.length; i++)
		{
			System.out.println(i+"�� ���� : "+arrCnt[i]);
		}
		
	}
}
