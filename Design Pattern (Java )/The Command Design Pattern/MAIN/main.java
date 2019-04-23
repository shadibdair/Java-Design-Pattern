package MAIN;

import model.GameBoy;
import model.MarioCharacterReceiver;
import model.MarioDownCommand;
import model.MarioLeftCommand;
import model.MarioRightCommand;
import model.MarioUpCommand;
import model.ShadiCharacterReceiver;
import model.ShadiDownCommand;
import model.ShadiUpCommand;

public class main {

	public static void main(String[] args) {
		
		// Create Our Receivers
		MarioCharacterReceiver mario = new MarioCharacterReceiver();
		mario.setName("Mario");	
		ShadiCharacterReceiver shadi = new ShadiCharacterReceiver();
		shadi.setName("Shadi");
		
		
		// Create Commands
		MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
		MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
		MarioRightCommand marioRightCommand = new MarioRightCommand(mario);
		MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
		ShadiUpCommand shadiUpCommand = new ShadiUpCommand(shadi);
		ShadiDownCommand shadiDownCommand = new ShadiDownCommand(shadi);
		
		
		// Invoker
		GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand,marioRightCommand,marioLeftCommand);
		gameBoy.arrowDown(); // Mario moving Down!
		gameBoy.arrowRight(); // Mario moving Left!
		gameBoy.arrowUp(); // Mario jumping Up!
		GameBoy gameBoy2 = new GameBoy(shadiUpCommand, shadiDownCommand, shadiDownCommand, shadiDownCommand);
		gameBoy2.arrowDown(); // Shadi moving Down!
		gameBoy2.arrowUp(); // Shadi jumping Up!
		

		
		
		

	}

}
