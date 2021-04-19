package myobj.item;

public class shoes extends Item {
	
	int ankle;
	
	public shoes(String name, int price) {
		super(name, price);
		ankle = 15;
	}

	public void use() {
		System.out.println(name+ "를 신고 운동을 하였더니 발건강 상태가 "+ ankle + "정도 좋아졌습니다.");
	}
}
