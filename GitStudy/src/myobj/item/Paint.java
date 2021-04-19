package myobj.item;

public class Paint extends Item{
	
	int art;
	
	public Paint(String name, int price) {
		super(name, price);
		art = 10;
	}
	public void use() {
		System.out.println(name+ "을 많이 사용하면" + "미술 실력이 " + art+"만큼 오른다");
	}
}
