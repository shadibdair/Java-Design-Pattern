package model;

import interfaces.Command;

public class MarioLeftCommand implements Command{

	private MarioCharacterReceiver marioCharacterReceiver;
	
	
	
	public MarioLeftCommand(MarioCharacterReceiver marioCharacterReceiver) {
		super();
		this.marioCharacterReceiver = marioCharacterReceiver;
	}



	@Override
	public void execute() {
		marioCharacterReceiver.moveLeft();
		
	}

}
