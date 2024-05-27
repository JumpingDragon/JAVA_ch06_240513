
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		Calculator cal1 = new Calculator();
		//Calculator 클래스로 new 연산자를 사용하여 cal1객체를 생성
		
//		Calculator cal2 = new Calculator();
		// int a = cal1.add(100,200);
		a = cal1.add(100,200);
		System.out.println(a);
		
		b = cal1.pow(10);
		System.out.println(b);
		
		Car car = new Car(4); // Car 클래스로 car 라는 객체 선언
		
		System.out.println(car.company);
		car.speed = 150;
		
		System.out.println(car.speed);
		
		System.out.println(car.tire);
		
		System.out.println(car.price[0]);  // 번지가 찍힘.
		Car car2 = new Car(2);
		
		
		Car2 car2_1 = new Car2("기아자동차", "K5", "검은색", 200);
		
		System.out.println(car2_1.maxspeed);
		
		Car2 car2_2 = new Car2("기아자동차", "K5", "검은색");
		
		System.out.println(car2_2.model);
		
		Car2 car2_3 = new Car2();
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car2);
		
		System.out.println();
		
		MemberService memServ = new MemberService();
		boolean result = memServ.login("hong", "12345");
		System.out.println(result);
//		boolean result1 = memServ.logout("hong");
//		System.out.println(result1);
		
		
		Worker worker1 = new Worker("홍길동", 27, "01012341234", "서울 용산구");
		
	}

}
