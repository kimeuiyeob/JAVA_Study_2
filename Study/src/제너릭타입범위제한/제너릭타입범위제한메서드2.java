package ���ʸ�Ÿ�Թ�������;

public class ���ʸ�Ÿ�Թ������Ѹ޼���2 {

	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.method1("�ȳ�");

		BCD bcd = new BCD();
		bcd.method1(new Myinterface() { // ���⼭ �͸�Ŭ������ interface�� print()�޼��带 �����Ͽ���.
			@Override
			public void print() {
				System.out.println("print() �����Ϸ�");
			}
		});

	}
}

class ABC {
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));
	}
}

interface Myinterface {
	public abstract void print();
}

class BCD {
	// �������̽��� ���ʸ� �ȿ��� interface�� ��ӹ������� implements�� �ƴ϶� extends�� ����Ѵ�.
	// �׸��� ���� ���ʸ� �ȿ��� ��ӹ޴� ������ �ƴ϶� �������Ѱ����� �´�.
	public <T extends Myinterface> void method1(T t) {
		t.print();
	}
}