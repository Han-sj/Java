package sub5;

/*
 * 날짜 : 2026/05/04
 * 이름 : 한성주
 * 내용 : Java 상속 실습
 */

public class Truck extends Car {
	private int capacity; // 적재용량
	private final int MAX_SPEED = 160;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	
	@Override
	public void speedUp(int speed) {
		// 부모 클래스에 있는 speedUp을 자식 클래스에 맞게 재정의
		this.speed = speed;
		if (speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색상 : " + color);
		System.out.println("적재량 : " + this.capacity);
		System.out.println("현재속도 : " + speed);
	}
}
