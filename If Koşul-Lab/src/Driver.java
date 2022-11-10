import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sınav notu:");
		
		int score = scanner.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("AA");
		} else if (score >= 85 && score < 90) {
			System.out.println("BA");
		} else if (score >= 80 && score < 85) {
			System.out.println("BB");
		} else if (score >= 75 && score < 80) {
			System.out.println("BC");
		} else if (score >= 70 && score < 75) {
			System.out.println("CC");
		} else if (score >= 65 && score < 70) {
			System.out.println("DC");
		} else if (score >= 60 && score < 65) {
			System.out.println("DD");
		} else if (score >= 50 && score < 60) {
			System.out.println("FD");
		} else if (score >= 0 && score < 50) {
			System.out.println("FF");
		} else {
			System.out.println("Lütfen 0-100 arasında bir sayı giriniz.");
		}
		
	}

}
