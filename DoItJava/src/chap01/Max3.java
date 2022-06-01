package chap01;
import java.util.Scanner;

/*
 실습 1-1 : 3개의 정숫값 입력하고 최댓값 구하
 */

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값 구함");
		System.out.println("a : ");
		int a = stdIn.nextInt();
		System.out.println("b : ");
		int b = stdIn.nextInt();
		System.out.println("c : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		System.out.println("최댓값은 " +  max + "입니다.");
	
	}

}
