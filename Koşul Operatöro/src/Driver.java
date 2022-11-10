import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yaşınız: ");
		int age = scanner.nextInt();
		
		System.out.println(age >= 18 ? "Ehliyet alabilirsiniz." : "Ehliyet alamazsınız.");
		
	}

}
