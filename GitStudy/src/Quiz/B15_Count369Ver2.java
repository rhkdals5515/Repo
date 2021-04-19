package Quiz;

import java.util.Scanner;

public class B15_Count369Ver2 {
	
	// 2. 정수로 풀기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 >> ");
		int input = sc.nextInt();
		int clap = 0;
		for (int i = 1; i <= input; ++i) {
			int testValue = i;		
			int digit = 1;
			
			int n = 1;
			
			System.out.print(i+ ": ");
			
			while ((n *= 10) < testValue) {
				//System.out.println(n + " < " + testValue);
				digit++;
			}
			//System.out.println("count: " + digit);
			
			for (int j = digit; j > 0; --j) {
				
				int value = testValue % (int)Math.pow(10, j) / (int)Math.pow(10, j -1);
				
				if (value == 3 || value == 6 || value == 9) {
					clap++;
					System.out.print("짝");
				}
				//testValue %= (int)Math.pow(10, j-1);
			}
			System.out.println();
		}
	
		

	}
}
