package Test014;

/*
 * 입력된 숫자의 개수를 출력하라
 * 134544453
 * 1 몇 개 ~ 3 몇 개 ~
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
			System.out.println(i+"의 개수 : "+arrCnt[i]);
		}
		
	}
}
