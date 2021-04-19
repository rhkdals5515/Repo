package Quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 렌덤으로 설정됩니다.
	 	
	 	2. 과목은 국/ 영 / 수 밖에 없습니다
	 	
	 	3. 30명의 평균을 출력해보세요
	 	
	 	4. 30명중 가장 총점이 높은 학생의 이름과 성적을 출력해보세요
	 	
	 	5. 이름은 다음과 같이 생성됩니다.
	 	
	 		학생000000
	 		학생000001
	 		학생000002
	 */	
	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<>();
		ArrayList<Integer> kor = new ArrayList<>();
		ArrayList<Integer> eng = new ArrayList<>();
		ArrayList<Integer> math = new ArrayList<>();
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < 30; ++i) {
			student.add(i,"학생00000"+i);
			kor.add(i, (int)(Math.random() * 101));		
			eng.add(i, (int)(Math.random() * 101));
			math.add(i, (int)(Math.random() * 101));
			System.out.printf("%s의 평균: %.2f\n",student.get(i), (kor.get(i) + eng.get(i) + math.get(i)) / 3.0);
		}
		for (int i = 0; i < 30; ++i) {
			sum.add(i, kor.get(i) + eng.get(i) + math.get(i));
			}
		System.out.println(sum);
	}	
	
}
