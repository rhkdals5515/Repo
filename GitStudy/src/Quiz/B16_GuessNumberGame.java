package Quiz;

import java.util.Scanner;

public class B16_GuessNumberGame {
	
	/*
	 	������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
	 	
	 	1. �÷��̾�� 8���� �õ��� �� �� �ִ�
	 	2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
	 	    
	 	    ���ڿ� ��ġ�� �� ������� - Strike
	 	    ���ڸ� ������� - Ball
	 	ex) ������ 3456�϶�
	 		>> 5634   : 4 Ball
	 		>> 3789   : 1 Strike
	 		>> 3654   : 1 Strike 3 Ball
	 	�� ���߰� ���� �� ������ ������� �˷��ֱ� 
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
				System.out.println("���ڸ� �Է��ϼ��� >> ");
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
						System.out.println("���ӿ� �й��߽��ϴ�.");
				}
			}
		}

	
	}	
	

