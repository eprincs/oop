package polynomial;
import math.IPolynomial;

public class LinearPolynomial implements IPolynomial {
	private double a;
	private double b;
	

public LinearPolynomial(double a, double b) {
	super();
	this.a = a;
	this.b = b;
}

/*	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double a;
	private double b;
	*/

	
	public double getY(double x) {
		return this.a * x + this.b;
	}
	public int getGrade() {
		return 1;
	}
	public String toString() {
		if (this.b>0)
			return "y= " + a + " * x " + this.b;
		else if (this.b<0)
			return "y= " + this.a + " * x " + "- " + this.b;
		else
			return "y= " + this.a + " * x " + "+ " + 0;
	}
}
