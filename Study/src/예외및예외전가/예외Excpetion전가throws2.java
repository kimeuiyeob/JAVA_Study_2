package ���ܹ׿�������;

public class ����Excpetion����throws2 {

	public static void main(String[] args) throws InterruptedException {

		����Excpetion����throws2 e = new ����Excpetion����throws2();
		e.abc();

	}

	void cde() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("���ܸ� main �Լ� ���� JVM���� ���� �غ��ڽ��ϴ�.");
	}

	void bdc() throws InterruptedException {
		cde();
	}

	void abc() throws InterruptedException {
		cde();
	}

}
