package myobj;

public class greenBus {
	// ���� �������� ����
	static int width = 500;
	static int height = 200;
	static int tire;
	static int seat;
	
	static void changewidth (int width) {
		greenBus.width = width;
	}
	public static void main(String[] args) {
		greenBus g1 = new greenBus();
		
		System.out.println(g1.width);
	}
}
