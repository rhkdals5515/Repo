package myobj;

public class Peach {
	
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
		
	// �ٸ� ��Ű������ ������ ���� �������� public�� �ٿ��� �Ѵ�
	public void eat() {
		size--;
		calorie -= 10;
	}
}
