package Quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	/*
	 	점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요
	 90점 이상 : A등급
	 80점 이상 : B등급
	 70점 이상 : C등급
	 60점 이상 : D등급
	 그 외 : : F 등급
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade = 'F';
		System.out.print("점수를 입력하세요 >> ");	
		score = sc.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("점수를 잘못 입력하셨습니다. 다시 입력하세요");
		}else if(score >= 90) {
			System.out.println("당신은 A등급 입니다.");
		}else if(score >= 80) {
			System.out.println("당신은 B등급 입니다.");
		}else if(score >= 70) {
			System.out.println("당신은 C등급 입니다.");
		}else if(score >= 60) {
			System.out.println("당신은 D등급 입니다.");
		}else {
			System.out.println("당신은 F등급 입니다.");
		}
	}
}
