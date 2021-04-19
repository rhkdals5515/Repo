package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���¸� ��ȯ�ϴ� �Լ�
	 	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 	    factorial: (n)*(n-1)*(n-2)... 
	 */
	public static void main(String[] args) {
	System.out.println(factorial(10));
	}
	//1.������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean Alpabet(char word) {
		/*
		 boolean result;
		 
		if ((word >= 'A' && word <= 'Z') || (word >= 'a') && (word <= 'z')) {
			result = true;
		}else {
			result = false;
		}
		return result;
		*/
		return (word >= 'A' && word <= 'Z') || (word >= 'a' && word <= 'z');
	}
	//2.������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean Three(int num) {
		/*
		boolean result;
		if (num % 3 == 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
		*/
		return num % 3 == 0;
	}
		
	// 3.���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	public static String Even_hole(int num) {
		/*
		String result = null;
		if (num % 2 == 0) {
			result = "¦���Դϴ�";
		}else {
			result = "Ȧ���Դϴ�.";
		}
		return result;
		*/
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	// 4.���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���¸� ��ȯ�ϴ� �Լ�
	public static int[] findDivide(int num) {
		
		boolean[] divide = new boolean[num];
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		
		for (int i = 0; i < divide.length; ++i) {
			if (divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}

	// 5.������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean prime_Number(int num) {
		boolean result = true;
		
		double sqrt = Math.sqrt(num);
		
		for (int i = 2; i < num; ++i) {			
			if (num % i == 0) {
				result = false;		
			}		
			break;
		}		
			return result;
	}
		
	// 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//    factorial: (n)*(n-1)*(n-2)... 	
	
	public static int factorial(int num) {
			if (num == 2) {
				return 2;
			}
		
			return num * factorial(num - 1);
		}
		/*
		int result = 1;
		for (int i = num; i > 0; --i) {
			result *= i;
		}
		return result;
		*/
}
		

			
		

