package ujprojekt;
import java.util.Random;

public class ujprojekt {

	public static void main(String[] args) {
		int[] tomb = new int[10];
		Random rnd = new Random();
		
		for( int i=0; i<10; i++){
			tomb[i] = rnd.nextInt(50)+1;
		//	System.out.println(tomb[i] + " ");
			tomb[i] = (int)(Math.random() * 50) + 1;
			System.out.print(tomb[i] + " ");
		}
			System.out.println();
		for( int j=0; j<tomb.length; j++) {
			System.out.print(tomb[9-j] + " ");
		}
		
		int max = tomb[0];
		for (int i=0;i<tomb.length;i++) {
			if(tomb[i] > max)
				max = tomb[i];
		}
		System.out.println("A legnagyobb elem: " + max);

	}

}
