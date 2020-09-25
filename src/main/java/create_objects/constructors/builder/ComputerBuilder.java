package create_objects.constructors.builder;

public interface ComputerBuilder{
	
	Processor motherBoard(String name);
	
	public interface Processor{
		
		Memory processor(String name, double clock);
	}
	
	public interface Memory{
		HardDisk memory(int ram);
	}
	
	public interface HardDisk{
		
		Case hardDisk(int size);	
	}
	
	public interface Case extends Builder{
		
		Builder caseWithBlackColor();
		
		Builder caseWithWhiteColor();
	}
	
	public interface Builder{
		
		Computer build();
	}
}