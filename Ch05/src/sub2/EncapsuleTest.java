package sub2;

/*
 * 날짜 : 2026/04/29
 * 이름 : 한성주
 * 내용 : Java 캡슐화 실습
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		Car avante = new Car();
		// 세터 초기화
		avante.setBrand("아반떼");
		avante.setColor("검정색");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());
				
		// 객체 초기화 → 캡슐화된 속성을 생성자로 초기화
		// sonata.brand = "소나타"
		// sonata.color = "흰색"
		// sonata.speed = 0;
		
		// 속성값 수정
		// sonata.color = "은색";
		// sonata.setColor("은색");
		
		sonata.show();
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "110-11-1234", "김유신", 1000);
		
		Account wr = new Account();
		// 세터 초기화
		wr.setBank("우리은행");
		wr.setId("110-44-1101");
		wr.setName("김춘추");
		wr.setBalance(1000);
		
		System.out.println("은행명: " + wr.getBank());
		System.out.println("계좌번호: " + wr.getId());
		System.out.println("이름: " + wr.getName());
		System.out.println("입급금액: " + wr.getBalance());
		
		// Book 객체 생성
		Book java = new Book("이것이 자바다", "신용권", 1);
		Book html = new Book();
		
		html.setTitle("웹표준의 정석");
		html.setAuthor("고경희");
		html.setCopies(2);
		
		java.show();
		html.show();
		
		// Member 객체 생성
		Member kim = new Member("김유신", 24, false);
		Member lee = new Member();
		
		lee.setName("김춘추");
		lee.setAge(32);
		lee.setActive(true);
		
		kim.show();
		lee.show();
		
		// Movie 객체 생성 및 생성자 초기화
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 350);
	
	}
}