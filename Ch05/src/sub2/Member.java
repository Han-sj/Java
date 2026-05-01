package sub2;

public class Member {
	private String name;
	private int age;
	private boolean isActive;
	
	public Member() {}
	
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// -------------------
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// -------------------
	public void getIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	// 생성자
	public Member(String name, int age, boolean isActive) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

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
