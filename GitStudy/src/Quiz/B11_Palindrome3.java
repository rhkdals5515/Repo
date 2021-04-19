package Quiz;

import java.util.Scanner;

public class B11_Palindrome3 {
	/*
 	사용자로부터 단어를 하나 입력받고
 	해당 단어가 회문이라면 "PALINOROME"을 출력
 	회문이 아니라면 "NOT PALINDROME"을 출력해보세요.
 
 	※ 회문? MOM, BOB, APPA, MADAM처럼 대칭인 단어
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요 >> ");
		String word = sc.next();
		String result = null;
		for (int i = 0; i < word.length() / 2; ++i) {
			if (word.charAt(i) == word.charAt(word.length() -1 -i)) {
				result = "PALINORME";
			}else {
				result = "NOT PALINDROME";
			}
		}
		System.out.println(result);
	}
}
