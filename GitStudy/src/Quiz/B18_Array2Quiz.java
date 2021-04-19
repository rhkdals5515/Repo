package Quiz;

import java.util.Arrays;

public class B18_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1, 1},
		};
		
		// 1. numArr의 모든 값을 0 ~ 100사이의 랜덤 정수로 바꿔보세요
			for (int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = (int)(Math.random() * 101);
					System.out.print(" "+numArr[i][j]);}
				System.out.println();
			}
					
		// 2. numArr의 총합과 평균을 구해서 출력해보세요
			int sum1 = 0;
			int sum2 = 0;
			double avg = 0;
			for (int i = 0; i < numArr.length; ++ i) {
				for (int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = (int)(Math.random() * 101);
					sum1 += numArr[i][j];							
				}					
				sum2 += numArr[i].length;
				avg = sum1 / (double) sum2;
			}
			System.out.printf("numArr의 총합: %d, numArr의 평균 : %.2f\n", sum1, avg);
			// 3. numArr의 각 행의 합을 모두 구해서 출력해보세요
			int[] rowSum = new int[numArr.length];
			for (int i = 0; i < numArr.length; ++i) {
				for (int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = (int)(Math.random() * 101);					
					rowSum[i] += numArr[i][j];					
				}
				System.out.printf(i+1+"행의 총합: %d\n",rowSum[i]);
			}
			
			// Arrays.toString(): 배열 편하게 출력하기
			System.out.println("행의 합: "+ Arrays.toString(rowSum));
			
			// 4. numArr의 각 열의 합을 모두 구해서 출력해보세요
			
			//제일 긴 배열 찾기
			int longest = 0;
			for (int i =0; i < numArr.length; ++i) {
				longest = Math.max(longest, numArr[i].length);
			}
			
			
			// ※ row : 행, column : 열			
			int[] colSum = new int[longest];
			
			for (int i = 0; i < rowSum.length; ++i) {			
				for (int j = 0; j < numArr[i].length; ++j) {
					colSum[j] += numArr[i][j];
				}
			}	
					
				
				System.out.println("열의 총합: "+ Arrays.toString(colSum));
			}
			
	}

