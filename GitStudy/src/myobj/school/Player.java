package myobj.school;

import java.util.Random;

public abstract class Player {
	
	final static String[] player = {"1p","2p","3p","4p","5p"};	
	
	Random ran;
	int hole;
	int knife;
	public Player() {		
		hole = (int)(Math.random() * 25);
				
	}
	public abstract void Lose();
	
	String getRandomName() {
		return player[ran.nextInt() * 6];
	}		
}
