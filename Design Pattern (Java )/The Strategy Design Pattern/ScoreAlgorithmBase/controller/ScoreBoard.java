package controller;

public class ScoreBoard {
	public ScoreAlgorithmBase algorithmBase;
	
	public void showScore(int taps, int multiplier) {
		System.out.println(algorithmBase.calculateScore(taps, multiplier));
	}

}
