package atv;

public class Processor {
	private String model;
	private int frequency;
	private int cores;
	private int threads;
	
	
	
	public Processor(String model, int frequency, int cores, int threads) {
		super();
		this.model = model;
		this.frequency = frequency;
		this.cores = cores;
		this.threads = threads;
	}



	public String getModel() {
		return model;
	}
}
