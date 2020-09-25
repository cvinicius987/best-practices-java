package base_methods.equals;

import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Comparação de Collection
 * 
 * Aqui o problema é que toda hierarquia é mutavel, inclusive a classe Point,
 * onde cada classe tem seu equals implementando, ao criar um Set com varios elementos a
 * consistencia não é garantida, na chamada do contains o equals será chamado mas devido
 * equals() diferentes o resultado é false
 */
public class CollectionPointTest {
	
	@Test
	public void when_mixedCollection_result_undefined() {
		
		var sets = new HashSet<Point>();
		
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new Point(12.9,  13.89));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		
		Assertions.assertSame(2, sets.size());
		Assertions.assertTrue(sets.contains(new PointColor(12.9,  13.89, "#0000ff")));
	}	
}