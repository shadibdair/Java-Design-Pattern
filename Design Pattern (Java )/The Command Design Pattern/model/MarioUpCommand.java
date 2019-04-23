package model;

import interfaces.Command;

public class MarioUpCommand implements Command{

	private MarioCharacterReceiver marioCharacterReceiver;
	
	
	
	public MarioUpCommand(MarioCharacterReceiver marioCharacterReceiver) {
		super();
		this.marioCharacterReceiver = marioCharacterReceiver;
	}



	@Override
	public void execute() {
		
		marioCharacterReceiver.moveUp();
		
	}

}
