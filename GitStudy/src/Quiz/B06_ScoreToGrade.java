package Quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	/*
	 	������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����
	 90�� �̻� : A���
	 80�� �̻� : B���
	 70�� �̻� : C���
	 60�� �̻� : D���
	 �� �� : : F ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade = 'F';
		System.out.print("������ �Է��ϼ��� >> ");	
		score = sc.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
		}else if(score >= 90) {
			System.out.println("����� A��� �Դϴ�.");
		}else if(score >= 80) {
			System.out.println("����� B��� �Դϴ�.");
		}else if(score >= 70) {
			System.out.println("����� C��� �Դϴ�.");
		}else if(score >= 60) {
			System.out.println("����� D��� �Դϴ�.");
		}else {
			System.out.println("����� F��� �Դϴ�.");
		}
	}
}
