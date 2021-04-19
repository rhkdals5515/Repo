package myobj.item;

public class basketball extends Item {
	
	int tall;
	
	public basketball(String name, int price) {
		super(name, price);
		tall = 15;
	}
	public void use() {
		System.out.println(name+ "를 많이 해서" + tall + "cm 만큼 키가 컸습니다");
	}
}
