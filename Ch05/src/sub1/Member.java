package sub1;

public class Member {
	String name;
	int age;
	boolean isActive;
	
	public void activate() {
		this.isActive = true;
	}
	
	public void deactivate() {
		isActive = false;
	}
	
	public boolean isAult() {
		if (age >= 20) {
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		System.out.println("회원명 : " + name);
		System.out.println("회원나이 : " + age);
		System.out.println("활성여부 : " + isActive);
	}
}
