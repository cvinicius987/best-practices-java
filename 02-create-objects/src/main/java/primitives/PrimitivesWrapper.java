package primitives;

public class PrimitivesWrapper {

	public static void main(String[] args) {
	
		long initial = System.currentTimeMillis();
		
		wrappers();
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - initial) / 1000);
	}
	
	/**
	 * Calculo baseado em tipos primitivos onde não temos o autoboxing
	 */
	public static void primitives() {
		
		long total = 0L;
		
		for (int i = 0; i < Integer.MAX_VALUE; i++)
			total += i;
		
		System.out.println(total);
	}
	
	/**
	 * Calculo baseado em tipos wrappers onde temos o autoboxing, a cada passagem no loop
	 */
	public static void wrappers() {
		
		Long total = 0L;
		
		for (int i = 0; i < Integer.MAX_VALUE; i++)
			total += i;
		
		System.out.println(total);
	}
}