package myobj.school;

public class NetworkStudent extends Student {
	
	static String[] subject_name = {"����", "����", "linux","ccna"};
	
	int linux;
	int ccna;
	
	public NetworkStudent(int sno) {
		super(sno);
		linux = getRandomScore();
		ccna = getRandomScore();
	}
	@Override
	public void PrintGradeCard() {
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t����\t���\n",
				subject_name[0],subject_name[1],subject_name[2],subject_name[3]);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno,
				name,
				kor,
				eng,
				linux,
				ccna,
				kor+eng+linux+ccna,
				(kor+eng+linux+ccna) / 4.0);
		
		System.out.println("--------------------------------------");
	}
	}

