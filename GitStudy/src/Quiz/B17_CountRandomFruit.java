package Quiz;

public class B17_CountRandomFruit {
	
	/*
	 	1. ����ڷ���� �迭�� ũ�⸦ �Է¹޴´�.
	 	
	 	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
	 		(�������� �����ϴ� ����:
	 		 apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���
	 */
	public static void main(String[] args) {
		
		String[] Fruit = new String[] {"apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		int[] cnt = new int[Fruit.length];
				
			for (int i = 0; i < Fruit.length; ++i) {
			String ran = Fruit[(int)(Math.random() * Fruit.length)];
			}			
			
	}	
}

