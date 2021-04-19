package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D07_checkValidPhoneNumber {
	
	/*
	 	����ڷκ��� �ڵ�����ȣ�� �Է¹�����
	 	�ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������
	 	
	 	���� 3�ڸ��� ����
	 	�ι�° ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
	 	����° ���ڴ� 4�ڸ�
	 	4��°, 8��° �Ǵ� 9��° ���ڴ� '-' 
	 */
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean PhoneNumber(String phoneNumber) {
		int len = phoneNumber.length();
		
		if (len != 12 && len != 13) {
			System.out.println("[invalid] ���̰� �ùٸ��� ����");
		}
		
		for (int i = 0; i < len; ++i) {
			
			char ch = phoneNumber.charAt(i);
		
			if (i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] �Ǿ� 3�ڸ��� ���� �ƴѰ��� ����");
				return false;
			
			}else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
				return false;
			}else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] ��� �ڸ��� ���� �ƴѰ��� ����");
				return false;
			}else if ((i > 7 && len == 12) || (i > 8 && len == 13) && !checkNumeric(ch) ) {
				System.out.println("[invalid] ������ �ڸ��� ���� �ƴѰ��� ����");
				return false;
			}
		}
		
		return true;
	}
		
		
	public static void main(String[] args) {
		
		if (PhoneNumber("123-1224-2a44")) {
			System.out.println("�ùٸ� �ڵ��� ��ȣ�Դϴ�.");
		}
	}
}