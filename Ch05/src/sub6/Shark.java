package sub6;

/*
 * 날짜 : 2026/05/04
 * 이름 : 한성주
 * 내용 : Java 다형성 실습
 */

public class Shark extends Animal{
	
	@Override
	public void move() {
		System.out.println("Shark swim...");
	}
	
	public void hunt() {
		System.out.println("Shark hunt...");
	}
	
}
