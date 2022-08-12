package atv;

public class Computer {
	private String model;
	private MotherBoard cMotherBoard;
	private Processor cProcessor;
	private Ram cRam;
	private Hd cHd;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public MotherBoard getcMotherBoard() {
		return cMotherBoard;
	}
	public void setcMotherBoard(String model, String chipset, String rammemory) {
		this.cMotherBoard = new MotherBoard(model, chipset, rammemory);
	}
	public Processor getcProcessor() {
		return cProcessor;
	}
	public void setcProcessor(String model, int frequency, int cores, int threads) {
		this.cProcessor = new Processor(model, frequency, cores, threads);
	}
	public Ram getcRam() {
		return cRam;
	}
	public void setcRam(String model, int size, String ramType, int frequency) {
		this.cRam = new Ram(model, size, ramType, frequency);
	}
	public Hd getcHd() {
		return cHd;
	}
	public void setcHd(String model, int size, String hdType) {
		this.cHd = new Hd(model, size, hdType);
	}
	@Override
	public String toString() {
		return "Computer [model=" + model + ", cMotherBoard=" + cMotherBoard + ", cProcessor=" + cProcessor + ", cRam="
				+ cRam + ", cHd=" + cHd + "]";
	}
	
	
	
}
