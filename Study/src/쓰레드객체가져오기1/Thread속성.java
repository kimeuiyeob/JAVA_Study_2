package �����尴ü��������1;

public class Thread�Ӽ� {

	public static void main(String[] args) {

		Thread curThread = Thread.currentThread();
		System.out.println("���� ������ �̸� : " + curThread.getName());
		System.out.println("������ �� : " + curThread.activeCount());

		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + " ��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}

		System.out.println("������ �� : " + Thread.activeCount());

	}

}
