package Test001;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. �л��������� �����ϰ�, �л��̸�����
 �˻������� �й��� ����ϴ� ���α׷� �ۼ�.

- Student Ŭ���� ����
String name, no�� ���� (�̸��� �й�)

�л����� ArrayList�� ����1

�˻��� �ϰڴ��� y
�����ϰ������ n

�л��̸����ִ°�� ���л��� �й��� ����
�л��̸��� ������, ���� �л��̸��̶�� ���

*/

public class Main {
	
	public static void main(String[] args)
	{
		Student st1 = new Student("�տ���", "1214");
		Student st2 = new Student("���Ȱ�", "1521");
		Student st3 = new Student("�����", "4523");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		/*
		for (Student stu : list)
		{
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		*/
		
		// equals �� ���� �� == �� ������ �ּҰ��� ��
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		while (true)
		{
			System.out.println("��� �˻� y, ���� n");
			String input = scan.next();
			
			if(input.equals("y"))
			{
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = scan.next();
				
				// flag�� ����ؼ� if���� ���ƴ���/�ƴ��� ����
				boolean flag = false;
			
				for (Student stu: list)
				{
					if(stu.getName().equals(name)) // ��ġ�ϴ� �̸��� ���� ���
					{
						System.out.println("�ش��ϴ� �л��� �й��� : " + stu.getNo());
						flag = true;
						// break; (�ʿ� ����)
					}

					/* 
					�̷��� �ϸ� �ȵ�.
					���Ȱ� �˻� ��, �տ����� ������ ���ϰ� ����� ���� ����.
					if(!stu.getName().equals(name))
					{
						System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
					}
					*/
				}

				if (!flag)
					System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
			}
			else if(input.equals("n"))
			{
				break;
			}
			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
