package model;

import interfaces.Command;

public class MarioRightCommand implements Command{

	private MarioCharacterReceiver marioCharacterReceiver;
	
	
	
	public MarioRightCommand(MarioCharacterReceiver marioCharacterReceiver) {
		super();
		this.marioCharacterReceiver = marioCharacterReceiver;
	}



	@Override
	public void execute() {
		marioCharacterReceiver.moveRight();
		
	}

}
