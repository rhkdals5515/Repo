package myobj.item;

public class Paint extends Item{
	
	int art;
	
	public Paint(String name, int price) {
		super(name, price);
		art = 10;
	}
	public void use() {
		System.out.println(name+ "�� ���� ����ϸ�" + "�̼� �Ƿ��� " + art+"��ŭ ������");
	}
}
