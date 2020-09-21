package base_methods.equals;

public class PointColorNew extends Point {

	private String hexacode;
	
	public PointColorNew(double x, double y, String hexacode) {
		super(x, y);	
		this.hexacode = hexacode;
	}

	public String getHexacode() {
		return hexacode;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + hexacode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null && getClass() == obj.getClass() && obj instanceof PointColorNew pcNew) {
			
			return super.equals(pcNew) && this.hexacode.equalsIgnoreCase(pcNew.getHexacode());
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "PointColorNew [hexacode=" + hexacode + ", x=" + getX() + ", y=" + getY() + "]";
	}	
}