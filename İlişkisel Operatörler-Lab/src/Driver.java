import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		boolean sonuc = 7 > 5;
		System.out.println(sonuc);

		boolean sonuc2 = 9 < 5;
		System.out.println(sonuc2);
		
		boolean sonuc3 = 4 != 4;
		System.out.println(sonuc3);
		
		System.out.println("---------------");
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	}

}
