package create_objects.constructors.builder;

public final class Computer {
	
	private String motherBoard;
	private String processorName;
	private Double processorClock;
	private int ram;
	private int hardDiskSize;
	
	public Computer(String motherBoard, String processorName, Double processorClock, int ram, int hardDiskSize) {
		super();
		this.motherBoard = motherBoard;
		this.processorName = processorName;
		this.processorClock = processorClock;
		this.ram = ram;
		this.hardDiskSize = hardDiskSize;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public String getProcessorName() {
		return processorName;
	}

	public Double getProcessorClock() {
		return processorClock;
	}

	public int getRam() {
		return ram;
	}

	public int getHardDiskSize() {
		return hardDiskSize;
	}

	@Override
	public String toString() {
		return "ComputerPC [motherBoard=" + motherBoard + ", processorName=" + processorName + ", processorClock="
				+ processorClock + ", ram=" + ram + ", hardDiskSize=" + hardDiskSize + "]";
	}
}