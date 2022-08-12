package atv;

public class MotherBoard {
	private String model;
	private String chipSet;
	private String ramMemory;
	public MotherBoard(String model2, String chipset2, String rammemory2) {
		// TODO Auto-generated constructor stub
		super();
		this.model = model2;
		this.chipSet = chipset2;
		this.ramMemory = rammemory2;
	}
	public String getModel() {
		return model;
	}
}
