package myobj.item;

public class basketball extends Item {
	
	int tall;
	
	public basketball(String name, int price) {
		super(name, price);
		tall = 15;
	}
	public void use() {
		System.out.println(name+ "�� ���� �ؼ�" + tall + "cm ��ŭ Ű�� �ǽ��ϴ�");
	}
}
