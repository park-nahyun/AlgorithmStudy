package Test001;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. 학생정보들을 저장하고, 학생이름으로
 검색했을때 학번을 출력하는 프로그램 작성.

- Student 클래스 생성
String name, no를 가짐 (이름과 학번)

학생들을 ArrayList에 저장1

검색을 하겠느냐 y
종료하고싶으면 n

학생이름이있는경우 그학생의 학번을 저장
학생이름이 없으면, 없는 학생이름이라고 출력

*/

public class Main {
	
	public static void main(String[] args)
	{
		Student st1 = new Student("손오공", "1214");
		Student st2 = new Student("저팔계", "1521");
		Student st3 = new Student("사오정", "4523");
		
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
		
		// equals 는 값을 비교 == 은 변수의 주소값을 비교
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		while (true)
		{
			System.out.println("계속 검색 y, 종료 n");
			String input = scan.next();
			
			if(input.equals("y"))
			{
				System.out.println("검색을 시작합니다.");
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				// flag를 사용해서 if문을 거쳤는지/아닌지 검토
				boolean flag = false;
			
				for (Student stu: list)
				{
					if(stu.getName().equals(name)) // 일치하는 이름이 있을 경우
					{
						System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
						flag = true;
						// break; (필요 없음)
					}

					/* 
					이렇게 하면 안됨.
					저팔계 검색 시, 손오공만 꺼내서 비교하고 결과가 나와 버림.
					if(!stu.getName().equals(name))
					{
						System.out.println("일치하는 이름이 없습니다.");
					}
					*/
				}

				if (!flag)
					System.out.println("일치하는 이름이 없습니다.");
			}
			else if(input.equals("n"))
			{
				break;
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
