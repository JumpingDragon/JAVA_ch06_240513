import java.lang.Math;

public class Calculator { 

	int firstNum;
	int secondNum;
	//메소드
	//def add(firstNum, secondNum):
	//	return firstNum + secondNum
	//  add(10,20) -> 30
	public int add(int first, int second) {
		int sum = first + second;
		return sum;// 반환 값 타입을 꼭 써줘야 한다. 이게 메서드
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
	public int mul(int first, int second) {
		return first * second;
	}
	public int div(int first, int second) {
		return first / second;
	}
	public int pow(int number) {
		return number*number;
	}
	
	public double pow(int number, int num2) {
		return Math.pow(number, num2);
	}
	

}
