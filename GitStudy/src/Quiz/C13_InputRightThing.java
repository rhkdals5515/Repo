package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {
	
	/*
	 	����ڷκ��� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ����� ������.
	 	(�߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ��� �� ���α׷� ����)
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		
		while(true) {						
			try {	
				System.out.print("���ڸ� �Է����ּ��� >> ");
				num = sc.nextInt();
				System.out.println("�Է��� ����: "+num);
				break;
			}catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
				String stuck = sc.nextLine();										
				System.out.println("�ɷ��ִ� �� ��: "+ stuck);
			}			
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}

	public static int input(String message) {
		
		int num;
		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			}catch (InputMismatchException e) {
				sc.nextLine();
			}		
		}	
		//sc.close(); // �� �̻� ���� ���� ��ĳ�ʸ� ���� (System.in�� close�� ���� �ʴ� ���� ����
		
		return sc.nextInt();
	}
}
