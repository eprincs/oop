package myproductsRun;
//import myproducts.Bread;
//import myproducts.Product;
import myproducts.*;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = new Product("Product1", 300, 27);
		Bread b1 = new Bread ("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());
		
		System.out.println();
		
		int priceCompare = p1.productCompare(b1);
		if(priceCompare == 1)
			System.out.println("A p1 ara a nagyobb.");
		else if(priceCompare == -1)
			System.out.println("A b1 ara a nagyobb");
		else
			System.out.println("A p1 es b1 ara megegyezik.");
		
		System.out.println();
		
		//Bread product2 = (Bread) new Product ("b2", 150, 15);
		Bread b2 = new Bread("Bread2", 150, 24, 3);
		Product product2 = b2;
		
		System.out.println("A product2 adatai: " + product2.toString());
		
		System.out.println(" ");
		Bread bread2 = new Bread("bread2", 200, 20, 3);
		boolean res = Bread.BreadPriceCompare((Bread) product2, bread2);
		if(res)
			System.out.println("A product2 ara a nagyobb");
		else
			System.out.println("A bread2 ara a nagyobb");
	}

}
