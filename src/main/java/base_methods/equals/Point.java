package base_methods.equals;

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
		final int prime = 31;
		int result = 1;
		
		long temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		temp = Double.doubleToLongBits(y);
		
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		if (this == obj)
			return true;
		
		if(obj instanceof Point other) {
			
			if (x != other.x || y != other.y)
				return false;
		}
		
		return true;
	}	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}