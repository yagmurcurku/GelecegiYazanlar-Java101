
public class Driver {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		float y2 = 20f;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x / y2);
		
		System.out.println("------------------------");

		System.out.println(5 % 2);
		System.out.println(8 % 3);
		
		System.out.println("------------------------");
		
		int a = 10;
		a = a + 2;
		a += 2;
		System.out.println(a);

		System.out.println("------------------------");
		
		int q = 12;
		System.out.println(q++);	//önce q ekrana yazıldı sonra 1 eklendi
		System.out.println(q);		//1 eklenmiş halini görmek için yazıldı.

		System.out.println(++q);	//önce 1 eklendi, sonra q ekrana yazıldı
		
		
	}

}
