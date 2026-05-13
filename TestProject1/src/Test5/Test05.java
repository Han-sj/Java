package Test5;

class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Apple [Country: " + country + ", " + "Price : " + price + "]";
	}
			
}

class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Banana [Country: " + country + ", " + "Price : " + price + "]";
	}
	
	
}

class Grape {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Grape [Country: " + country + ", " + "Price : " + price + "]";
	}
	
}


public class Test05 {

	public static void main(String[] args) {
	    Apple apple = new Apple("한국", 3000);
	    Banana banana = new Banana("미국", 2000);
	    Grape grape = new Grape("일본", 1000);

	    showInfo(apple);
	    showInfo(banana);
	    showInfo(grape);
	}

	public static void showInfo(Object fruit) {
	    if (fruit instanceof Apple) { // 빈칸 유지
	        Apple apple = (Apple) fruit; 
    		System.out.println(apple); // 빈칸 유지
	    } else if (fruit instanceof Banana) { // 빈칸 유지
	        Banana banana = (Banana) fruit;
    		System.out.println(banana); // 빈칸 유지
	    } else if (fruit instanceof Grape) { // 빈칸 유지
	        Grape grape = (Grape) fruit;
    		System.out.println(grape); // 빈칸 유지
	    }
	}
}
