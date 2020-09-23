package base_methods.equals;

import java.util.HashSet;

public class Main {

	/**
	 * Comparação de Collection
	 * 
	 * Aqui o problema é que toda hierarquia é mutavel, inclusive a classe Point,
	 * onde cada classe tem seu equals implementando, ao criar um Set com varios elementos a
	 * consistencia não é garantida, na chamada do contains o equals será chamado mas devido
	 * equals() diferentes o resultado é false
	 */
	public static void main(String[] args) {
		
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
}