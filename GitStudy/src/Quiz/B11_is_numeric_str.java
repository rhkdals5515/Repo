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
				break; // ���ڰ� �ƴ� �ٸ� ���ڸ� �ϳ��� ã���� �׸� ã��.
			}
		}
		System.out.println("numeric_str: " + (numeric_str > 0 ? "true" : "false"));
	}
}
