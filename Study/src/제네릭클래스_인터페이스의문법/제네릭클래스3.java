package ���׸�Ŭ����_�������̽��ǹ���;

public class ���׸�Ŭ����3 {
	public static void main(String[] args) {

		// �� ���׸��� �⺻ ������ Ŭ���� ���� ���Ǵ� Ÿ���� Ŭ������ ���Ƕ��� �ƴ� ������ �����ϰڴٴ� �ǹ��̴�.
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();

		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();

		Goods<Pencil> goods3 = new Goods<>();
		goods3.set(new Pencil());
//		Apple pencil2 = goods3.get(); //<==PencilŸ������ �����ߴµ� Ÿ���� Apple�� �������� �ϴϱ� ������ �߻��ȴ�.

	}

}

class Apple {
	;
}

class Pencil {
	;
}

class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
