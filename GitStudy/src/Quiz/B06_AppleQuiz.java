package Quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
	/*
	 	사과를 10개씩 담을 수 있는 바구니가 있다.
	 	
	 	사용자가 구매하고 싶은 사과의 개수를 입력하면
	 	사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple;
		System.out.print("사과의 개수를 입력해주세요 >> ");
		apple = sc.nextInt();
		if (apple < 0) {
			System.out.println("잘못 입력하셨습니다 다시 입력하세요");
		}else if(apple % 10 == 0) {
			System.out.printf("사과의 바구니의 개수 : %d개", (apple / 10));
		}else{
			System.out.printf("사과의 바구니의 개수 : %d개", (apple / 10)+1);
		}
	}
}
