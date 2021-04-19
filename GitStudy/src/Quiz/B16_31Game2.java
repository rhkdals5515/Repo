package Quiz;

import java.util.Scanner;

public class B16_31Game2 {
	/*
 	31게임을 만들어 보세요
 	
 	 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다. 
 	 	(1, 2, 3 밖에 선택할 수 없음)
 	 2. 컴퓨터는 랜텀으로 숫자를 선택한다.
 	 3. 선공은 랜덤으로 결정한다
 	 4. 마지막에 31이상의 숫자를 만든 플레이어가 패배한다.
 */
	public static void main(String[] args) {
		int num = 0;
		int player = 1;
		int com = 0;
		int turn = (int)(Math.random() * 2);
		Scanner sc = new Scanner(System.in);
		System.out.println("## Game Start ##");
		while (num < 31) {	
			if (turn == player) {
				int user = -1;
				while (true) {
					System.out.print("너의 턴 > ");
					user = sc.nextInt();
					if (user > 0 && user <= 3) {
						break;
					}else {
						System.out.println("잘못 입력하셨습니다 .[1], [2], [3]중에서 입력해주세요");
					}
				}
				num += user;	
				System.out.printf("너가 선택한 숫자: %d, 누적된숫자: %d\n",user,num);
				turn = com;
			}else if (turn == com) {
				int computer = (int)(Math.random() * 3 + 1);
				num += computer;
				System.out.printf("컴퓨터의 턴 : %d, 누적된숫자: %d\n",computer,num);
				turn = player;
			}
			if (num >= 31) {
				String winner = turn == player ? "플레이어" : "컴퓨터";
				System.out.printf("<< %s의 승리 >>",winner);
				break;
			}
		}
		
	}
}
