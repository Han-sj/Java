package sub1;

/*
 * 날짜 : 2026/05/11
 * 이름 : 한성주
 * 내용 : Java 예외처리 실습
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
