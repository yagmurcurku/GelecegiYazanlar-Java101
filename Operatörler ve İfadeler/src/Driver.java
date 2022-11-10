import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		int x;
		x = 10;		//atama
		//x++;   // aynısı:  x = x + 1;
		
		System.out.println(x++);
		System.out.println(x);

		System.out.println(--x);
		
		System.out.println(5%2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int a = scanner.nextInt();
		System.out.println(a % 2 == 0 ? "Çift sayı:" : "Tek sayı:");
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen parolanızı giriniz");
		String password = scanner2.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "Giriş başarılı." : "Hatalı parola!");
	}
}