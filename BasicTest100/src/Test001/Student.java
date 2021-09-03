package Test001;

public class Student {
	private String name;
	private String no;
	
	
	// 생성자(초기화 용)
	public Student(String name, String no)
	{
		super();
		this.name = name;
		this.no = no;
	}
	
	// getter와 setter
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no = no;
	}
}
