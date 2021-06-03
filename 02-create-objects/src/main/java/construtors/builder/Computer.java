package construtors.builder;

public final class Computer {
	
	private String motherBoard;
	private String processorName;
	private double processorClock;
	private int ram;
	private int hardDiskSize;
	private CaseColor caseColor;
	
	Computer(String motherBoard, String processorName, double processorClock, int ram, int hardDiskSize, CaseColor caseColor) {
		super();
		this.motherBoard    = motherBoard;
		this.processorName  = processorName;
		this.processorClock = processorClock;
		this.ram = ram;
		this.hardDiskSize = hardDiskSize;
		this.caseColor = caseColor;
	}
	
	public static ComputerBuilder makeComputer() {
		return new ObjComputerBuilder();
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public String getProcessorName() {
		return processorName;
	}

	public double getProcessorClock() {
		return processorClock;
	}

	public int getRam() {
		return ram;
	}

	public int getHardDiskSize() {
		return hardDiskSize;
	}
	
	public CaseColor getCaseColor() {
		return caseColor;
	}

	@Override
	public String toString() {
		return "ComputerPC [motherBoard=" + motherBoard + ", processorName=" + processorName + ", processorClock="
				+ processorClock + ", ram=" + ram + ", hardDiskSize=" + hardDiskSize + ", caseColor="+caseColor+"]";
	}
}