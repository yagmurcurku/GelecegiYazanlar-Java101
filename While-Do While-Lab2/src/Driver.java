import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 100;
		
		while(x < y) {
			if(x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		}
		
		
		int a = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(a < 10) {
			int input =  scanner.nextInt();
			if(input < min) min = input;
			if(input > max) max = input;
			a++;
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		
	}
}
