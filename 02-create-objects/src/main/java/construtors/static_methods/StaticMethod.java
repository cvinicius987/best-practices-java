package construtors.static_methods;

public class StaticMethod {

	public static void main(String[] args) {

		//Utilizando a chamada pelos metodos de fabricação estaticos
		//com eles a chamada é mais declarativa e fácil de compreender
		//Sendo uteis em metodos com poucos parametros
		var product  = Product.newEletronic("TV 29", 1000.00, "TV 29 polegadas LED");
		var product2 = Product.newBook("Effective Java", 50.00, "Livro sobre programação Java");
		
		System.out.println(product);
		System.out.println(product2);
	}
}