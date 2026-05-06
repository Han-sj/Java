package sub7;

/*
 * 날짜 : 2026/05/04
 * 이름 : 한성주
 * 내용 : Java 다형성 실습
 */

public class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("Eagle fly...");
	}
	
	// 부모 클래스의 추상메서드를 자식 클래스에서 반드시 구현
	@Override
	public void hunt() {
		System.out.println("Eagle hunt...");
	}	
}
