package Test3;

class Product {
    private String name;
    private int stock;
    private int price;

    public void setName(String name) {
		this.name = name;
	}
    public void setStock(int stock) {
		this.stock = stock;
	}
    public void setPrice(int price) {
		this.price = price;
	}
    // 3. show 메서드 (상품 정보를 출력하는 메서드)
    public void show() {
    	System.out.println("-------------------");
    	System.out.println("제품명 : " + this.name);
    	System.out.println("재고 : " + this.stock);
    	System.out.println("가격 : " + this.price);
    }
}

public class Test08 {
    public static void main(String[] args) {
        // 첫 번째 상품 생성 및 설정
        Product p1 = new Product();
        p1.setName("노트북");
        p1.setStock(10);
        p1.setPrice(1_500_000);
        p1.show();

        // 두 번째 상품 생성 및 설정
        Product p2 = new Product();
        p2.setName("스마트폰");
        p2.setStock(30);
        p2.setPrice(1_200_000);
        p2.show();
    }
}