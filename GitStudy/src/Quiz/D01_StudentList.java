package Quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� �����˴ϴ�.
	 	
	 	2. ������ ��/ �� / �� �ۿ� �����ϴ�
	 	
	 	3. 30���� ����� ����غ�����
	 	
	 	4. 30���� ���� ������ ���� �л��� �̸��� ������ ����غ�����
	 	
	 	5. �̸��� ������ ���� �����˴ϴ�.
	 	
	 		�л�000000
	 		�л�000001
	 		�л�000002
	 */	
	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<>();
		ArrayList<Integer> kor = new ArrayList<>();
		ArrayList<Integer> eng = new ArrayList<>();
		ArrayList<Integer> math = new ArrayList<>();
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < 30; ++i) {
			student.add(i,"�л�00000"+i);
			kor.add(i, (int)(Math.random() * 101));		
			eng.add(i, (int)(Math.random() * 101));
			math.add(i, (int)(Math.random() * 101));
			System.out.printf("%s�� ���: %.2f\n",student.get(i), (kor.get(i) + eng.get(i) + math.get(i)) / 3.0);
		}
		for (int i = 0; i < 30; ++i) {
			sum.add(i, kor.get(i) + eng.get(i) + math.get(i));
			}
		System.out.println(sum);
	}	
	
}
