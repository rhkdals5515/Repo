package Quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D05_Poker {
	
	/*
	 	# 포커를 구현해보세요
	 	// outer class에는 protected와 private을 사용할 수 없다
	 	// inner class에는 모든 제어자를 사용할 수 있다
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		HashSet<Integer> answer = new HashSet<>();
		
		answer.add(3);
		answer.add(5);
		answer.add(7);
		
		System.out.println("numbers가 answer를 전부 포함하고 있는가? "  
				+ numbers.containsAll(answer));
	}
}

