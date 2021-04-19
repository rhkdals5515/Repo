package Quiz;

public class B14_Gugudan {
	/*
	 	1. 구구단을 다음과 같이 가로로 출력해보세요
	 	
	 	2단: 2X1 = 2 2x2 = 4 2x3 = 6 ....
	 	3단: 3x1 = 3 3x2 = 6 3x3 = 9 ...
	 	
	 	2. 구구단을 다음과 같이 세로로 출력해보세요
	 	
	 	2단	3단	4단 ...
	 */
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan+"단: ");
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%2d ",dan,gop,dan*gop);
			}
			System.out.println();
			}			

			for (int dan = 0; dan <= 9; ++dan) {
				for(int gop = 2; gop <= 9; ++gop) {
					
					if(dan == 0) {
						System.out.println(dan+"단\t");
					}else {
						System.out.printf("%dx%d=%d\t",gop,dan,gop*dan);	
				}				
		}
				System.out.println();
	}
	}
}