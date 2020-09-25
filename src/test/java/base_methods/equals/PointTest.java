package base_methods.equals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Comparação de Points 
 * 
 * Aqui temos um resultado esperado pois o equals esta 
 * devidamente tratado para comparar dois Points
 */
public class PointTest {
	
	@Test
	public void when_equals_result_false() {
		
		var point1 = new Point(12.9,  13.89);
		var point2 = new Point(12.9,  13.89);
		var point3 = new Point(12.9,  13.89);
		
		assertTrue(point1.equals(point2));
		
		assertTrue(point2.equals(point3));
		
		assertTrue(point3.equals(point1));
	}	
	
	@Test
	public void when_equals_result_true() {
		
		var point1 = new Point(12.6,  13.898);
		var point2 = new Point(12.12,  19.89);
		var point3 = new Point(12.10,  15.89);
		
		assertFalse(point1.equals(null));
		
		assertFalse(point1.equals(point2));
		
		assertFalse(point2.equals(point3));
		
		assertFalse(point3.equals(point1));
	}	
	
	@Test
	public void when_hashcode_result_should_equal() {
		
		var point1 = new Point(12.9,  13.89);
		var point2 = new Point(12.9,  13.89);
		var point3 = new Point(12.9,  13.89);
		
		assertEquals(point1.hashCode(), point2.hashCode());
		
		assertEquals(point2.hashCode(), point3.hashCode());
		
		assertEquals(point3.hashCode(), point1.hashCode());
	}	
	
	@Test
	public void when_hashcode_result_should_not_equal() {
		
		var point1 = new Point(12.6,  13.898);
		var point2 = new Point(12.12,  19.89);
		var point3 = new Point(12.10,  15.89);
		
		assertNotEquals(point1.hashCode(), point2.hashCode());
		
		assertNotEquals(point2.hashCode(), point3.hashCode());
		
		assertNotEquals(point3.hashCode(), point1.hashCode());
	}	
}