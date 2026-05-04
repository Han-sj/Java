package sub4;

/*
 * 날짜 : 2026/05/04
 * 이름 : 한성주
 * 내용 : Java 상속 실습
 */

public class Sedan extends Car {

	private int cc; // 배기량
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모 Car의 생성자 호출
		this.cc = cc;
		
	}
	
	public void drive() {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // 부모(super)의 show() 호출
	}
	
}
