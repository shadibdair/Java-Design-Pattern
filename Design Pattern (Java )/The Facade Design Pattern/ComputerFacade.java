package MAIN;

public class ComputerFacade {
	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	
	
	public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
		this.processor = processor;
		this.ram = ram;
		this.hd = hd;
	}
	
	public void start() {
		processor.freeze();
		ram.load(132, hd.read(3412, 88));
		processor.jump(123);
		processor.excute();
		
	}
}
