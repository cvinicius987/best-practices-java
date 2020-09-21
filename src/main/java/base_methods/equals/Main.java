package base_methods.equals;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		var main = new Main();
				
		main.comparePoint();
		
		main.comparePointColor();
		
		main.comparePointColorNew();
		
		main.collectionMixed();
		
		main.collectionPointNew();
	}
	
	/**
	 * Comparação de Points 
	 * 
	 * Aqui temos um resultado esperado pois o equals esta 
	 * devidamente tratado para comparar dois Points
	 */
	public void comparePoint() {
		
		System.out.println(" ============== Shape =============");
		var point1 = new Point(12.9,  13.898);
		var point2 = new Point(12.9,  13.89);
		var point3 = new Point(12.9,  13.89);
		
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));	
	}
	
	/**
	 * Comparação de PointColor
	 * 
	 * Aqui temos um problema no equals, pois se herdarmos o Equals
	 * de Point, só iremos comparar a igualdade do campos x e y
	 * e o campo color ficará fora da comparação
	 * 
	 * portanto uma comparacao entre new PointColor(12.9,  13.89, "#0000ff") e new PointColor(12.9,  13.89, "#fff")
	 * irá resultar em true, mesmo tendo cores diferentes
	 */
	public void comparePointColor() {
		
		System.out.println("\n ============== PointColor =============");
		var point1 = new PointColor(12.9,  13.89, "#0000ff");
		var point2 = new PointColor(12.9,  13.89, "#fff");
		var point3 = new PointColor(12.9,  13.89, "#000000");
		
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));		
	}
	
	/**
	 * Comparação de PointColorNew
	 * 
	 * Aqui o Equals funciona corretamente comparando PointColorNew de forma correta
	 */
	public void comparePointColorNew() {
		
		System.out.println("\n ============== PointColorNew =============");
		var point1 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point2 = new PointColorNew(12.9,  13.89, "#fff");
		var point3 = new PointColorNew(12.9,  13.89, "#000000");
		
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		System.out.println(point3.equals(point1));		
	}
	
	/**
	 * Comparação de Collection
	 * 
	 * Aqui o problema é que toda hierarquia é mutavel, inclusive a classe Point,
	 * onde cada classe tem seu equals implementando, ao criar um Set com varios elementos a
	 * consistencia não é garantida, na chamada do contains o equals será chamado mas devido
	 * equals() diferentes o resultado é false
	 */
	public void collectionMixed() {
		
		System.out.println("\n ============== Collection Mixed =============");
		
		var sets = new HashSet<Point>();
		
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		
		System.out.println(sets);
		System.out.println(sets.contains(new PointColor(12.9,  13.89, "#0000ff")));
	}
	
	/**
	 * Comparação de Collection
	 * 
	 * Aqui é criado um Set de PointColorNew, onde ser equals é corretamente implemnetado de acordo
	 * com os detalhes de identificação da classe
	 */
	public void collectionPointNew() {
		
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