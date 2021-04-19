package Quiz;

public class D07_checkValidSocialNumber {
	
	/*
	 	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
	 	�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 	
	 	�Ǿ� 2�ڸ� ����
	 	�� �ڸ��� 01 ~ 12 �̳��� ����
	 	�� �ڸ��� 01 ~ 31 �̳��� ���� 
	 	(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11���̸� 30/ 2���� ������ �� 29 �ƴϸ� 28)
	 	7��° �ڸ� '-'
	 	���ڸ� ���� ����
	 */
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkSocialNumber(String socialNumber) {
		int len = socialNumber.length();
		if (len != 14) {
			System.out.println("�ֹε�Ϲ�ȣ�� �߸��Է��ϼ̽��ϴ�");
		}
		
		for(int i = 0; i < len; ++i) {
			
			char ch = socialNumber.charAt(i);
			
			if((i< 6 && !checkNumeric(ch)) && (i > 6 && !checkNumeric(ch))) {
				System.out.println("���ڸ� �Է����ּ���!");
				return false;
			}else if(!(i == 2 && (ch == '0' || ch == '1'))){
				System.out.println("ù��° ���� �߸��Է��ϼ̽��ϴ�");
				return false;
			}else if(!((i == 2 && ch == '1') && (i == 3 && (ch >= '0' && ch <= '2')))){
					System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
				return false;
			}else if (!(i == 4 && (ch >= '0' && ch <= '3'))) {
				System.out.println("���� �߸��Է��ϼ̽��ϴ�");
				return false;
			}else if (!((i == 4 && ch == '4') && (i == 5 && (ch >= '0' && ch <= '1')))){
				System.out.println("���� �߸��Է��ϼ̽��ϴ�");
				return false;
			}else if (i == 6 && ch != '-') {
				System.out.println("�������� �Է����� �ʾҽ��ϴ�");
				return false;
			}
		}
				
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkSocialNumber("910215-1025102"));
		System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
	}
}
