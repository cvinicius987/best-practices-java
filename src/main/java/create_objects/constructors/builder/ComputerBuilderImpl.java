package create_objects.constructors.builder;

import create_objects.constructors.builder.ComputerBuilder.Builder;
import create_objects.constructors.builder.ComputerBuilder.Case;
import create_objects.constructors.builder.ComputerBuilder.HardDisk;
import create_objects.constructors.builder.ComputerBuilder.Memory;
import create_objects.constructors.builder.ComputerBuilder.Processor;

final class ComputerBuilderImpl implements ComputerBuilder, Processor, Memory, HardDisk, Case, Builder {

	private String motherBoardName, processorName;
	private double processorClock;
	private int ram, hardDiskSize;
	private CaseColor caseColor = CaseColor.WHITE;
	
	ComputerBuilderImpl() {}
	
	@Override
	public Processor motherBoard(String name) {
		this.motherBoardName = name;
		
		return this;
	}
	
	@Override
	public Memory processor(String name, double clock) {
		this.processorName  = name;
		this.processorClock = clock;
		
		return this;
	}
	
	@Override
	public HardDisk memory(int ram) {
		this.ram = ram;
		return this;
	}
	
	@Override
	public Case hardDisk(int size) {
		this.hardDiskSize = size;
		return this;
	}
	
	@Override
	public Builder caseWithBlackColor() {
		this.caseColor = CaseColor.BLACK;
		return this;
	}

	@Override
	public Builder caseWithWhiteColor() {
		return this;
	}
	
	@Override
	public Computer build() {
		return new Computer(motherBoardName, processorName, processorClock, ram, hardDiskSize, caseColor);
	}
}