package Quiz;

import java.util.Scanner;

import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

public class C07_School {
	
	int sno;
	/*
	 	1. �� ���� ������ 30���̴�.
	 	
	 	2-1. ���α׷��� �� �л��� ������ ����, ����, ����, �����׷��� ��� ������ �ִ�
	 	
	 	2-2. ��Ʈ��ũ �� �л��� ������ ����, ����, ������, CCNA ������ �ִ�
	 	
	 	2-3. �ӽŷ��� �� �л��� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	 	
	 	3. ��� �л��� ������ �������� �����Ѵ�
	 		�й��� �������� ���������� �ߺ��� ������Ѵ�. (�Ǵ� �ߺ����� ����)
	 		
	 	4. ����ǥ �޼��带 ���� �� �л��� [�̸�/����/�������]�� �� �� �ִ�
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
		System.out.printf("�̸�: %s, ���� ����: %d, ���� ���: %.2f",name, sum, avg);
	}
}

class student {
	int[] student = new int[30];
} 
*/
