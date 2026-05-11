package sub3;

/*
 * 날짜 : 2026/05/11
 * 이름 : 한성주
 * 내용 : Java 내장 클래스 - StringBuilder 실습
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String 불변성(immutable)으로 인한 메모리 낭비
		String str = "Java";
		System.out.println("str : " + str);
		
		str += "Programming";
		System.out.println("str : " + str);
		
		// StringBuilder로 메모리 절약
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb : " + sb);
		
		sb.append("Programming");
		System.out.println("sb : " + sb);
		
	}
}
