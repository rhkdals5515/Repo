package Quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;



public class D02_LottoSet {
	/*
	 1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하여 
	 반환하는 메서드를 작성 후 테스트해보기
	
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
	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여
	반환하는 메서드를 작성 후 테스트
*/
	public ArrayList<Integer> getLottoArray(){
		return new ArrayList<>(getLottoSet());
		
	}
/*
 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 integer[]을 생성하여
 	반환하는 메서드를 작성 후 테스트
 */
	public Integer[] getLottoList() {
		return getLottoArray().toArray(new Integer[7]);
	}
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
		
		System.out.println(lotto);
		
	}
}


