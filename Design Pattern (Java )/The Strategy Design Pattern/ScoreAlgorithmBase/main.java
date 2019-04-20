import controller.ScoreBoard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class main {

	public static void main(String[] args) {
		
		ScoreBoard scoreBoard = new ScoreBoard();
		
		System.out.print("Balloon Tap Score:");
		scoreBoard.algorithmBase = new Balloon();
		scoreBoard.showScore(10, 5);
		
		System.out.print("Clown Tap score:");
		scoreBoard.algorithmBase = new Clown();
		scoreBoard.showScore(10, 5);
		
		System.out.print("SquareBalloon Tap score:");
		scoreBoard.algorithmBase = new SquareBalloon();
		scoreBoard.showScore(10, 5);
		
	}

}

/*
The output :

Balloon Tap Score:30
Clown Tap score:40
SquareBalloon Tap score:90
*/