import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[] numbers = {20,32,12,46,4};
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 12));	//12 elemanının kaçıncı sırada old.'nu yazdırır
		System.out.println(Arrays.binarySearch(numbers, 10));
		
		int[] copyOf = Arrays.copyOf(numbers,3);			//3 tane eleman kopyaladı(20,32,12)
		System.out.println(Arrays.toString(copyOf));
		
		int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4);	//2.indeksten 4.indekse kadar aldı. 4.dahil değil!
		System.out.println(Arrays.toString(copyOfRange));
		
		//Arrays.fill(numbers, 44);			//numbers dizisinin karakterleri 44 olarak değiştirildi(hepsi)
		//System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);			//dizi içerisindeki elemanları küçükten büyüğe doğru sıraladı
		System.out.println(Arrays.toString(numbers));
		
	}

}
