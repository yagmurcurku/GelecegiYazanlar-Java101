import java.util.Scanner;

public class Ters {

	public static void main(String[] args) {
		//girilen text'in tersten yazdırılması:
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz:");
		String text = scanner.nextLine();
		
		for (int i = text.length()-1; i >= 0; i--) {
			System.out.println(text.charAt(i));
		}

	}

}
