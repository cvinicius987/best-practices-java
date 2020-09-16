package create_objects.constructors.builder;

import create_objects.constructors.builder.MotherBoard.Builder;
import create_objects.constructors.builder.MotherBoard.HardDisk;
import create_objects.constructors.builder.MotherBoard.Memory;
import create_objects.constructors.builder.MotherBoard.Processor;

public final class ComputerBuilder implements MotherBoard, Processor, Memory, HardDisk, Builder {

	private String motherBoardName;
	private String processorName;
	private Double processorClock;
	private int ram;
	private int hardDiskSize;
	
	private ComputerBuilder() {}
	
	public static MotherBoard newComputer() {
		return new ComputerBuilder();
	}
	
	@Override
	public Processor motherBoard(String name) {
		this.motherBoardName = name;
		
		return this;
	}
	
	@Override
	public Memory processor(String name, Double clock) {
		this.processorName = name;
		this.processorClock = clock;
		
		return this;
	}
	
	@Override
	public HardDisk memory(int ram) {
		this.ram = ram;
		return this;
	}
	
	@Override
	public Builder hardDisk(int size) {
		this.hardDiskSize = size;
		return this;
	}
	
	@Override
	public Computer builder() {
		return new Computer(motherBoardName, processorName, processorClock, ram, hardDiskSize);
	}
}