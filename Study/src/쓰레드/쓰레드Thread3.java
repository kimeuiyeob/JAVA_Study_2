package ������;

public class ������Thread3 extends Thread {

	public static void main(String[] args) {

		������Thread3 thread = new ������Thread3();
		thread.start();

		int[] video = new int[5];
		for (int i : video) {
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� ������" + video[i]);
		}

	}


	@Override
	public void run() {
		int[] subtitle = new int[5];
		for (int i : subtitle) {
			try {
				Thread thread = null;
				thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("�ڸ� ������" + subtitle[i]);
		}
		super.run();
	}

}
