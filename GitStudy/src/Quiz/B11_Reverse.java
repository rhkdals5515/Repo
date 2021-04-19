package Quiz;

import java.util.Scanner;

public class B11_Reverse {
	
	// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String word;
		System.out.print("문장 입력 >> ");
		word = sc.nextLine();
		for (int i = word.length()-1; i >= 0 ; --i) {
			System.out.print(word.charAt(i));
		}
		}	
	}
