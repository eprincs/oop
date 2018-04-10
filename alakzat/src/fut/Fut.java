package fut;
import alakzat.Henger;
import alakzat.Téglatest;

public class Fut {

	public static void main(String[] args) {
		Henger h1 = new Henger(5, 10);
		
		System.out.println(h1.toString());
		System.out.println("A h1. térfogata: " + h1.getVolume());
		
		System.out.println(" ");
		Téglatest t1 = new Téglatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("A t1. térfogata: " + t1.getVolume());
		
		

	}

}
