package myobj.school;

public class Machine_Learning extends Student {
	
	//�ӽŷ��� �� �л��� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	
	static String[] subject_name = {"����", "����", "����", "�����", "���α׷��� ���"};
	
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
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t%s\t����\t���\n",
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
