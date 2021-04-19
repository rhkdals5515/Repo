package Quiz;

public class B11_is_numeric_str {
	public static void main(String[] args) {
		
		String word = "123456332423";
		String word2 = "1234a231";
		
		int numeric_str = 1;
		
		for (int i = 0; i < word.length(); ++i) {
			
			char ch = word.charAt(i);
		
			if (ch < '0' || ch > '9') {
				numeric_str = 0;
				break; // 숫자가 아닌 다른 문자를 하나라도 찾으면 그만 찾음.
			}
		}
		System.out.println("numeric_str: " + (numeric_str > 0 ? "true" : "false"));
	}
}
