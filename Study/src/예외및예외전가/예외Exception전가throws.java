package ���ܹ׿�������;

public class ����Exception����throws {

	// throws ���ܸ� �����Ѵ�. / ���ܸ� ���ѱ��.
	// ������ ���� �޼ҵ�� �� ���ܸ� �޾ƾ��Ѵ�.
	// �޼ҵ� �̸� ���� throws�̸�
	// thread.sleep()�̶�°� �Ϲ� ����ó���� �ٷ� ����ó���� ���־���Ѵ�
	// �� ������ API�����ȿ� .sleep()���� �Ǹ� �� �Լ��� ������������� interruptedException�� �����߱⶧����
	// ���� ������ �̰� �޾Ƽ� ���� ó������ �� ���������� ���ϴ°Ŵ�.

	public static void main(String[] args) {

		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
		
	}
}

class A {
	void abc() {
		bcd();
	}

	void bcd() { //bcd�޼��忡�� thread���� ��Ƽ� bcd�� ��밡��
		try {
			Thread.sleep(1000);
			System.out.println("bcd�޼��忡�� ���� ó��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//=============================================================

class B {
	void abc() { //abc�޼��忡�� bcd�޼����� ���������� ���⼭ �޾Ƽ� ó���Ѵ�.
		
		try {
			bcd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException { //bcd�޼��忡�� ���ܸ� abc�޼���� ����
		Thread.sleep(1000);
		System.out.println("abc�޼��忡�� ���� ó��");
	}
}
