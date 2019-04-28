
public abstract class Game {

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	
	// Template method 
	public final void play() {
		loadAssest();
		initialize();
		startPlay();
		if (addNewGameCharacter()) {
			addNewGameCharacterToTheGame(); 
		}
		endPlay();
	}

	// Hooled on Template Method
	protected abstract void addNewGameCharacterToTheGame();
	
	void loadAssest() {
		System.out.println("Loading Game Assest!");
	}
	
	boolean addNewGameCharacter() {
		return true;
	}
}
