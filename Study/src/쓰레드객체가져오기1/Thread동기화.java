package �����尴ü��������1;

//Thread����ȭ(synchronized)

//
//	����ȭ�� �ǹ�
//	-�ϳ��� �۾��� ������ �Ϸ���� �ٸ� �۾� ����
//	-cf. �񵿱�� : �ϳ��� �۾� ��� ����(�Ϸ�� �������) �ٷ� �ٸ� �۾� ��� ����
//	
//	����ȭ�� �ʿ伺
//	-�ΰ��� �����尡 �ϳ��� ��ü�� �����ϴ� ���

//��Ƽ ������� ���ÿ� �۾��� �����ϴ� ������ ������ �̷��� ��ü�� �����ϴ� ��쿡 �̷� �������� �߻��Ѵ�. 

public class Thread����ȭ {

	public static int Data = 5;

	public static void main(String[] args) {
		
		PlusThread p = new PlusThread();
		p.start();
		PlusThread2 p2 = new PlusThread2();
		p2.start();
		
		System.out.println(Data); //�̷��� �Ǹ� mydata�� +1�� �ι��߱⶧���� 7�̳��;ߵǴµ� ������� 6�� ���´�.

	}

}

class PlusThread extends Thread { //���⵵ 5�������ٰ� +1�� ���ذ��̰� �Ʒ��� �Ȱ����ؼ� ������� 6�̳��°��̴�.
	@Override
	public void run() {
		Thread����ȭ plus = new Thread����ȭ();
		plus.Data += 1;
	}
}

class PlusThread2 extends Thread {
	@Override
	public void run() {
		Thread����ȭ plus = new Thread����ȭ();
		plus.Data += 1;
	}
}

