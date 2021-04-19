package study;

public class C07_Abstract {

	/*
	 	# �߻� Ŭ����
	 	
	 	 - �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	 	 - Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstract�� �ٿ� ǥ���Ѵ�
	 	 - ������ �߻� �޼��带 �����ϱ� ������ �ν��Ͻ� ������ �Ұ����ϴ�
	 	 # �߻� �޼���
	 	 - �޼����� ���� (���� Ÿ��, ���� ������, �Ű�����)�� ���س���
	 	      �ڼ��� ������ �ڽ� Ŭ�������� �������̵带 ���� �����ϴ� �ż���
	     - �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
	 */
	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		
		// �͸� Ŭ���� (Anonymouse class)
		Vehicle v2 = new Vehicle() {
			@Override
			void ride() {
				System.out.println("�Ｎ���� ������ Ż��");
				
			}
		};
		v1.ride();
		v2.ride();
	}
}


class Bus extends Vehicle{
	
	@Override
		void ride() {
			System.out.println("����� ���� Ÿ����");
		}
}

abstract class Vehicle {
	
	abstract void ride(); 
}

class Bike extends Vehicle {
	
	// �������̵� ���� (���� �Լ���, ���� ���� Ÿ��, ���� �Ű� ����)
	@Override
	void ride() {
	
		
	}
}