package ketteskee;

import java.util.Scanner;

public class ketteskee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int egyutt[]=new int[3];
		int a=0;
		int b=0;
		int c=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kerem az 1. egyutthatot: ");
		egyutt[0] = sc.nextInt();
		
		System.out.println("Kerem az 2. egyutthatot: ");
		egyutt[1] = sc.nextInt();
		
		System.out.println("Kerem az 3. egyutthatot: ");
		egyutt[2] = sc.nextInt();
		
		sc.close();
		
		a = egyutt[0];
		b = egyutt[1];
		c = egyutt[2];
		
		double diszkriminans=0;
		
		diszkriminans = Math.sqrt((b*b)-4*a*c);
		
		if(Double.isNaN(diszkriminans)) {
		System.out.println("nincs valos eredmeny");
	} else {
		double x1=(b*(-1) + diszkriminans / (2 * a));
		double x2=(b*(-1) - diszkriminans / (2 * a));
		System.out.println("Elso szam " +x1+ "A masodik szam"+ x2);
	}

}
}