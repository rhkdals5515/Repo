package study;

public class B17_Array {

	/*
	 	# �迭
	 	
	 	 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
	 	 - ���� �̸����� ������ ������ ������ �� �ε����� Ȱ���� �����Ѵ�
	 	 - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	 	 - �迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�
	 	 - (����: 0, �Ǽ�: 0.0, boolean: false, ������: null)
	 */
	public static void main(String[] args) {
		
		int[] score = new int[100];
		int sum = 0;
		// �迭�� �迭.length�� ���� ���̸� �� �� �ִ�
		for (int index = 0; index < score.length; ++index) {		
			score[index] = ((int)(Math.random() * 101));
			sum += score[index];
		}		
	
		System.out.println("10��° �л��� ����: "+ score[9]);
	
		// ��������1 : score�� ���հ� ���(�Ҽ� ��° �ڸ�)�� ����غ�����
		System.out.printf("����: %d , ���: %.2f", sum, sum / (double)score.length);	
	
		/*
		 	# �迭�� �����ϴ� ���
		 	
		 	 1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		 	 2. Ÿ��[] �迭�̸� = { ��1, ��2, ��3, ...}		 	 
		 	 3. Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ....}
		 */
		char[] grade = new char[50];
		
		int[] age = {10, 15, 20 , 181, 80, 75};
		boolean[] passExam = { true, false, true,true, false};
	
		String[] animals = new String[] {"Lion", "tiger", "penguin", "monkey"};
	
		System.out.println(animals[0]);
		System.out.println(animals[3]);
		
		if (passExam[3]) {
			System.out.println("4��° ����� ������ ����߽��ϴ�.");
		}
		for (int i = 0; i < grade.length; ++i) {
			System.out.println((int)grade[i]);
		}
	
	// # �迭�� ������ �ٸ��� �ʱ�ȭ �ڵ����� �Ǿ��ִ�
		int[] arr = new int[3];
		int a, b, c;
		
		System.out.println("arr[0]: "+arr[0]);
		
		// # String�� char�� �迭�� ��ȯ�� �� �ִ�
		char[] msg1 = new char[] {'h', 'e', 'l','l','0'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
	
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
	
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
	}
}
