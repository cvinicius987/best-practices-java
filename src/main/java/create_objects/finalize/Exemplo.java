package create_objects.finalize;

public class Exemplo implements AutoCloseable{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Chamando Finalize.............");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Chamando por AutoClosable.............");	
	}
}