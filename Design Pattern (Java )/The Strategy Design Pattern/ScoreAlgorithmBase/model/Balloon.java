package model;

import controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return (taps *  multiplier)-20;
	}
	

}
