
public class Student {
	
	String name;
	String hakbun;
	int age;
	String grade;
	String address;
	
	
	public Student(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	
	public Student() { //기본 생성자
		super(); // 부모 클래스의 생성자 호출
		// TODO Auto-generated constructor stub
	}
	
	public void printName() { //리턴값이 없는 메소드 -> void
		System.out.println("학생이름:"+this.name);
		
	}
	
}
