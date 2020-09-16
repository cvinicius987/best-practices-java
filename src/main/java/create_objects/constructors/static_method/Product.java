package create_objects.constructors.static_method;

public class Product {

	private String name;
	
	private ProductType type;
	
	private Double price;
	
	private String description;

	private Product(String name, ProductType type, Double price, String description) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.description = description;
	}
	
	public static Product newEletronic(String name, Double price, String description) {
		
		return new Product(name, ProductType.ELETRONIC, price, description);
	}
	
	public static Product newBook(String name, Double price, String description) {
		
		return new Product(name, ProductType.BOOKS, price, description);
	}

	public String getName() {
		return name;
	}

	public ProductType getType() {
		return type;
	}

	public Double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", price=" + price + ", description=" + description + "]";
	}
}