package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {
	
	/*
	 	사용자로부터 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어 보세요.
	 	(잘못된 값이 입력되어도 강제종료 되지 않고, 올바른 값이 입력되면 출력 후 프로그램 종료)
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		
		while(true) {						
			try {	
				System.out.print("숫자를 입력해주세요 >> ");
				num = sc.nextInt();
				System.out.println("입력한 숫자: "+num);
				break;
			}catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
				String stuck = sc.nextLine();										
				System.out.println("걸려있던 걸 뺌: "+ stuck);
			}			
		}
		System.out.println("프로그램이 종료되었습니다");
	}

	public static int input(String message) {
		
		int num;
		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			}catch (InputMismatchException e) {
				sc.nextLine();
			}		
		}	
		//sc.close(); // 더 이상 쓰지 않을 스캐너를 삭제 (System.in은 close를 하지 않는 것이 좋음
		
		return sc.nextInt();
	}
}
