package alakzat;

public class T�glatest extends Has�b {
	private double a;
	private double b;
	
	public T�glatest(double a, double b, int height) {
		super(height);
		this.a = a;
		this.b = b;
	}
	public double baseArea() {
		return a*b;
	}
	public String toString() {
		return "A t�glatest adatai: [a oldal: " + this.a + "b oldal:" + this.b + "magass�g: " + super.getHeight() + "]";
	}
	
}
