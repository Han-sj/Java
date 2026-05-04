package sub5;

/*
 * 날짜 : 2026/05/04
 * 이름 : 한성주
 * 내용 : Java 상속 실습
 */

public class Car {
	// private에서 protected 접근 권한 변경해서 자식 클래스가 접근하도록 허용
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색상 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
