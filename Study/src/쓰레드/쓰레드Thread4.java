package ������;

public class ������Thread4 {

	// ���⼱ �����尡 �� 3���� ���ư���.
	public static void main(String[] args) { // ���� ������ �ϳ�

		Video v = new Video(); 
		v.start();  // ���� ������ ��

		Sub s = new Sub(); 
		s.start(); // �ڸ� ������ ��
	}
}

class Video extends Thread {

	@Override
	public void run() {
		String[] strArray = new String[] { "�ϳ�", "��", "��", "��", "�ټ�" };
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("�ڸ�" + strArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}

class Sub extends Thread {
	@Override
	public void run() {
		String[] strArray2 = new String[] { "1", "2", "3", "4", "5" };
		for (int i = 0; i < strArray2.length; i++) {
			System.out.println("����" + strArray2[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
