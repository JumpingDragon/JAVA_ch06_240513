
public class Rectangle {
	
	//메소드 오버로딩
	public int area(int width) { // 정사각형
		return width * width;
	}
	
	//
	public int area(int width, int height) { // 직사각형
		return width * height;
	}
}
