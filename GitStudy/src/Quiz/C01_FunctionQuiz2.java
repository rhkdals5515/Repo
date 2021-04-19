package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	1. �ִ밪�� �Ű������� ���� ������
	 	   0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range �Լ��� �������� 
	 	    
	 	    ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	2. �ּҰ��� �ִ밪�� �Ű������ ������,
	 	      �� ���̿� �����ϴ� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 	
	 		ex: range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 	
	 	
	 	3. �ּҰ��� �ִ밪�� �������� �Ű������� ������
	             �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	       range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 		
	 		ex: range(50, 56, 5)�� ��� -> [50, 56]
	 			range(50, 56, 5)�� ��� -> [50]
	 */
	
	/*
	1. �ִ밪�� �Ű������� ���� ������
	   0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	   range �Լ��� �������� 
		
	   ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	*/
	public static int[] max_Range(int num) {
		int[] result = new int[num];
		for (int i = 0; i < num; ++i) {
			result[i] = i;
		}
		return result;
	}	
	/*
	 	2. �ּҰ��� �ִ밪�� �Ű������ ������,
	 	      �� ���̿� �����ϴ� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 	
	 		ex: range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 */
	// �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �Լ����� ����� �� �ִ�
	// (�Լ��� �����ε�, function overloading)
	public static int[] range2(int num1,int num2) {
		if (num1 >= num2) {
			return null;
		}
		int[] range2 = new int[num2 - num1];
		for (int i = num1; i < num2; ++i) {
			range2[i-num1] = i;
		}
		return range2;
	}
	/*
	 	3. �ּҰ��� �ִ밪�� �������� �Ű������� ������
	             �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	       range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 		
	 		ex: range(50, 56, 5)�� ��� -> [50, 55]
	 			range(50, 56, 5)�� ��� -> [50]
	 */
		public static int[] range(int start, int end, int inc) {
			int len = (int)Math.ceil((end - start) / (double)inc);
			
			int[] bound = new int[len];
			
			for (int i = 0, num = start; i < bound.length; ++i) {
				bound[i] = start;
				start += inc;
			}
		return bound;
		}
	
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(10,15,2)));
	}
}
