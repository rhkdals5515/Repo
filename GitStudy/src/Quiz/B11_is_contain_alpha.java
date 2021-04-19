package Quiz;

public class B11_is_contain_alpha {
	public static void main(String[] args) {
		
		String word = "I have a dream";
		String word2 = "나는 꿈이 있어요";
		
		boolean contain_alphabet = false;
		// 반복문을 이용해 문자열을 한 글자씩 분해하여 검사한다
		// i는 iterable의 줄임말
		for (int index = 0; index < word2.length(); ++index) {
			
			char ch = word2.charAt(index);
			
			if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
				//하나씩 분리한 문자 ch가 알파벳인 경우 도착하는 곳
				contain_alphabet = true;
				break; //하나만 찾고 나면 더 이상 반복문을 진행할 이유가 없음.
			}
		}
		System.out.println("contain_alphabet: " + contain_alphabet);
	}
}
