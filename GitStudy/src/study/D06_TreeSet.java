package study;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {
	
	/*
	 	# TreeSet
	 	
	 	 - 중복값을 저장할 수 없다
	 	 - 데이터를 저장할 때 comparator를 이용해 미리 정렬한다
	 	 - 요소로 null을 허용하지 않는다
	 	 - 처음에 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
	 	 - 하지만 TreeSet은 정렬이 미리 되어 있기 때문에 정렬된 순서로 데이터를 꺼내는 것은
	 	      가장 빠르다
	 	 
	 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_GNO기준_내림차순());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_오름차순());
		
		// 해당 객체 자체가 비교 가능한 객체라면 Comparator를 사용하지 않을 수 있다
		TreeSet<String> word_tree = new TreeSet<>();
		TreeSet<Mango> mango_tree = new TreeSet<>();
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(31));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		
		
		
		grape_tree2.addAll(grape_tree);
		
		System.out.println(grape_tree);
		System.out.println(grape_tree2);
		
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
		
		System.out.println(word_tree);
		System.out.println(mango_tree);
		
		// # TreeSet 활용
		// decendingSet() : 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환
		System.out.println(grape_tree.descendingSet());
		
		// headSet(toElement) : 맨 앞부터 원하는 요소까지 자른 Set을 반환
		System.out.println(grape_tree.headSet(new Grape().setGno("3")));
		
		// tailSet(toElement) : 원하는 요소부터 맨 뒤까지 자른 set을 반환
		System.out.println(grape_tree.tailSet(new Grape().setGno("3")));
		
		// subSet(fromElement, toElement) : 원하는 요소부터 시작해서 원하는 요소까지 자른 Set을 반환
		System.out.println(grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
		
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(5);
		int_tree.add(15);
		int_tree.add(75);
		int_tree.add(33);
		int_tree.add(21);
		int_tree.add(9);
		int_tree.add(1);
		
		System.out.println(int_tree);
		
		// ceiling(element) : 원하는 가장 가까운 요소를 올려서 선택 (전달한 값도 포함)
		System.out.println(int_tree.ceiling(21));
		System.out.println(int_tree.ceiling(21));
		System.out.println(int_tree.ceiling(22));
		
		// floor(element) : 원하는 가장 가까운 요소를 내려서 선택 (전달한 값도 포함)
		System.out.println(int_tree.floor(21));
		System.out.println(int_tree.floor(20));
		System.out.println(int_tree.floor(19));
		System.out.println(int_tree.floor(18));
		
		// higher(element) : 원하는 가장 가까운 요소를 올려서 선택 (전달한 값 미포함)
		System.out.println(int_tree.higher(21));
		
		// lower(element) : 원하는 가장 가까운 요소를 내려서 선택 (전달한 값 미포함)
		System.out.println(int_tree.lower(21));
		// 연습문제 : 망고트리에 망고를 5개 추가할때 mno기준 오름차순 정렬이 되도록 만들고 확인
		
		mango_tree.add(new Mango("54321",10, 15));
		mango_tree.add(new Mango("1234",10,12));
		mango_tree.add(new Mango("2345",11,13));
		mango_tree.add(new Mango("1234",10,12));
		mango_tree.add(new Mango("45678",11,13));
		
		System.out.println(mango_tree);
				
	}
}

class MangoCompareBySweetAsc implements Comparator<Mango> {
	
	/*
	 	# Comparator의 규칙
	 	
	 	- compare 메서드의 리턴 값이 1이면 o1과 o2의 순서를 바꾼다
	 	- copmare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
	 	- compare 메서드의 리턴값이 -1이면 o1과 o2의 순서를 그대로 유지한다
 */
	
	@Override
	public int compare(Mango o1, Mango o2) {
		
		if (o1.sweet > o2.sweet) {
			return 1;
		} else if (o1.sweet < o2.sweet) {
			return -1;
		} else {
			return 0;
		}
	}
}

class MangoSetMno implements Comparator<Mango> {
	//return o1.mno.compareTo(o2.mno) * -1;
	
	@Override
	public int compare(Mango o1, Mango o2) {
		
		String mno1 = o1.mno;
		String mno2 = o2.mno;
		
		int max_len = Math.min(mno1.length(), mno2.length());
		for(int i = 0; i < max_len; ++i) {
			if (mno1.charAt(i) < mno2.charAt(i)) {
				return 1;
			} else if (mno1.charAt(i) > mno2.charAt(i)) {
				return -1;
			}
			if (mno1.length() == mno2.length()) {
				return 0;
			} else if (mno1.length() < mno2.length()) {
				return 1;
			}else {
				return -1;
			}
		}
		return max_len;	
		
	}
}

// Comparator : 비교할때 사용하는 비교 도구 클래스로 만드는 인터페이스
// Comparable : 이 객체가 비교 
class Mango implements Comparable<Mango> {
	String mno;
	int sweet;
	int size = 5;
	
	public Mango(String mno, int sweet, int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;
	}
	Mango SetMno(String mno) {
		this.mno = mno;
		return this;
	}

	@Override
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	
	}

	@Override
	public String toString() {
		return mno + "/" + sweet + "/" + size; 
	}
}

	
