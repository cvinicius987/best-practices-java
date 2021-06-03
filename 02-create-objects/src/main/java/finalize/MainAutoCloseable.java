package finalize;

public class MainAutoCloseable {

	public static void main(String[] args) 
	throws Exception {
		
		//O Autocloseble deve ser o principal meio de fechar recurso dos objetos.
		try(Exemplo exemplo = new Exemplo()){
			
			System.out.println(" Chamando o MainFinalize");
		}
	}
}