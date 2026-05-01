package sub2;

/*
 *  날짜 : 2026/04/27
 *  이름 : 한성주
 *  내용 : 다양한 출력 실습
 */

public class PrintTest {
	public static void main(String[] args) {
		// println : 라인 출력문
		System.out.println("Hello Java!"); // println(Print Line) : 문자열 출력 이후 라인(다음 줄) 이동
		System.out.println("Welcome Java!");
		
		// print : 기본 출력문
		System.out.print("Greeting Java!");
		System.out.print("Hey Java!"); // print : 문자열 출력 이후 라인 유지
		System.out.print("\n"); // \n : 이스케이프 문자, New Line
		
		// printf : 포맷 출력문
		System.out.printf("number : %d\n", 27); // %d : decimal, 숫자 출력
		System.out.printf("My name is %s", "한성주"); // %s : string, 문자열 출력
		
	}
}
