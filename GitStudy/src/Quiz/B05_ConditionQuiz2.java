package Quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
        [ ¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸¼¼¿ä ]

        1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
        2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
        3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
        4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
        5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
        6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true        
		7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
		¡Ø À¯´ÏÄÚµå Ç¥ ÂüÁ¶
		 */    
		Scanner sc = new Scanner(System.in);		
		char a = 'q';
		char b = 'c';
		char c = 'c';
		char d = 'z';
		char e = '°¡';
		char f = '°¡';
		String str = "exit";
		String user_input;
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' || b != '\t');
		System.out.println(c >= '0' && c <= '9');
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		System.out.println(e >= '°¡' && e <= 'ÆR');
		System.out.println(e >= 0xAC00 && e<= 0x07A3);
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF)); //unicode Table
		System.out.println(str.equals("exit"));
		System.out.print("¾Æ¹« ´Ü¾î³ª ÀÔ·ÂÇØº¸¼¼¿ä > ");
		user_input = sc.next();
		System.out.println(user_input.equals("exit"));
		
	}
}
