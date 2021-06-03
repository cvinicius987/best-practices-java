package construtors.builder;

public class Main {

	public static void main(String[] args) {
		
		var computerDefault = Computer.makeComputer()
										.motherBoard("Asus")
										.processor("Intel", 2.4)
										.memory(8)
										.hardDisk(512)
									.build();
		
		var computerCaseBlack = Computer.makeComputer()
											.motherBoard("Asus")
											.processor("Intel", 2.4)
											.memory(8)
											.hardDisk(512)
											.caseWithBlackColor()
										.build();
		
		
		System.out.println(computerDefault);
		System.out.println(computerCaseBlack);
	}
}