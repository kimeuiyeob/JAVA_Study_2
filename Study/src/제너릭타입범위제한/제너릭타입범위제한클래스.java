package ���ʸ�Ÿ�Թ�������;

public class ���ʸ�Ÿ�Թ�������Ŭ���� {

	public static void main(String[] args) {

		// �Ʒ� �ΰ�ü�� ���� �ǹ��̴�. �������� DŬ���� ���ʸ���<T extends B>�� �Ǿ��ֱ⶧���̴�.
		// �� BŬ�����̰ų� ���ڽ�Ÿ�Ա��� �� ���ü��ִٴ� �ǹ��̴�.
		// D d = new D();
		// D<B> d = new D<>();

		// D<A> d1 = new D<>(); <=�Ұ����ϴ� �������� Ŭ���� D�� �����Ҷ� ���ʸ��� extendsB���� �߱⶧����
		// ���ʸ�Ÿ������ ���ü��ִ°� BŬ�����̰ų� �� ���� �ڽ� Ŭ���� Ÿ�Ե鸸 ���ü��ִ�.

		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); // <==�̰� D<B> d2 = new D<>();�� �����ϴ�.

		d2.setT(new B());
		d2.setT(new C());
//		d3.setT(new B()); <==�̰� �Ұ��� ���� d3���ʸ� Ÿ���� C���� �ؼ� B�� �����Ҽ� ����.
		d3.setT(new C());

		d4.setT(new B());
		d4.setT(new C());
//		d4.setT(new A()); <==�̰� �Ұ��� d4���ʸ�Ÿ���� B���� �̸� �� ����Ŭ������ AŸ���� ������ ����.

	}
}

class A {
}

class B extends A {
}

class C extends B {
}

class D<T extends B> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
