package �����尴ü��������;

//����ȭ ����� 2������ �ִ�
//1.�޼��� ����ȭ
//���� ������   synchronized   ����Ÿ��   �޼���� (�Է� �Ű� ����)  {
//		����ȭ�� �ʿ��� �ڵ�
//	}

public class Thread����ȭ�޼����� {
	public static void main(String[] args) {
		// ���� ��ü
		Mydata mydata = new Mydata();

		// plus Thread1
		Thread plusThread1 = new PlusThreads(mydata);
		plusThread1.setName("�÷��������� 1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread plusThread2 = new PlusThreads(mydata);
		plusThread2.setName("�÷��������� 2");
		plusThread2.start();
	}
}

class Mydata {
	int data = 3;

	public synchronized void plusData() { // �޼��� ����ȭ <- ���ÿ� �ΰ��� �����尡 ����ȭ �޼��� ��� �Ұ�4
		// �� �� ����ȭ�޼���� �ٸ� �����尡 �۾��� ���ᰡ �Ǹ� ����Ǵ� ����ȭ �޼����̴�.
		int mydata = data;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			data = mydata + 1;
		}
	}
}

class PlusThreads extends Thread {
	Mydata mydata;

	public PlusThreads(Mydata mydata) {
		this.mydata = mydata;
	}

	public void run() {
		mydata.plusData();
		System.out.println(getName() + "������" + mydata.data);
	}

}
