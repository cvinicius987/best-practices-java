package create_objects.try_resources_finally;

public class MainFinally {

	public static void main(String[] args) 
	throws Exception {
		
		/*
		 * Logica implemnetada utilizando try-finally
		 * deixa o codigo mais verboso
		 */
		var readFile = new ReadFile();
		
		try{
			readFile.read();
			
			var database = new Database();
			
			try {
				database.insert();
				
			}finally {
				database.close();
			}
			
		}finally {
			readFile.close();
		}
	}
}