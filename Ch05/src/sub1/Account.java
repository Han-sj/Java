package sub1;

/*
 * 날짜 : 2026/04/29
 * 이름 : 한성주
 * 내용 : Java 클래스 기본 실습
 */

public class Account {
	// 속성(필드)
	String bank;
	String id;
	String name;
	int balance;
	
	// 기능
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}
}
