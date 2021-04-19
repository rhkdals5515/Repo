package Quiz;

public class B11_Palindrome2 {
	
	public static void main(String[] args) {
		
		String word = "MAXICO";
		
		boolean palindrome = true;
		for (int i = 0, j = word.length() - 1; i < word.length() / 2; ++i, --j) {
		
			if (word.charAt(i) != word.charAt(j)) {
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome ? "회문입니다." : "회문이 아닙니다.");
	}
}
