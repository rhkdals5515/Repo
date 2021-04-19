package Quiz;

import java.util.Scanner;

public class B07_CheckWord {
	
	/*
	 	사용자로부터 단어를 하나 입력받고
	 	첫 번째 글자와	마지막 번째 글자가 일치하면 "OK"를 출력
	 	아니라면 "Not OK"를 출력해보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str; 
		System.out.print("단어를 입력하세요 >> ");
		str = sc.next();
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("Not OK");
		}
		// next() : 다음 문자열을 받아오기 (공백, \t 기준)
		// nextLine() : 다음 한 줄을 String타입으로 받아오기 (\n 기준)
		//apple banana orange
		System.out.print("아무거나 입력해 보세요 > ");
		String word = sc.nextLine();
		
		System.out.println(word);
	}
}
