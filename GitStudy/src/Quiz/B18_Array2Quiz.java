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
		
		// 1. numArr�� ��� ���� 0 ~ 100������ ���� ������ �ٲ㺸����
			for (int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = (int)(Math.random() * 101);
					System.out.print(" "+numArr[i][j]);}
				System.out.println();
			}
					
		// 2. numArr�� ���հ� ����� ���ؼ� ����غ�����
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
			System.out.printf("numArr�� ����: %d, numArr�� ��� : %.2f\n", sum1, avg);
			// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
			int[] rowSum = new int[numArr.length];
			for (int i = 0; i < numArr.length; ++i) {
				for (int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = (int)(Math.random() * 101);					
					rowSum[i] += numArr[i][j];					
				}
				System.out.printf(i+1+"���� ����: %d\n",rowSum[i]);
			}
			
			// Arrays.toString(): �迭 ���ϰ� ����ϱ�
			System.out.println("���� ��: "+ Arrays.toString(rowSum));
			
			// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
			
			//���� �� �迭 ã��
			int longest = 0;
			for (int i =0; i < numArr.length; ++i) {
				longest = Math.max(longest, numArr[i].length);
			}
			
			
			// �� row : ��, column : ��			
			int[] colSum = new int[longest];
			
			for (int i = 0; i < rowSum.length; ++i) {			
				for (int j = 0; j < numArr[i].length; ++j) {
					colSum[j] += numArr[i][j];
				}
			}	
					
				
				System.out.println("���� ����: "+ Arrays.toString(colSum));
			}
			
	}

