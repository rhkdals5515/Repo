package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 최대값을 매개변수로 전달 받으면
	 	   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어보세요 
	 	    
	 	    ex: range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	2. 최소값과 최대값을 매개면수로 받으면,
	 	      그 사이에 존재하는 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
	 	
	 		ex: range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	 	
	 	
	 	3. 최소값과 최대값과 증가값을 매개변수로 받으면
	             최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
	       range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
	 		
	 		ex: range(50, 56, 5)의 결과 -> [50, 56]
	 			range(50, 56, 5)의 결과 -> [50]
	 */
	
	/*
	1. 최대값을 매개변수로 전달 받으면
	   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	   range 함수를 만들어보세요 
		
	   ex: range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	*/
	public static int[] max_Range(int num) {
		int[] result = new int[num];
		for (int i = 0; i < num; ++i) {
			result[i] = i;
		}
		return result;
	}	
	/*
	 	2. 최소값과 최대값을 매개면수로 받으면,
	 	      그 사이에 존재하는 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
	 	
	 		ex: range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	 */
	// 매개변수의 개수 혹은 타입이 다르면 같은 함수명을 사용헐 수 있다
	// (함수의 오버로딩, function overloading)
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
	 	3. 최소값과 최대값과 증가값을 매개변수로 받으면
	             최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
	       range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
	 		
	 		ex: range(50, 56, 5)의 결과 -> [50, 55]
	 			range(50, 56, 5)의 결과 -> [50]
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
