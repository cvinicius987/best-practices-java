package create_objects.constructors.builder;

public class Main {

	public static void main(String[] args) {
		
		var computer = ComputerBuilder.newComputer()
											.motherBoard("Asus")
											.processor("Intel", 2.4)
											.memory(8)
											.hardDisk(512)
										.builder();
		
		System.out.println(computer);
	}
}
