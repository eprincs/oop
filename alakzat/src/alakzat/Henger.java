package alakzat;

public class Henger extends Hasáb {
	private double radius;
	
	public Henger(int radius, int height) {
		super(height);
		this.radius = radius;
	}
	@Override
	public double baseArea() {
		return this.radius * this.radius*Math.PI;
	}
	public String toString() {
		return "A henger adatai: sugár: " + this.radius + " magassag: " + super.getHeight();
		
	}
	

}
