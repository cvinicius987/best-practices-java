package create_objects.try_resources_finally;

public class ReadFile implements AutoCloseable{

	public void read() {
		System.out.println("Conteudo do arquivo");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechando leitura do arquivo.");
	}
}