package myobj.school;

import java.util.Random;

public abstract class Student {
	
	final static String[] lastNameList = {"강", "고", "권", "김",
			"나","박", "최", "오", "제갈", "독고", "이", "신", "차", "남궁","배", "서",
			"안","임"};
	
	final static String [] firstNameList = {
			"태현", "태환", "태영", "태희", "태욱","태준", "세현", "재선",
			"현식","혜승","지혜","우현","예림","승미","광민","충민","승운",
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
