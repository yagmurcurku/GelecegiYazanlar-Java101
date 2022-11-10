import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int starCount = scanner.nextInt();
		
		//konsoldan girilen sayı kadar * yazıyor.
		int i = 0;
		while(i < starCount) {
			System.out.println("*");
			i++;
		}
		
		
		//konsoldan 0 girilene kadar olan sayıları topluyor.
		long total = 0;
		while(true) {
			int x = scanner.nextInt();
			if(x == 0) {
				break;
			}
			total += x;
		}
		System.out.println(total);
		
	}
}