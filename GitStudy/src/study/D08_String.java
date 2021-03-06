package study;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;

public class D08_String {
	
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/pineapple";
	
		// split(delimiter) : 문자열을 원하는 기준으로 자른 후 문자열 배열로 반환
	
		String[] splitted_fruits = fruits.split("/");
	
		System.out.println(Arrays.toString(splitted_fruits));
	
		for (String fruit : splitted_fruits) {
			System.out.println(fruit);
		}
	
		// join(delim, 이어붙이고 싶은 것) : 뒤에 나오는 문자열들을 모두 delim으로 이어붙인다
		String join_result1 = String.join("..", splitted_fruits);
		String join_result2 = String.join("-", "Java", "is", "cool");
		String join_result3 = String.join(",", splitted_fruits);
		
		HashSet<StringBuilder> set = new HashSet<>();
		
		set.add(new StringBuilder("Hello"));
		set.add(new StringBuilder("my name is"));
		set.add(new StringBuilder("John Doe"));
		
		String join_result4 = String.join("--", set);
		System.out.println(join_result1);
		System.out.println(join_result2);
		System.out.println(join_result3);
		System.out.println(join_result4);
		
		//substring(start) : start부터 마지막까지 문자열을 잘라서 반환
		// substring (start, end) : start부터 end미만까지 문자열을 잘라서 반환
	
		System.out.println("Hello, everyone!".substring(3));
		System.out.println("Hello, everyone!".substring(0,5));
		System.out.println("Hello, everyone!".substring(5));
	
		// replace() : 문자열을 치환한다
		String emails = "abc123@naver.com, abc1234@naver.com, abcd1234@naver.com";
		
		String replaced = emails.replace("@naver.com", "@gmail.com");
		//String replaced = emails.replace("a", "A");
		// char타입도 가능
		System.out.println(replaced);
		
		// format(format, value) : 서식을 이용해 원하는 문자열을 생성한다
		String text = String.format("오늘은 %c요일입니다.\n", '수');
		System.out.println(text);
	
		// contains(seq) : 문자열에 해당 문자열이 포함되어 있는지 검사한다
		System.out.println("pineapple".contains("apple"));
	
		// startsWith(seq) : 문자열이 해당 문자열로 시작하는지 검사한다.
		System.out.println("pineapple".startsWith("pine"));
		
		// endsWith(seq) : 문자열이 해당 문자열로 끝나는지 검사한다
		System.out.println("resource/image/펭귄.jpeg".startsWith("resource/image/"));
		System.out.println("resource/image/펭귄.jpeg".endsWith(".jpeg"));
	
		//getBytes(charSet) : 문자열을 byte[]로 변환한다 (데이터 전송 준비)
		String data = "오늘도 좋은 하루 보네세요";
		
		byte[] byte_arr = null;
		try {
			byte_arr = data.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 인코딩 타입 익셉션");
			System.exit(0);
		}
		
		for (byte b : data.getBytes()) {
			System.out.printf("%d", b);
		}
		System.out.println();
		
		// 생성자를 이용해 byte[]을 다시 문자열로 합칠 수 있다 (전달 받은 데이터를 변환)
		// byte[]로 나뉠 때와 같은 인코딩 타입을 사용해야 한다		
		try {
			System.out.println(new String(byte_arr, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		
		// trim() : 문자열 바깥쪽의 공백을 제거해준다
		String str1 = "   abc123";
		String str2 = "abc123   ";
		String str3 = "Hello Java ";
		
		System.out.println(str1.equals(str2));
		
		str1 = str1.trim();
		str2 = str2.trim();
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.trim());
		
		//toUpperCase() : 문자열을 모두 대문자로 변환한 새로운 인스턴스 반환
		System.out.println(str1.toUpperCase().trim());
	
		// toLowerCase() : 문자열을 모두 소문자로 변환한 새로운 인스턴스 반환
		System.out.println(str3.toLowerCase().trim());
	
		str1 = "Java";
		str2 = "java";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		System.out.println(str1.equals(str2));
	
		// equalsIgnoreCase() : 대소문자 상관없이 equals()
		str1 = "Hello Java";
		str2 = "hello JAVA";
		
		System.out.println("'" + str1 + "'" + "vs" + "'" + str2 + "'");
		System.out.println("equals: " + str1.equals(str2));
		System.out.println("equals(i): " + str1.equalsIgnoreCase(str2));
		
		// getChars(start, end, 담을곳, 담을곳 시작지점) : char[]에 문자열의 원하는 부분을 담을 수 있다
		char[] buffer = new char[20];
		
		Arrays.fill(buffer, '#');
		
		/*
		 * for (int i = 0; i < buffer.length; ++i) {  
		 		buffer[i] = '#';
		 }
		 */
		
		  "Hello, world!!!".getChars(7, 12, buffer, 10);
	
		  System.out.println(buffer);
	}
}
