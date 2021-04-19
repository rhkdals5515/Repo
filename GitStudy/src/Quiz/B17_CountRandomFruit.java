package Quiz;

public class B17_CountRandomFruit {
	
	/*
	 	1. 사용자루부터 배열의 크기를 입력받는다.
	 	
	 	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
	 		(랜덤으로 등장하는 과일:
	 		 apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다
	 */
	public static void main(String[] args) {
		
		String[] Fruit = new String[] {"apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		int[] cnt = new int[Fruit.length];
				
			for (int i = 0; i < Fruit.length; ++i) {
			String ran = Fruit[(int)(Math.random() * Fruit.length)];
			}			
			
	}	
}

