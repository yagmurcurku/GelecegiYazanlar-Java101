import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[16];		//16 karakterlik boş bir int türünde dizi oluşturuldu
		System.out.println(Arrays.toString(numbers));	//diziyi ekrana yazdı

		numbers[5] = 32;		//numbers dizisinin 5 indeksli elemanının değeri 32 yapıldı.
		System.out.println(numbers[5]);

		int[] numbers2 = {1,2,3,4,5,6,7,8,9};
		System.out.println(numbers2[5]);
		
		System.out.println(numbers2.length);		//dizinin eleman sayısını verir
	
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		names[2] = "Ali";
		System.out.println(Arrays.toString(names));

		
	}

}
