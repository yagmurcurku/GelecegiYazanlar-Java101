import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		for (int degisken : numbers) {
			System.out.println(degisken);
		}

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 adet sayı giriniz.");
		int[] numbers2 = new int[10];
		
		for(int i = 0; i < numbers2.length; i++) {
			numbers2[i] = scanner.nextInt();
		}
		
		for (int i : numbers2) {
			System.out.println(i);
		}
		
	}
}