import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		int number = -10;
		
		boolean result = number > 0;
		
		if(result) {
			System.out.println(number + " pozitif bir sayıdır");
			System.out.println("2.");
		} else {
			System.out.println(number + " negatif bir sayıdır");
		}
			
		System.out.println("Burası her zaman çalıştırılacak.");

		
		System.out.println("------------------------------------");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int number2 = scanner.nextInt();
		if(number2 % 2 == 0) {
			System.out.println("Çift bir sayı girdiniz");
		} else {
			System.out.println("Tek bir sayı girdiniz");
		}
		
		
		System.out.println("------------------------------------");
		
		
		int number3 = 75;
		
		if(number3 < 100) {
			System.out.println("Sayınız 100'den küçük");
			if (number3 > 50) {
				System.out.println("Sayınız 50'den büyük");
			}
		}
		
		
		System.out.println("------------------------------------");
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int number4 = scanner.nextInt();
		
		if(number4 < 100 && number4 >= 10) {
			System.out.println("Girdiğiniz sayı 2 basamaklı");
		} else if(number4 < 1000 && number4 >= 100) {
			System.out.println("Girdiğiniz sayı 3 basamaklı");
		} else {
			System.out.println("Girdiğiniz sayı 10 & 999 arasında değildir!");
		}
		
		
		
		
	}
}