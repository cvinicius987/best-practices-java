package base_methods.equals;

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
	
	/**
	 * Comparação de PointColor
	 * 
	 * Aqui temos um problema no equals, pois se herdarmos o Equals
	 * de Point, só iremos comparar a igualdade do campos x e y
	 * e o campo hexacode ficará fora da comparação
	 * 
	 * Portanto, uma comparacao entre new PointColor(12.9,  13.89, "#0000ff") e new PointColor(12.9,  13.89, "#fff")
	 * irá resultar em true, mesmo tendo cores diferentes
	 */
	public static void main(String[] args) {
			
		System.out.println("\n ============== PointColor =============");
		
		var point1 = new PointColor(12.9,  13.89, "#0000ff");
		var point2 = new PointColor(12.9,  13.89, "#fff");
		var point3 = new PointColor(12.9,  13.89, "#000000");
		
		System.out.println(point1.equals(null));
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));		
	}
}