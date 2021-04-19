package Quiz;

import java.util.Scanner;

public class B16_31Game2 {
	/*
 	31������ ����� ������
 	
 	 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�. 
 	 	(1, 2, 3 �ۿ� ������ �� ����)
 	 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
 	 3. ������ �������� �����Ѵ�
 	 4. �������� 31�̻��� ���ڸ� ���� �÷��̾ �й��Ѵ�.
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
					System.out.print("���� �� > ");
					user = sc.nextInt();
					if (user > 0 && user <= 3) {
						break;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ� .[1], [2], [3]�߿��� �Է����ּ���");
					}
				}
				num += user;	
				System.out.printf("�ʰ� ������ ����: %d, �����ȼ���: %d\n",user,num);
				turn = com;
			}else if (turn == com) {
				int computer = (int)(Math.random() * 3 + 1);
				num += computer;
				System.out.printf("��ǻ���� �� : %d, �����ȼ���: %d\n",computer,num);
				turn = player;
			}
			if (num >= 31) {
				String winner = turn == player ? "�÷��̾�" : "��ǻ��";
				System.out.printf("<< %s�� �¸� >>",winner);
				break;
			}
		}
		
	}
}
