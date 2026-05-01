package sub1;

/*
 * 날짜 : 2026/04/29
 * 이름 : 한성주
 * 내용 : Java 클래스 기본 실습
 */

public class Car {

	// 속성(멤버 변수)
	String brand;
	String color;
	int speed;
	
	// 기능(멤버 메서드)
	public void speedup(int speed) {
		// this : 클래스의 멤버 변수를 참조하는 키워드
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.brand);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
} 
