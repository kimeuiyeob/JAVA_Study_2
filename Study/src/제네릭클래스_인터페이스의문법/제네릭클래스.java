package ���׸�Ŭ����_�������̽��ǹ���;

public class ���׸�Ŭ���� {

	// TIP : ��ü������ ���׸�Ÿ���� �������� ������ �ü� �ִ� type�� �ֻ��� Ŭ����(Object)�� �ν�
	// �� �Ʒ� ���ڵ�� ������ �ǹ� =>
	// myClass ms = new myClass();
	// myClass<Object> ms = new myClass<>();

	// Ŭ������<���� ���׸� Ÿ��> ���������� = new Ŭ������<���� ���׸� Ÿ��>();
	// �Ǵ�
	// Ŭ������<���� ���׸� Ÿ��> ���������� = new Ŭ������<>(); //�������� ��� ������ Ÿ�� ���� ����

	public static void main(String[] args) {

		MyClass<String> myClass1 = new MyClass<>();
		myClass1.set("�ȳ�");
		System.out.println(myClass1.get());

		MyClass<Integer> myClass2 = new MyClass<>();
		myClass2.set(100);
		System.out.println(myClass2.get());

		MyClass<Integer> myClass3 = new MyClass<>();
//		myClass3.set("�ȳ�"); �̷��� <T>�� ��Ƽ���� ���ߴµ� �ȳ� ���ڿ��� ���� ������ �߻���Ų��.
		System.out.println(myClass3.get());
	}
}

//�̷��� Ŭ���� �ڿ� <>���׸� Ÿ���� T�� ���Ѱ��� ���� Ȯ���� Ÿ���� �������� �ʾҴٴ� �ǹ��̰�
//���߿� ��ü ������ Ÿ���� �������ָ� T�� �� ��Ÿ������ ����ɰ��̴�.
class MyClass<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
