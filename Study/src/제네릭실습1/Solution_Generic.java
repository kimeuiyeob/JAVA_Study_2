package ���׸��ǽ�1;

class Opple {
}

//Pencil Ŭ������ PencilŬ������ ������ �ִ� Ŭ����
class Oencil {
}

class Gds<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}

public class Solution_Generic {
	public static void main(String[] args) {

		Gds<Opple> gds1 = new Gds<>();
		gds1.set(new Opple());
		Opple opple = gds1.get();
		System.out.println("1��° : " + opple);

		try {
			// ���࿡ ���׸� Ÿ���� �������ϸ� �ڵ������� �����Ϸ���
			// ObjectŸ������ �����Ѵ�.
			// �׷��� �Ʒ��� ���� ���� Ÿ�� üũ�� �ؼ� ���������� �߻���Ű�� �ʴ´�.
			Gds gds2 = new Gds<>();
			gds2.set(new Oencil());
			// ���⼭ ���� ������ �߻���Ų��.
			Opple oencil = (Opple) gds2.get();
			System.out.println("2��° : " + oencil);

		} catch (Exception e) {
			System.out.println("2��° : ������ ����~~");
		}

		Gds<Oencil> gds3 = new Gds<>();
		gds3.set(new Oencil());
		Oencil oencil2 = gds3.get();
		System.out.println("3��° : " + oencil2);

	}
}
