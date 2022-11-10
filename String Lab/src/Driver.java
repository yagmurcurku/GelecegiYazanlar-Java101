import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		str2 = "HELLO";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir yazı giriniz");
		String line = scanner.nextLine();
		System.out.println(line.toLowerCase());
		System.out.println(line.toUpperCase());
		System.out.println(line.charAt(0));
		
		System.out.println(line.length());
		System.out.println(line.substring(3));
		System.out.println(line.isEmpty());		//boş olup olmadığını belirliyor
		System.out.println(line.replace("ab", "wq"));
		
		System.out.println(line.indexOf('a'));
		System.out.println(line.lastIndexOf('a'));
		System.out.println(line.trim());
		
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("1.yazıyı giriniz: ");
		String string1 = scanner2.nextLine();
		System.out.println("2.yazıyı giriniz: ");
		String string2 = scanner2.nextLine();
		
		System.out.println(string1 + " " + string2);
		System.out.println(string1.concat(string2));
		
	}

}
