package Ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		
		System.out.println(z + 2);
		
		if (Double.isFinite(z) || Double.isNaN(z)) {
		}else {
			System.out.println(z + 2);
		}
	}
}

