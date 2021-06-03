package equals;

public class PointColor extends Point {

	private String hexacode;
	
	public PointColor(double x, double y, String hexacode) {
		super(x, y);	
		this.hexacode = hexacode;
	}

	public String getHexacode() {
		return hexacode;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);		
	}

	@Override
	public String toString() {
		return "PointColor [hexacode=" + hexacode + ", x=" + getX() + ", y=" + getY() + "]";
	}
}