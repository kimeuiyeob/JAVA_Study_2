package ���ʸ�Ÿ�Թ�������;

//	���� ������  �޼��� �̸�  (���ʸ� Ŭ���� �� <���׸� Ÿ�� ��>) {
//		...
//	}
//
//	���� ������  �޼��� �̸�  (���ʸ� Ŭ���� �� <?>) {
//		...
//	}
//
//	���� ������  �޼��� �̸�  (���ʸ� Ŭ���� �� <? extends ����Ŭ����>) {
//		...
//	}
//
//	���� ������  �޼��� �̸�  (���ʸ� Ŭ���� �� <? super ����Ŭ����>) {
//		...
//	}

public class ���ʸ�Ÿ�Թ������Ѹ޼���3 {

//	method(gods<A> a) <=A�� ����
//	method(gods<?> a) <=A,B,C,D ����
//	method(gods<? extends B> a) <=B,C,D �� ����
//	method(gods<? super B> a) <= B,A�� ����

}


class gods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
