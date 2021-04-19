package Quiz;

import java.util.Scanner;

public class B16_GuessNumberGame {
	
	/*
	 	게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
	 	
	 	1. 플레이어는 8번의 시도를 할 수 있다
	 	2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
	 	    
	 	    숫자와 위치가 다 맞을경우 - Strike
	 	    숫자만 맞을경우 - Ball
	 	ex) 정답이 3456일때
	 		>> 5634   : 4 Ball
	 		>> 3789   : 1 Strike
	 		>> 3654   : 1 Strike 3 Ball
	 	※ 맞추고 나면 몇 번만에 맞췄는지 알려주기 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("##Game Start##");
		while (true) {
			int player = 0;
			int com = 0;
			int size = 0;
			int Strike_cnt = 0;
			int Ball_cnt = 0;
				
			com = (int)(Math.random() * 9000 + 1000);										
			while (size++ < 8) {	
				System.out.println("숫자를 입력하세요 >> ");
				player = sc.nextInt();
					if (com / 1000 == player / 1000) {
						Strike_cnt++;
					}else {
						Ball_cnt++;
					}if ((com / 100) % 10 == (player / 100) % 10) {
						Strike_cnt++;
					}else {
						Ball_cnt++;
					}if ((com / 10) % 100 == (player / 10) % 100) {
						Strike_cnt++;
					}else {
						Ball_cnt++;
					}if (com % 1000 == player % 1000) {
						Strike_cnt++;
					}else {
						Ball_cnt++;
					}
					
					System.out.printf("%dStrike %dBall\n",Strike_cnt,Ball_cnt);
					break;
					}
					if (size > 8) {
						System.out.println("게임에 패배했습니다.");
				}
			}
		}

	
	}	
	

