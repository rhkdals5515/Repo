package Quiz;

public class D07_checkValidSocialNumber {
	
	/*
	 	사용자가 주민등록번호를 입력하면
	 	그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	 	
	 	맨앞 2자리 숫자
	 	월 자리에 01 ~ 12 이내의 숫자
	 	일 자리에 01 ~ 31 이내의 숫자 
	 	(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월이면 30/ 2월은 윤년일 때 29 아니면 28)
	 	7번째 자리 '-'
	 	뒷자리 전부 숫자
	 */
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkSocialNumber(String socialNumber) {
		int len = socialNumber.length();
		if (len != 14) {
			System.out.println("주민등록번호를 잘못입력하셨습니다");
		}
		
		for(int i = 0; i < len; ++i) {
			
			char ch = socialNumber.charAt(i);
			
			if((i< 6 && !checkNumeric(ch)) && (i > 6 && !checkNumeric(ch))) {
				System.out.println("숫자를 입력해주세요!");
				return false;
			}else if(!(i == 2 && (ch == '0' || ch == '1'))){
				System.out.println("첫번째 월을 잘못입력하셨습니다");
				return false;
			}else if(!((i == 2 && ch == '1') && (i == 3 && (ch >= '0' && ch <= '2')))){
					System.out.println("달을 잘못 입력하셨습니다");
				return false;
			}else if (!(i == 4 && (ch >= '0' && ch <= '3'))) {
				System.out.println("일을 잘못입력하셨습니다");
				return false;
			}else if (!((i == 4 && ch == '4') && (i == 5 && (ch >= '0' && ch <= '1')))){
				System.out.println("일을 잘못입력하셨습니다");
				return false;
			}else if (i == 6 && ch != '-') {
				System.out.println("하이픈을 입력하지 않았습니다");
				return false;
			}
		}
				
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkSocialNumber("910215-1025102"));
		System.out.println("올바른 주민번호입니다");
	}
}
