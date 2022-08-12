package atv;

public class Ram {
	private String model;
	private int size;
	private String ramType;
	private int frequency;
	public Ram(String model, int size, String ramType, int frequency) {
		super();
		this.model = model;
		this.size = size;
		this.ramType = ramType;
		this.frequency = frequency;
	}
	public int getSize() {
		return size;
	}
}
