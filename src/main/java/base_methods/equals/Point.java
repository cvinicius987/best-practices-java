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
	
	/**
	 * Comparação de Points 
	 * 
	 * Aqui temos um resultado esperado pois o equals esta 
	 * devidamente tratado para comparar dois Points
	 */
	public static void main(String[] args) {
		
		System.out.println(" ============== Point =============");
		
		var point1 = new Point(12.9,  13.898);
		var point2 = new Point(12.9,  13.89);
		var point3 = new Point(12.9,  13.89);
		
		System.out.println(point1.equals(null));
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));	
	}
}