package ���ٽ�;

interface Z {
	void abc(X x, int k);
}

class X {
	void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfStaticMethod_Type2_1 {

	public static void main(String[] args) {
		
		//�ν��Ͻ� �޼��� ���� Type2
		
		//�͸��̳� Ŭ����
		Z z = new Z() {
			@Override
			//��ü�� ��������� �Ѿ�� ���
			//�̷��� ��ü�� ���� �ȸ�����൵ �ȴ�.
			//��ü�� ���� �Ķ���ͷ� ���±⶧���̴�.
			public void abc(X x, int k) {
				//�״�� x�� bcd()�޼��� ȣ��
				x.bcd(k);
			}
		};
		
//		============================
		//���ٽ�
		Z z1 = (x,k) -> x.bcd(k);
		
		
//		============================
		//�ν��Ͻ� �޼��� ���� Type2;
		Z z2 = X::bcd;
		
		
		
		
	}
}
