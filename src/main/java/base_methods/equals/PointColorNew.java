package base_methods.equals;

import java.util.HashSet;

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
		
		if(obj instanceof PointColorNew pcNew) {
			
			return super.equals(pcNew) && this.hexacode.equalsIgnoreCase(pcNew.getHexacode());
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "PointColorNew [hexacode=" + hexacode + ", x=" + getX() + ", y=" + getY() + "]";
	}	
	
	/**
	 * Comparação de PointColorNew
	 * 
	 * Aqui o Equals funciona corretamente comparando PointColorNew de forma correta
	 * utilizando os dados de Point e o seu atributo hexacode
	 */
	public static void main(String[] args) {
				
		System.out.println("\n ============== PointColorNew =============");
		
		var point1 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point2 = new PointColorNew(12.9,  13.89, "#fff");
		var point3 = new PointColorNew(12.9,  13.89, "#000000");
		
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));		
		
		System.out.println("\n ============== Collection PointNew =============");
		
		var sets = new HashSet<PointColorNew>();
		
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#ff0000"));
		sets.add(new PointColorNew(12.9,  13.20, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#ff0000"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		
		System.out.println(sets);
		System.out.println(sets.contains(new PointColorNew(12.9,  13.89, "#0000ff")));
	}
}