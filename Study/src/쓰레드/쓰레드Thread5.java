package ������;

public class ������Thread5 {

	public static void main(String[] args) {

		//�͸� �̳�Ŭ������ runnable �������̽� ��ü �����ؼ� ������ ����ϴ� ���
		Thread myThread1 = new Thread(new Runnable() { 
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
			}
		});

		Thread myThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = new String[] { "�ϳ�", "��", "��", "��", "�ټ�" };
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("����" + strArray[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		myThread1.start();
		myThread2.start();
	}
}
