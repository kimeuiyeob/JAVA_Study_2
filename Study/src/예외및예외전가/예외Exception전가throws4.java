package ���ܹ׿�������;

public class ����Exception����throws4 {
	public static void main(String[] args) {
		
		����Exception����throws4 e = new ����Exception����throws4();
		
		try {
			e.bcd(); //bcd�Լ��ȿ��� 2���� ���� ������ �߱� ������ catch�� �ΰ��� �������Ѵ�.
		} catch (ClassNotFoundException | InterruptedException e1) {
			e1.printStackTrace();
		}

	}

	//forName()�� ClassNotFoundException�����ϰ� / thread.sleep()�� InterruptedException �����Ѵ�.
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls =  Class.forName("jave.lang.Object");
		Thread.sleep(1000);
	}

}
