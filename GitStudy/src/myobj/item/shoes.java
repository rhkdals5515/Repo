package myobj.item;

public class shoes extends Item {
	
	int ankle;
	
	public shoes(String name, int price) {
		super(name, price);
		ankle = 15;
	}

	public void use() {
		System.out.println(name+ "�� �Ű� ��� �Ͽ����� �߰ǰ� ���°� "+ ankle + "���� ���������ϴ�.");
	}
}
