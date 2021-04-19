package Quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;



public class D02_LottoSet {
	/*
	 1���� 45������ �ߺ����� ���� ���� 7���� �̷���� HashSet�� �����Ͽ� 
	 ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
	
	public static void main(String[] args) {
		HashSet<Lotto> lot = new HashSet<>(); 
		
		

}
class Lotto {
	
	private int lotto;
	private static Random ran = new Random();

	private int getRandomLotto() {
		return lotto = ran.nextInt(46) +1;
	} 	
}
*/
	
	public HashSet<Integer> getLottoSet() {
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		return lotto;
	}


/*
	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ�
	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
*/
	public ArrayList<Integer> getLottoArray(){
		return new ArrayList<>(getLottoSet());
		
	}
/*
 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� integer[]�� �����Ͽ�
 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
 */
	public Integer[] getLottoList() {
		return getLottoArray().toArray(new Integer[7]);
	}
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
		
		System.out.println(lotto);
		
	}
}


