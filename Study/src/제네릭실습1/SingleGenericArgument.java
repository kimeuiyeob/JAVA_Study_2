package ���׸��ǽ�1;

class MyClass<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {

		MyClass<String> m1 = new MyClass<>();
		m1.set("�ȳ�");
		String hello = m1.get();
		System.out.println(hello);

		MyClass<Integer> m2 = new MyClass<>();
		m2.set(5);
		int number = m2.get();
		System.out.println(number);

		MyClass<Integer> m3 = new MyClass<>();
//		m3.set("�ȳ�"); <= ���� Ÿ�� ü�� , �ٷ� ������ ������ �߻������ش�.

	}

}
