package Quiz;

public class B11_is_contain_alpha {
	public static void main(String[] args) {
		
		String word = "I have a dream";
		String word2 = "���� ���� �־��";
		
		boolean contain_alphabet = false;
		// �ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�
		// i�� iterable�� ���Ӹ�
		for (int index = 0; index < word2.length(); ++index) {
			
			char ch = word2.charAt(index);
			
			if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
				//�ϳ��� �и��� ���� ch�� ���ĺ��� ��� �����ϴ� ��
				contain_alphabet = true;
				break; //�ϳ��� ã�� ���� �� �̻� �ݺ����� ������ ������ ����.
			}
		}
		System.out.println("contain_alphabet: " + contain_alphabet);
	}
}
