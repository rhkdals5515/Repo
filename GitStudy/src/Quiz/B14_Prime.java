package Quiz;

import java.util.Scanner;

public class B14_Prime {
	
	/*
	 	사용자로부터 숫자를 입력받으면
	 	1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	 	※ 소수: 1과 자기 자신으로만 나누어 떨어지는 수
	 	ex: 7, 11, 13, 17 ...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 >> ");
		num = sc.nextInt();
		for (int i = 1; i <= num; ++i) {
			for(int j = 1; j <= num; ++j) {
				if(i % j == 0) {
					
				}
			}
		}
	}
}
