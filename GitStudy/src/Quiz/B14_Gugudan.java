package Quiz;

public class B14_Gugudan {
	/*
	 	1. �������� ������ ���� ���η� ����غ�����
	 	
	 	2��: 2X1 = 2 2x2 = 4 2x3 = 6 ....
	 	3��: 3x1 = 3 3x2 = 6 3x3 = 9 ...
	 	
	 	2. �������� ������ ���� ���η� ����غ�����
	 	
	 	2��	3��	4�� ...
	 */
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan+"��: ");
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%2d ",dan,gop,dan*gop);
			}
			System.out.println();
			}			

			for (int dan = 0; dan <= 9; ++dan) {
				for(int gop = 2; gop <= 9; ++gop) {
					
					if(dan == 0) {
						System.out.println(dan+"��\t");
					}else {
						System.out.printf("%dx%d=%d\t",gop,dan,gop*dan);	
				}				
		}
				System.out.println();
	}
	}
}