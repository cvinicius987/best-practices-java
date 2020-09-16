package create_objects.finalize;

public class MainFinalize {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Não é possivel garntir que o metodo finalize será chamada
		//isso é variante e pode mudar de acordo com a implementação de JVM
		new Exemplo();
		
		System.out.println(" Chamando o MainFinalize");
	}
}