package equals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import equals.PointColorNew;
import org.junit.jupiter.api.Test;

/**
 * Comparação de PointColorNew
 * 
 * Aqui o Equals funciona corretamente comparando PointColorNew de forma correta
 * utilizando os dados de Point e o seu atributo hexacode
 */
public class PointColorNewTest {
	
	@Test
	public void when_equals_result_true() {
		
		var point1 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point2 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point3 = new PointColorNew(12.9,  13.89, "#0000ff");
		
		assertTrue(point1.equals(point2));
		
		assertTrue(point2.equals(point3));
		
		assertTrue(point3.equals(point1));
	}	
	
	@Test
	public void when_equals_result_false() {
		
		var point1 = new PointColorNew(12.9,  13.89, "#fff");
		var point2 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point3 = new PointColorNew(12.9,  13.89, "#ff0000");
		
		assertFalse(point1.equals(null));
		
		assertFalse(point1.equals(point2));
		
		assertFalse(point2.equals(point3));
		
		assertFalse(point3.equals(point1));
	}	
	
	@Test
	public void when_hashcode_should_equal() {
		
		var point1 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point2 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point3 = new PointColorNew(12.9,  13.89, "#0000ff");
				
		assertEquals(point1.hashCode(), point2.hashCode());
		
		assertEquals(point2.hashCode(), point3.hashCode());
		
		assertEquals(point3.hashCode(), point1.hashCode());
	}	
	
	@Test
	public void when_hashcode_should_not_equal() {
		
		var point1 = new PointColorNew(12.9,  13.89, "#fff");
		var point2 = new PointColorNew(12.9,  13.89, "#0000ff");
		var point3 = new PointColorNew(12.9,  13.89, "#ff0000");
		
		assertNotEquals(point1.hashCode(), point2.hashCode());
		
		assertNotEquals(point2.hashCode(), point3.hashCode());
		
		assertNotEquals(point3.hashCode(), point1.hashCode());
	}	
	
	@Test
	public void when_collectionHashset_should_not_equal() {
		
		var sets = new HashSet<PointColorNew>();
		
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#ff0000"));
		sets.add(new PointColorNew(12.9,  13.20, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#ff0000"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
		sets.add(new PointColorNew(12.9,  13.89, "#0000ff"));
	
		assertSame(3, sets.size());
		assertTrue(sets.contains(new PointColorNew(12.9,  13.89, "#0000ff")));
	}
}