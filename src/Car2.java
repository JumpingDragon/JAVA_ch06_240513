
public class Car2 {
	
	// 생성자
	// 회사, 모델명, 색깔, 최고속도 모두 생성자를 통해 초기화되도록 생성자를 작성하시오.
	// 생성자 작성 후 MainClass에서 Car2 객체를 선언하시오.
	
	String company;
	String model;
	String color;
	int maxspeed;
	
	public Car2() {
	}
	
	public Car2(String com, String mo, String col, int maxsp) {
		this.company = com;
		this.model = mo;
		this.color = col;
		this.maxspeed = maxsp;
	}
	
	public Car2(String com, String mo, String col) {
		this.company = com;
		this.model = mo;
		this.color = col;
	}
	
}
