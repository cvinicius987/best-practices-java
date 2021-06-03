package equals;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	@Override
	public int hashCode() {
				
		long result = Double.doubleToLongBits(x);
		
		result = 31 * result + Double.doubleToLongBits(y);
		
		return (int)result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Point other) {
			
			if (this == obj || (Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0)) {
				return true;
			}
		}
		
		return false;
	}	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}