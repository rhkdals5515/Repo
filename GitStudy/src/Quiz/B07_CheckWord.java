package Quiz;

import java.util.Scanner;

public class B07_CheckWord {
	
	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	ù ��° ���ڿ�	������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
	 	�ƴ϶�� "Not OK"�� ����غ�����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str; 
		System.out.print("�ܾ �Է��ϼ��� >> ");
		str = sc.next();
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("Not OK");
		}
		// next() : ���� ���ڿ��� �޾ƿ��� (����, \t ����)
		// nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n ����)
		//apple banana orange
		System.out.print("�ƹ��ų� �Է��� ������ > ");
		String word = sc.nextLine();
		
		System.out.println(word);
	}
}
