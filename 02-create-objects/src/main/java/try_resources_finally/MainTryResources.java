package try_resources_finally;

public class MainTryResources {

	public static void main(String[] args) 
	throws Exception {
		
		//Com try-with-resources temos um codigo muito mais limpo para fechamento de multiplos
		//recursos utilizados no bloco de logica
		try(var database = new Database();
			var file = new ReadFile()) {
			
			file.read();
			database.insert();
		}
	}
}
