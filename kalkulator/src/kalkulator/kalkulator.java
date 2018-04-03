package kalkulator;

import java.util.Scanner;

public class kalkulator {

	public static void main(String[] args) {
		int number1=0;
		int number2=0;
		String op = "";
		int res = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kerem az elso szamot: ");
		number1 = sc.nextInt();
		
		System.out.println("Kerem az operandust: ");
		op = sc.next();
		
		System.out.println("Kerem a masodik szamot: ");
		number2 = sc.nextInt();
		
		
		
		switch (op) {
		case "+": res = number1 + number2;
			break;
			
		case "-": res = number1 - number2;
		break;
		
		case "*": res = number1 * number2;
		break;
		
		case "/": 
		if(number2 == 0)
			System.out.println("Nullaval nem osztunk kocsog");
		else	
			res = number1 / number2;
		break;
		}
		System.out.println("Eredmeny: " + res);


	}

}
