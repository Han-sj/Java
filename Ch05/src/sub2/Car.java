package sub2;

/*
 * 날짜 : 2026/04/29
 * 이름 : 한성주
 * 내용 : Java 클래스 기본 실습
 */

public class Car {

	// 속성(멤버 변수) : 무조건 private 선언
	private String brand;
	private String color;
	private int speed;
	
	// 기본 생성자
	public Car() {}
	
	// 생성자 : 속성을 초기화하는 메서드
	public Car(String brand, String color, int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	// Getter/Setter : 외부의 안전하게 속성 제공, 생성자 대신 초기화, 초기화된 속성값 수정
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//-------------------------
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//-------------------------
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
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
