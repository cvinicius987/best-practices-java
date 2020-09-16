package create_objects.constructors.builder;

public interface MotherBoard{
	
	Processor motherBoard(String name);
	
	public interface Processor{
		
		Memory processor(String name, Double clock);
	}
	
	public interface Memory{
		HardDisk memory(int ram);
	}
	
	public interface HardDisk{
		
		Builder hardDisk(int size);	
	}
	
	public interface Builder{
		
		public Computer builder();
	}
}