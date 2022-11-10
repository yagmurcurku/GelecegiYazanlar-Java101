import java.util.Scanner;

public class Kare {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir kenarın uzunluğunu giriniz");
		int x = scanner.nextInt();
		
		//alan = x2
		//çevre = 4 * x
		
		int alan = (int)Math.pow(x, 2);
		int cevre = 4*x;
		
		System.out.println(alan);
		System.out.println(cevre);
	}
}