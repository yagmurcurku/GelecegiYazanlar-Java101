
public class Driver {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		if(x > y) {
			System.out.println("x, y'den büyüktür");
		} else {
			System.out.println("x, y'den küçüktür");
		}
		
		
		
		System.out.println(x > y ? "x, y'den büyüktür" : "x, y'den küçüktür");

	}

}
