package ������;

public class ������Thread2 implements Runnable {
	
	//�ΰ��� ���� ���ÿ� �ϴ°� ��Ƽ�������̴�.
	//������� ���ü�(Concurrency)�� ���ļ�(Parallelism)�� ������ ����
	//=>����ڴ� ���ÿ� �����ϴ°ɷ� �ν�
	//�Ѹ���� ��û������ ù��° �������ϰ� �ٽ� �� ��û������ �ι�° �������ϰ� �ٽ� ù��° �ٽ� �ι�° �̷�����?
	
	//�� Runnable�ȿ� run()�޼��尡 �ְ� �������̽��̱⶧���� run()�� �������̵��� ���� �����Ѵ�.
	//�׷��� ������� Runanble��ü�� Thread�����ڿ��� �����Ͽ� Thread��ü�� ����� Thread������ �Ϸ�ȴ�.
	
	public static void main(String[] args) {

		������Thread2 thread = new ������Thread2();
		Thread the = new Thread(thread);
	
		//�������Ѱ� run()������ start()���ؾ����� run()�̽����̵ȴ�.
		//�׸��� �� �ѹ��� �����̵ȴ�.
		the.start(); 
//		the.run(); �̷��� �ϸ� ������ ������ ���ο� �����带 �������� �ʾƼ� ���Ͼ����� run()�� ȣ���ѰͰ� �����ϰԵȴ�.
		
		//�� run()�� ������ ������ start()�� �����带 �����ϴ� ����?
		//start() = ���ο� ������ ���� / �߰��� ���� ��� �غ� + ���ο� ���������� run()����

		int[] videoFrame = new int[6];
		for (int i = 0; i < videoFrame.length; i++) {
			videoFrame[i] = i;
			try {
				Thread.sleep(1000);
				System.out.println(videoFrame[i] + "���� ������");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		String[] subtitle = new String[6];
		for (int i = 0; i < subtitle.length; i++) {
			subtitle[i] = ("�ڸ�" + i);
			try {
				Thread.sleep(1000);
				System.out.println(subtitle[i] + "�ڸ� ������");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
