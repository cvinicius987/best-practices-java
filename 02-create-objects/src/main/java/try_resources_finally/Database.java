package try_resources_finally;

public class Database implements AutoCloseable{

	public void insert() {
		System.out.println("Inserido o registro");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexão com Banco de Dados");
	}
}