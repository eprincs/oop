package alakzat;

public abstract class Has�b {
	private int height;
	public Has�b(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public abstract double baseArea();
	
	public double getVolume() {
		return baseArea() * this.height;
	}
	public boolean hasabCompare(Has�b other){
		if(this.getVolume()> other.getVolume() ) 
			return true;
		return false;
	}

}
