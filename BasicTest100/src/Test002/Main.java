package Test002;

import java.util.ArrayList;

/*
 �Ǻ���ġ ������ ����ض�
 
- An = An-1 + An-2
- 1 1 2 3 5 8 13 21 34
- �迭, for
*/

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		
		for(int i=0; i<10; i++)
		{
			int a = list.get(i) + list.get(i+1);
			list.add(a);
		}
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
			
	}

}
