package Quiz;

import java.util.Scanner;

public class B11_Palindrome3 {
	/*
 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
 	�ش� �ܾ ȸ���̶�� "PALINOROME"�� ���
 	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����.
 
 	�� ȸ��? MOM, BOB, APPA, MADAMó�� ��Ī�� �ܾ�
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ��� >> ");
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
