package Quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true        
		7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		�� �����ڵ� ǥ ����
		 */    
		Scanner sc = new Scanner(System.in);		
		char a = 'q';
		char b = 'c';
		char c = 'c';
		char d = 'z';
		char e = '��';
		char f = '��';
		String str = "exit";
		String user_input;
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' || b != '\t');
		System.out.println(c >= '0' && c <= '9');
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		System.out.println(e >= '��' && e <= '�R');
		System.out.println(e >= 0xAC00 && e<= 0x07A3);
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF)); //unicode Table
		System.out.println(str.equals("exit"));
		System.out.print("�ƹ� �ܾ �Է��غ����� > ");
		user_input = sc.next();
		System.out.println(user_input.equals("exit"));
		
	}
}
