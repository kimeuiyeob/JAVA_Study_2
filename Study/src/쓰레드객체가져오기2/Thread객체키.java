package �����尴ü��������2;

public class Thread��üŰ {

	// ������ ����ȭ���� ���� �߿��Ѱ� Ű�̴�!!
	// ��ü�� Ű �� ������ ��ü�� �޾� ����ȭ�� �ϸ� ����ȭ�� ������
	// ���ο� ��ü�� Ű�� �����ϸ� �� �װ� �װŴ�� ������ �۾��� �Ѵ� => �̺κ��� ������ ����ȭ�� �߿�κ��̴�.
	public static void main(String[] args) {

		MyData mydata = new MyData();

		// thread ��ü�� �� 3���� �����Ѵ�.
		Thread thread = new Thread() {
			public void run() {
				mydata.abc();
			};
		};
		thread.start(); // 3���� �����带 ���ÿ� ���� ���ѵ�
		// ������ ����ȭ�޼���� ��ϵ���ȭ�� �Ǿ��־
		// mydata��ü�� Ű�� ��� ���� ����ɼ��ۿ� ����.

		Thread thread2 = new Thread() {
			public void run() {
				mydata.bcd();
			};
		};
		thread2.start();

		Thread thread3 = new Thread() {
			public void run() {
				mydata.cde();
			};
		};
		thread3.start();

		Thread thread4 = new Thread() {
			public void run() {
				mydata.def();
			};
		};
		thread4.start();
	}
}

//=================================================

class MyData {

	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void cde() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "��°");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	void def() { // �̶� synchronized(������ ��ü) <==����� Mydata��ü�� �ƴ� ���ο� ��ü�� �����Ѵٸ�...
		// ������� �ٸ�Ű�� ������ �޼��� ����� �����ų���̴�.
		synchronized (new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "�̰� ���ο� ��ü ����");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
