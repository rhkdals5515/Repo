package Quiz;

import java.util.Scanner;

public class B16_GuessNumberGame3 {
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
		final boolean DEBUGMODE = true;
		
		StringBuilder answer_biler = new StringBuilder();
		Scanner input_Scanner = new Scanner(System.in);
	
			for (int i = 0; i < 4; ++i) {
				answer_biler.append((int)(Math.random() * 10));
			}
			String answer = answer_biler.toString();
			
			if (DEBUGMODE) {
				System.out.printf("�̹� ������: %s\n",answer);
			}
		int strike = 0;
		int ball = 0;
		int count = 0;
		
		String input = null;
		
		while (strike != 4 || count != 8) {
			strike = 0;
			ball = 0;
			
			while (true) {
				System.out.printf("�õ� >> %d\n",1+count);
				input = input_Scanner.nextLine();
				
				boolean valid = true;
			
				if (input.length() != 4) {
					valid = false;
				}
	
			}
		}
	}
}
