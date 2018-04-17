package könyv;

public class KonyvFut {

	public static void main(String[] args) {
		Konyv k1 = new Konyv("asdas", "Tomi", 2017, 10);

		System.out.println(k1.toString());
		k1.priceIncrement(50);
		System.out.println(k1.toString());
	}
}