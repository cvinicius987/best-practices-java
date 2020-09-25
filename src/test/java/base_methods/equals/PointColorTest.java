package base_methods.equals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
public class PointColorTest {
	
	@Test
	public void when_equals_result_true() {
		
		var point1 = new PointColor(12.9,  13.89, "#0000ff");
		var point2 = new PointColor(12.9,  13.89, "#fff");
		var point3 = new PointColor(12.9,  13.89, "#000000");
		
		assertTrue(point1.equals(point2));
		
		assertTrue(point2.equals(point3));
		
		assertTrue(point3.equals(point1));
	}	
	
	@Test
	public void when_hashcode_result_should_equal() {
		
		var point1 = new PointColor(12.9,  13.89, "#0000ff");
		var point2 = new PointColor(12.9,  13.89, "#fff");
		var point3 = new PointColor(12.9,  13.89, "#000000");
		
		assertEquals(point1.hashCode(), point2.hashCode());
		
		assertEquals(point2.hashCode(), point3.hashCode());
		
		assertEquals(point3.hashCode(), point1.hashCode());
	}	
	
	@Test
	public void when_hashcode_result_should_not_equal() {
		
		var point1 = new PointColor(12.6,  13.898,"#0000ff");
		var point2 = new PointColor(12.12,  19.89, "#fff");
		var point3 = new PointColor(12.10,  15.89, "#000000");
		
		assertNotEquals(point1.hashCode(), point2.hashCode());
		
		assertNotEquals(point2.hashCode(), point3.hashCode());
		
		assertNotEquals(point3.hashCode(), point1.hashCode());
	}	
}