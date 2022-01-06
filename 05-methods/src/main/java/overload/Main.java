package overload;

import java.util.List;

public class Main {

	public static void show(Animal animal) {
		System.out.println(animal.name());
	}
	
	public static void main(String[] args) {
		var list = List.of(new Animal(), new Snake(), new Bear());
		
		for(Animal animal : list) {
			System.out.println(animal.name());
		}
	}
}