package Quiz;

public class B11_Palindrome {
	
	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	�ش� �ܾ ȸ���̶�� "PALINOROME"�� ���
	 	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����.
	 
	 	�� ȸ��? MOM, BOB, APPA, MADAMó�� ��Ī�� �ܾ�
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

