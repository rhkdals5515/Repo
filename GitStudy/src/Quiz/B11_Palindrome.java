package Quiz;

public class B11_Palindrome {
	
	/*
	 	사용자로부터 단어를 하나 입력받고
	 	해당 단어가 회문이라면 "PALINOROME"을 출력
	 	회문이 아니라면 "NOT PALINDROME"을 출력해보세요.
	 
	 	※ 회문? MOM, BOB, APPA, MADAM처럼 대칭인 단어
	 */
	public static void main(String[] args) {
		
		String word = "APPA";
		String result = "PALINDROME";
		
		for (int i = 0; i < word.length(); ++i) {			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt((word.length()-1)-i);
			if (ch1 != ch2) {
				result = "NOT PALINDROME";
			}
		}			
		System.out.println(result);
	}
		
}

