package ���׸��ǽ�1;

//Apple Ŭ������ AppleŬ������ ������ �ִ� Ŭ����
class Apple {
}

//Pencil Ŭ������ PencilŬ������ ������ �ִ� Ŭ����
class Pencil {
}

class Goods1<T> {
	private Object goods1 = new Object();

	public Object getGoods1() {
		return goods1;
	}

	public void setGoods1(Object goods1) {
		this.goods1 = goods1;
	}

}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {

		Goods1 object = new Goods1();

		object.setGoods1(new Apple());
		// Object �ֻ��� ��ü�� �����ؼ� �����ö� Object�� �޴���
		Object apple1 = object.getGoods1();
		// �ƴϸ� (Apple)��ü�� �ٿ�ĳ�����ؼ� Apple�� �޴��� �ؾ��Ѵ�.
		Apple apple2 = (Apple) object.getGoods1();
		System.out.println("Apple ��ü : " + apple1);
		System.out.println("Apple ��ü : " + apple2);

		object.setGoods1(new Pencil());
		Object pencil1 = object.getGoods1();
		Pencil pencil2 = (Pencil) object.getGoods1();
		System.out.println("Pencil ��ü : " + pencil1);
		System.out.println("Pencil ��ü : " + pencil2);

//		===========================================

		// �߸��� ĳ���� (���� Ÿ�� üũ)
		Goods1 object2 = new Goods1();
		// Object �� �ֻ��� ��ü�� Apple��ü�� �����ؼ� ��Ҵ�.
		object2.setGoods1(new Apple());
		// �׸��� ������ �ٿ�ĳ�������ϴµ� Pencil�� �ص� ���������ִ�.
		// �ᱹ�� ����� ����־ ���ʷ� ������ �Ȱ��̴�.
		Pencil pencil3 = (Pencil) object2.getGoods1();
		// ���࿹�ܰ� �߻��Ѵ�.
		System.out.println(pencil3);

	}
}
