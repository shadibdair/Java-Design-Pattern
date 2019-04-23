package model;

import interfaces.Command;

public class MarioDownCommand implements Command{

	private MarioCharacterReceiver marioCharacterReceiver;
	
	
	
	public MarioDownCommand(MarioCharacterReceiver marioCharacterReceiver) {
		super();
		this.marioCharacterReceiver = marioCharacterReceiver;
	}



	@Override
	public void execute() {
		
		marioCharacterReceiver.moveDown();
		
	}
	

}
