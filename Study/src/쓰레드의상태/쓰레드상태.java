package �������ǻ���;

public class ��������� extends Thread {

	public static void main(String[] args) {

		Thread.State state;

		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100000000L; i++) {
					;
				}
				super.run();
			}
		};

		state = thread.getState(); // .getState() �������� ���¸� �˷��ִ� ThreadŬ������ ����� �Լ�
		System.out.println("������ ���� ���� : " + state); // �����尡 ��ü ������ ���� .start() ���� �ʾ����Ƿ� NEW�� ��µȴ�.

		thread.start(); // �����带 �����Ų��.
		state = thread.getState();
		System.out.println("������ ���� ���� : " + state); // �̶��� �����尡 ����Ǽ� RUNNABLE �����̴�. �������̶�� �ǹ��̴�.

		try {
			thread.join(); // thread�� .join�� ����Ͽ� CPU���� ������ ��� ���� �̷��ǹ��̴�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		state = thread.getState();
		// �̶��� ���� �������ΰ� �ƴ϶� CPU���� join���� ���𰡰� ���������� �ƹ��͵� ���ϰ� �ֱ⶧���� TERMINATED�����̴�.
		System.out.println("������ ���� ���� : " + state);
	}

}
