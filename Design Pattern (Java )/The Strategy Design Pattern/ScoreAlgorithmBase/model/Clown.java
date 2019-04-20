package model;

import controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return (taps *  multiplier)-10;	}

}
