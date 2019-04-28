import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class EndlessRunningGame extends Game{

	 @Override
	    void initialize() {
	        System.out.println("Endless Runner initializing...");

	    }

	    @Override
	    void startPlay() {
	        System.out.println("Endless Runner starting...");
	        playerWantsNewCharacter();

	    }

	    @Override
	    void endPlay() {
	        System.out.println("Endless Runner Ending...");
	    }

	    @Override
	    protected void addNewGameCharacterToTheGame() {
	        System.out.println("Adding new Character to the game");
	    }

	    public boolean playerWantsNewCharacter() {
	        String answer = getUserInput();

	        if (answer.toLowerCase().startsWith("y")) {
	            return true;
	        }else {
	            return false;
	        }
	    }

	    private String getUserInput() {
	        String answer = null;

	        System.out.println("Would you like to add a new character to the game? (y/n)? ");

	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            answer = in.readLine();

	        }catch (IOException ioe) {
	            System.out.println("IO Error");
	        }
	        if (answer == null) {
	            return "no";
	        }

	        return answer;
	    }



	
	// Add more methods...

}
