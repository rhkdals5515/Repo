package Quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
	/*
	 	����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	 	
	 	����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	 	����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple;
		System.out.print("����� ������ �Է����ּ��� >> ");
		apple = sc.nextInt();
		if (apple < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է��ϼ���");
		}else if(apple % 10 == 0) {
			System.out.printf("����� �ٱ����� ���� : %d��", (apple / 10));
		}else{
			System.out.printf("����� �ٱ����� ���� : %d��", (apple / 10)+1);
		}
	}
}
