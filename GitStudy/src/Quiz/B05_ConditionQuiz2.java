package Quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true        
		7. 사용자가 입력한 문자열이 exit일 때 true
		※ 유니코드 표 참조
		 */    
		Scanner sc = new Scanner(System.in);		
		char a = 'q';
		char b = 'c';
		char c = 'c';
		char d = 'z';
		char e = '가';
		char f = '가';
		String str = "exit";
		String user_input;
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' || b != '\t');
		System.out.println(c >= '0' && c <= '9');
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		System.out.println(e >= '가' && e <= '힣');
		System.out.println(e >= 0xAC00 && e<= 0x07A3);
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF)); //unicode Table
		System.out.println(str.equals("exit"));
		System.out.print("아무 단어나 입력해보세요 > ");
		user_input = sc.next();
		System.out.println(user_input.equals("exit"));
		
	}
}
