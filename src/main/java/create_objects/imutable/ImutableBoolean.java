package create_objects.imutable;

public class ImutableBoolean {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Recupera o Boolean de TRUE já existente como CONSTANTE, onde é necessario recria-lo
		var strToBool = Boolean.valueOf("true");
		
		//Realiza a criação de um tipo boolean na memoria
		var boolToBool = new Boolean("true");
		
		System.out.println(strToBool);
		System.out.println(boolToBool);
	}
}