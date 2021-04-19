package myobj.school;

public class Machine_Learning extends Student {
	
	//머신러닝 반 학생은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	
	static String[] subject_name = {"국어", "영어", "수학", "통계학", "프로그래밍 언어"};
	
	int math;
	int statis;
	int program;
	
	public Machine_Learning(int sno) {
		super(sno);
		math = getRandomScore();
		statis = getRandomScore();
		program = getRandomScore();
	}
	@Override
	public void PrintGradeCard() {
		System.out.printf("학번\t이름\t%s\t%s\t%s\t%s\t%s\t총점\t평균\n",
				subject_name[0], subject_name[1],subject_name[2],subject_name[3],subject_name[4]);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f",
				sno,
				name,
				kor,
				eng,
				math,
				statis,
				program,
				kor+eng+math+statis+program,
				kor+eng+math+statis+program);
	}
}
