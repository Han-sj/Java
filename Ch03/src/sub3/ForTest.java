package sub3;

import java.util.Iterator;

/*
 * 날짜 : 2026/04/27
 * 이름 : 한성주
 * 내용 : Java 반복문 For 실습
 */
public class ForTest {
	public static void main(String[] args) {
		// For 기본
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
		
		// 1부터 10까지 합
		int sum = 0;
		for (int k = 1; k <= 10; k++) {
			sum = sum + k;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지 짝수 합
		int tot = 0;
		for (int k = 0; k <= 10; k++) {
			if (k % 2 == 0) {
				tot += k;
			}
		}
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		// for 중첩
		for (int a = 1; a <= 3; a++) {
			System.out.println("a : " + a);
			for (int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}
			/*
			for (int c = 1; c <= 3; c++) {
				System.out.println("c : " + c);
			}
			*/
		}
		
		// 구구단
		for (int x = 2; x <= 9; x++) {
			System.out.println(x + "단");
			for (int y = 1; y <= 9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
		}
		
		// 별 삼각형
		for (int start = 1;  start <= 10; start++) {
			for (int end = 1; end <= start; end++) {
				System.out.print("☆");
			}
			System.out.print("\n"); // 개행(줄 바꿈)
		}
		
		System.out.println(" ");
		
		// 역삼각형
		for (int start1 = 1;  start1 <= 10; start1++) {
			for (int end1 = 10; end1 >= start1; end1--) {
				System.out.print("☆");
			}
			System.out.print("\n"); // 개행(줄 바꿈)
		}
	}
	
	
	
}
