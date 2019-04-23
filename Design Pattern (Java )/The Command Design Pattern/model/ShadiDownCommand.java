package model;

import interfaces.Command;

public class ShadiDownCommand implements Command{

	private ShadiCharacterReceiver shadiCharacterReceiver;
	
	
	
	public ShadiDownCommand(ShadiCharacterReceiver shadiCharacterReceiver) {
		super();
		this.shadiCharacterReceiver = shadiCharacterReceiver;
	}
	
	@Override
	public void execute() {
		shadiCharacterReceiver.moveDown();
		
	}

}
