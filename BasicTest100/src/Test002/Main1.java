package Test002;

public class Main1 {
	public static void main(String[] args)
	{
		int []arr = new int[100];
		
		// An = An-1 + An-2; n>=3
		// a1 = 1, a2 = 1
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<=10; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		// 2번 째 방법 (array를 쓰지 않고)
		
		System.out.println();
		System.out.println();

		
		int prevPrevNum = 1; // An-2
		int prevNum = 1;	 // An-1
		
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for (int i=3; i<=10; i++)
		{
			int num = prevPrevNum + prevNum;
			System.out.print(num + " ");
			
			
			prevPrevNum = prevNum;
			prevNum = num;
			
		}
	}
}
