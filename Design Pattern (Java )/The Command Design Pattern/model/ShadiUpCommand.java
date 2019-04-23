package model;

import interfaces.Command;

public class ShadiUpCommand implements Command{

	private ShadiCharacterReceiver shadiCharacterReceiver;
	
	
	
	public ShadiUpCommand(ShadiCharacterReceiver shadiCharacterReceiver) {
		super();
		this.shadiCharacterReceiver = shadiCharacterReceiver;
	}

	
	@Override
	public void execute() {
		shadiCharacterReceiver.moveUp();
		
	}
	

}
