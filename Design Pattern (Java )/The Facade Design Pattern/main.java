package MAIN;

public class main {

	public static void main(String[] args) {
		CPU cpu= new CPU();
		Memory memory = new Memory();
		HardDrive hardDrive = new HardDrive();
		
		
		ComputerFacade computerFacade  = new ComputerFacade(cpu, memory, hardDrive);
		computerFacade.start();	

	}

}


/*
the OUTPUT:


Computer freezing...
Added item to memory132
jumping to...123
Computer executing commands...

*/