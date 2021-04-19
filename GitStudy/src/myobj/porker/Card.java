package myobj.porker;

import java.util.ArrayList;

public class Card {
	ArrayList<String> shape = new ArrayList<>();
	ArrayList<Integer> numbers = new ArrayList<>();
	int player;
	int turn;
	public Card() {
		shape.add("diamond");
		shape.add("clover");
		shape.add("heart");
		shape.add("spade");
		
		
	}
}

