
public class Driver {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		
		System.out.println(a && b);	//a false ise cevap false, a ture ise VE operatörü hesaplar
		System.out.println(a || b); //a true ise cevap true, a false ise VEYA operatörü hesaplar
	
		System.out.println(!a);		//a nın tersi. Yani true ise false, false ise true verir.
	
		System.out.println(!a && b);
	}

}
