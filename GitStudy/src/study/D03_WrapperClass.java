package study;

public class D03_WrapperClass {
	
	/*
	 	# Wrapper Class
	 	
	 	 - �⺻ Ÿ�Ե��� ������ ž���� ����ϱ� ���� Ŭ����
	 	 - �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	 
	 	# �⺻�� �̸�
	 	 
	 	 - byte, short, char, int, long, float, double, boolean
	 	 
	 	# ������ �̸�
	 	 
	 	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 	 
	 */
	public static void main(String[] args) {
		/*
		 
		 # parse �ø���		
		 - ���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ���
		 - �� Ÿ�Կ� ����ƽ �޼���� �����Ѵ�
		 - �����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵Ǵ°�찡 ����
		 - �ٽ� ����ϱ� ���ؼ��� ���� �����͸� ������ Ÿ������ �ǵ����� �Ѵ�
		 - radix�� �����ִ� �����ε��� ������ �ǹ��Ѵ�
		*/
		try {
			int a1 = Integer.parseInt("1234ABC", 16);
			System.out.println(a1);
		}catch (NumberFormatException e) {
			System.out.println("int�� ��ȯ�� �� ���� ���ڿ��̾����ϴ�.");
		}
		
		System.out.printf("%f\n",Double.parseDouble("123.23456789"));
		System.out.println(Boolean.parseBoolean("tRuE"));
		System.out.println(Boolean.parseBoolean("yes"));
		
		//Integer i = Integer.valueOf(10);
		
		//int a = 10;
		
		/*
		 	# toString()
		 	
		 	 - �ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�� �� �ִ�
		 	 - toString()�� Object�� �޼����̱� ������ ��� Ŭ������ �����Ѵ�
		 	 - �ν��Ͻ� �޽�Ʈ toString()�� �ش� �ν��Ͻ��� ���� ���ڿ��� ��ȯ�Ѵ�
		 	 - ����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ�
		 */
	
		System.out.println(Integer.toString(123456, 2));
		System.out.println(Integer.toString(123456, 8));
		System.out.println(Integer.toString(123456)); // radix default 10
		System.out.println(Integer.toString(123456, 16));
		
		//int num = 10;
		//Integer num2 = 10;
		//num2.toString();
	
		/*
		 	#typeValue() �ø���
		 	
		 	 - �ش� �ν��Ͻ� ���� ���ϴ� Ÿ���� ������ �ս��� �����ϴ� �޼���
		 	 - Ÿ��ĳ������ ������ ����
		 */
		Integer num = 100000000;
		
		System.out.println(num.byteValue());
		System.out.println(num.shortValue());
		System.out.println(num.longValue());
		System.out.println(num.floatValue());
		System.out.println(num.doubleValue());
		
	}
}