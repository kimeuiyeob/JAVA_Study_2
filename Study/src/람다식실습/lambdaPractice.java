package ���ٽĽǽ�;

public class lambdaPractice {

	public static void main(String[] args) {
		// ��ü ���� ���α׷� ����
		Boy boy = new Boy();
		boy.abc();

		// �͸��̳�Ŭ����
		Boy boy2 = new Boy() {
			@Override
			public void abc() {
				super.abc();
			}
		};
		boy2.abc();
		
	}
}

interface Girl {
	void abc();
}

class Boy implements Girl {
	@Override
	public void abc() {
		System.out.println("Ŭ����B���� A�������̽� �����Ϸ�");
	};
}
