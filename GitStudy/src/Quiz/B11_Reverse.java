package Quiz;

import java.util.Scanner;

public class B11_Reverse {
	
	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String word;
		System.out.print("���� �Է� >> ");
		word = sc.nextLine();
		for (int i = word.length()-1; i >= 0 ; --i) {
			System.out.print(word.charAt(i));
		}
		}	
	}
