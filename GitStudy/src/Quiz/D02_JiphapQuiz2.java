package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�
// ���� ������ Object�� �����ȴ�
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
		// String�� ���� ��ȭ ��ų�� ����.
		// +=�� �Ҷ� �˾Ƽ� ���ο� String �ν��Ͻ��� �����ϵ��� ����Ǿ� �ִ�
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		// �ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus �� int_a�� ��: " + int_a);
		
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
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
		
		System.out.println("union�� �����ϱ� ���� a:"+ a);
		System.out.println(jiphap_tools.union(a,b));
		
		System.out.println("union�� ������ ���� a: "+ a);
		System.out.println(jiphap_tools.union(a,c));
		
		System.out.println(jiphap_tools.intersection(a,b));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a,b),c));
		System.out.println(jiphap_tools.diff(a,b));
		
		
		
	}
}
