package constructors.static_method;

public class Main {

	public static void main(String[] args) {

		var product  = new Product("TV 29", ProductType.ELETRONIC, 1000.00, "TV 29 polegadas LED");
		var product2 = new Product("Effective Java", ProductType.BOOKS, 50.00, "Livro sobre programação Java");
		
		System.out.println(product);
		System.out.println(product2);
	}
}