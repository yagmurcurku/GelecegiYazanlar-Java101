import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[] numbers = {1,5,-5,9,2,8,9};
		
		int total = 0;
		
		for ( int i=0; i<numbers.length; i++) {
			total = total + numbers[i];
		}
		
		System.out.println(total);
		
		System.out.println("---------------------");
		
		
		int[] numbers2 = new int[numbers.length];
		for(int i = 0; i<numbers.length; i++) {
			numbers2[i] = numbers[i];
		}
		
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		
		
		System.out.println("---------------------");
		
		
		
	}

}
