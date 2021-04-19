package Quiz;

import java.util.Scanner;

public class B08_MonthToSeason {
	
	/*
	 	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case문을 이용)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("달을 입력해 주세요 >> ");
		month = sc.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("계절은 봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("계절은 여름 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("계절은 가을 입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("계절은 겨울 입니다.");
			break;
		default:
			System.out.println("달을 잘못 입력하셨습니다.");
			break;
		}
	}
}
