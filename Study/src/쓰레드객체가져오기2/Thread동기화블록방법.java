//package �����尴ü��������2;
//
//public class Thread����ȭ��Ϲ�� {
//
//	public static void main(String[] args) {
//		// ���� ��ü
//		Mydata mydata = new Mydata();
//
//		// plus Thread1
//		Thread plusThread1 = new PlusThreads(mydata);
//		plusThread1.setName("�÷��������� 1");
//		plusThread1.start();
//
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		Thread plusThread2 = new PlusThreads(mydata);
//		plusThread2.setName("�÷��������� 2");
//		plusThread2.start();
//	}
//}
//
//class Mydata {
//	int data = 3;
//
//	public void plusData() {
//		// ��� ����ȭ�� �̷��� �����
//		// �޼���� �޼��忡�ٰ� syncronized�� �ٿ��ְ�
//		// ��� ����ȭ�� �Ʒ�ó�� ���� ����ȭ��Ű�� �������� �����ǰ�ü�� �ŰԺ����� �ް� �����ش�.
//		synchronized (this) {
//			int mydata = data;
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				data = mydata + 1;
//			}
//		}
//	}
//}
//
//class PlusThreads extends Thread {
//	Mydata mydata;
//
//	public PlusThreads(Mydata mydata) {
//		this.mydata = mydata;
//	}
//
//	public void run() {
//		mydata.plusData();
//		System.out.println(getName() + "������" + mydata.data);
//	}
//
//}
