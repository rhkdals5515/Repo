package myobj;

public class greenBus {
	// 서울 지선버스 전용
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
