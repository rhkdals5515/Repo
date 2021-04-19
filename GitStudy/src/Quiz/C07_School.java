package Quiz;

import java.util.Scanner;

import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

public class C07_School {
	
	int sno;
	/*
	 	1. 각 반의 정원은 30명이다.
	 	
	 	2-1. 프로그래밍 반 학생은 각자의 국어, 영어, 수학, 프래그래밍 언어 점수가 있다
	 	
	 	2-2. 내트워크 반 학생은 각자의 국어, 영어, 리눅스, CCNA 점수가 있다
	 	
	 	2-3. 머신러닝 반 학생은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	 	
	 	3. 모든 학생의 점수를 랜덤으로 생성한다
	 		학번은 랜덤으로 생성되지만 중복은 없어야한다. (또는 중복없이 랜덤)
	 		
	 	4. 성적표 메서드를 통해 각 학생의 [이름/총점/평균점수]를 볼 수 있다
	 */
	public C07_School() {
		sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine_learning = new Student[30];
	
		for (int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].PrintGradeCard();		
		}			
		for (int i = 0; i < network.length; ++i) {
			network[i] = new NetworkStudent(sno++);
			network[i].PrintGradeCard();
		}

	
	}
	
	
	public static void main(String[] args) {
	
		new C07_School();
		
			
	}
}
























/*
class School{
	String name;
	int sum;
	double avg;
	
	public School(){
		
	}
	public School(String name, int sum, double avg) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;		
	}
	void grade() {
		System.out.printf("이름: %s, 성적 총점: %d, 성적 평균: %.2f",name, sum, avg);
	}
}

class student {
	int[] student = new int[30];
} 
*/
