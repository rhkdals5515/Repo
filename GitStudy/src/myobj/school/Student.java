package myobj.school;

import java.util.Random;

public abstract class Student {
	
	final static String[] lastNameList = {"��", "��", "��", "��",
			"��","��", "��", "��", "����", "����", "��", "��", "��", "����","��", "��",
			"��","��"};
	
	final static String [] firstNameList = {
			"����", "��ȯ", "�¿�", "����", "�¿�","����", "����", "�缱",
			"����","����","����","����","����","�¹�","����","���","�¿�",
	};
	
	String name;
	int kor;
	int eng;
	int sno;
	Random ran;
	
	public Student(int sno) {
		this.sno = sno;
		
		ran = new Random();
		
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		name = getRandomName();
	}
	
	public abstract void PrintGradeCard();
	
	int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	String getRandomName() {
		return lastNameList[ran.nextInt(lastNameList.length)]
				+ firstNameList[ran.nextInt(firstNameList.length)];
	}
}
