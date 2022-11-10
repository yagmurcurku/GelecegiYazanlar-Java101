import java.util.Scanner;

public class VizeHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize Notu:");
		int vizeNotu = scanner.nextInt();
		
		System.out.println("Final Notu:");
		int finalNotu = scanner.nextInt();

		float ortalama = (vizeNotu * 0.40f) + (finalNotu * 0.60f);
		
		if(ortalama >= 50 && finalNotu >= 50) {
			System.out.println("TEBRİKLER, GEÇTİNİZ !");
		} else {
			System.out.println("Kaldınız.");
		}
	
	}

}
