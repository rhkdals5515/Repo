package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_JiphapQuiz {
	
	/*	 	
 	
 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set타입으로 반환하는 메서드
 	
 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set타입으로 반환하는 메서드
 	
 	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set타입으로 반환하는 메서드
 
 */	
	public Set<Integer> Combined(){
		Set<Integer> sumSet  = new HashSet<>();
		ArrayList<Integer> numbers1 = new ArrayList<>();
		HashSet<Integer> numbers2 = new HashSet<>();
		numbers1.add(10);
		numbers1.add(20);
		numbers1.add(30);
		numbers1.add(10);
		numbers1.add(10);
		
		numbers2.add(40);
		numbers2.add(50);
		numbers2.add(60);
		numbers2.add(70);
		numbers2.add(40);
		
		sumSet.addAll(numbers1);
		sumSet.addAll(numbers2);
		return sumSet;
	}
	
	public Set<Integer> Intersection(){
		Set<Integer> intersect  = new HashSet<>();
		ArrayList<Integer> jiphap1 = new ArrayList<>();
		HashSet<Integer> jiphap2 = new HashSet<>();
		
		jiphap1.add(10);
		jiphap1.add(20);
		jiphap1.add(30);
		jiphap1.add(40);
		jiphap1.add(50);
		
		jiphap2.add(20);
		jiphap2.add(30);
		jiphap2.add(40);
		jiphap2.add(60);
		
		if(jiphap2.retainAll(jiphap1)) {
			intersect = jiphap2;
		}
		return intersect;
	}
	
	public Set<Integer> differenceSet(){
		Set<Integer> difference  = new HashSet<>();
		ArrayList<Integer> jiphap1 = new ArrayList<>();
		HashSet<Integer> jiphap2 = new HashSet<>();
		
		jiphap1.add(10);
		jiphap1.add(20);
		jiphap1.add(30);
		jiphap1.add(40);
		jiphap1.add(50);
		
		jiphap2.add(20);
		jiphap2.add(30);
		jiphap2.add(40);
		jiphap2.add(60);
		
		
		if(jiphap2.removeAll(jiphap1)) {
			difference = jiphap2;
		}
		return difference;
	}
	
	
	public static void main(String[] args) {
		Set<Integer> sumSet = new D02_JiphapQuiz().Combined();
		Set<Integer> intersect = new D02_JiphapQuiz().Intersection();
		Set<Integer> difference = new D02_JiphapQuiz().differenceSet();
		System.out.println(sumSet);
		System.out.println(intersect);
		System.out.println(difference);
	}
}
