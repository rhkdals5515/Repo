package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태를 반환하는 함수
	 	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	 6. 숫자를 전달하면 해당 숫자의 팩토리일 결과를 반환하는 함수
	 	    factorial: (n)*(n-1)*(n-2)... 
	 */
	public static void main(String[] args) {
	System.out.println(factorial(10));
	}
	//1.전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
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
	//2.전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
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
		
	// 3.숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String Even_hole(int num) {
		/*
		String result = null;
		if (num % 2 == 0) {
			result = "짝수입니다";
		}else {
			result = "홀수입니다.";
		}
		return result;
		*/
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	// 4.숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태를 반환하는 함수
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

	// 5.전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
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
		
	// 6. 숫자를 전달하면 해당 숫자의 팩토리일 결과를 반환하는 함수
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
		

			
		

