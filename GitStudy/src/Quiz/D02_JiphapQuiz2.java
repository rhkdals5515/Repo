package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를 수 있게 된다
// 고르지 않으면 Object로 설정된다
public class D02_JiphapQuiz2<T> {
	
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		
		union_set.addAll(b);
		
		return union_set;
	}
	
	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> inter_set = new HashSet<>(a);
		
		inter_set.retainAll(b);
		
		return inter_set;
	}
	
	// A - B
	// B - A
	public Set<T> diff(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> diff_set = new HashSet<>(a);
		
		diff_set.removeAll(b);
		return diff_set;
	}
	
	public static int plus(int a, int b) {
		a+= b;
		return a;
	}
	
	public static String plusStr(String a, String b) {
		// String은 값을 변화 시킬수 없다.
		// +=을 할때 알아서 새로운 String 인스턴스를 생성하도록 설계되어 있다
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		// 소문자로 시작하는 타입들(기본형)은 매개변수로 전달할 때 값을 복사하여 전달한다
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus 후 int_a의 값: " + int_a);
		
		// 대문자로 시작하는 타입들(참조형)은 매개변수로 전달할 때 주소를 복사하여 전달한다
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		Set<String> c = new HashSet<>();
		a.add("abc");
		a.add("application");
		a.add("advertise");
		a.add("apple");
		
		b.add("banana");
		b.add("balloon");
		b.add("blue");
		b.add("apple");
		
		c.add("cow");
		c.add("cat");
		c.add("crack");
		c.add("apple");
		
		D02_JiphapQuiz2<String> jiphap_tools = new D02_JiphapQuiz2<String>();
		
		System.out.println("union을 실행하기 전의 a:"+ a);
		System.out.println(jiphap_tools.union(a,b));
		
		System.out.println("union을 실행한 후의 a: "+ a);
		System.out.println(jiphap_tools.union(a,c));
		
		System.out.println(jiphap_tools.intersection(a,b));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a,b),c));
		System.out.println(jiphap_tools.diff(a,b));
		
		
		
	}
}
