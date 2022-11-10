import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		//yarıçapı verilen bir dairenin alanını ve çevresini hesaplama

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen yarıçapı giriniz:");
		int yaricap = scanner.nextInt();
		
		//alan = pi * r2
		//çevre = 2 * pi* r
		
		float alan = (float)(Math.PI * Math.pow(yaricap, 2));
		float cevre = (float)(2 * Math.PI * yaricap);
		
		System.out.println(alan);
		System.out.println(cevre);
	}

}
