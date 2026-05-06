package sub7;

import java.util.Iterator;

import sub6.Animal;

/*
 * 날짜 : 2026/05/06
 * 이름 : 한성주
 * 내용 : Java 추상 클래스 실습
 */

public class AbstractTest {
	public static void main(String[] args) {
		
		sub6.Animal animal6 = new sub6.Animal(); // 추상클래스가 아니므로 생성 가능
	 // sub7.Animal animal7 = new sub7.Animal(); // 추상클래스 이므로 생성 불가능
		
		Animal tiger = new Animal();
		Animal eagle = new Animal();
		Animal shark = new Animal();
		
		Animal[] animals = {tiger, eagle, shark};
		
		for(Animal a : animals) {
			a.move();
		}
		
	}
}
