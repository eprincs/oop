package fut;
import alakzat.Henger;
import alakzat.T�glatest;

public class Fut {

	public static void main(String[] args) {
		Henger h1 = new Henger(5, 10);
		
		System.out.println(h1.toString());
		System.out.println("A h1. t�rfogata: " + h1.getVolume());
		
		System.out.println(" ");
		T�glatest t1 = new T�glatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("A t1. t�rfogata: " + t1.getVolume());
		
		

	}

}
