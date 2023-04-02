package �÷��������ӿ�ũ��;

import java.util.HashSet;
import java.util.Set;

class H {
	;
}

class A {
	int data;

	public A(int data) {
		super();
		this.data = data;
	}
}

class B {
	int data;

	public B(int data) {
		super();
		this.data = data;
	}

	//�̷��� �Ķ���ͷ� ���� object�� ������ ���̶�
	//Ŭ����B�� �ִ� ������ ���̶� ���ϴ°Ŷ�
	//�ּ� �񱳰� �ƴ� ���񱳶�� �����ϸ� �ȴ�.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		if (data != other.data)
			return false;
		return true;
	}
}

public class SetHashSet2 {

	public static void main(String[] args) {
		H h = new H();
		System.out.println(h);
//		�÷��������ӿ�ũ��.H@39ed3c8d
//		�Ǿտ��� �ش� ��Ű���� / Ŭ�����̸� / @�ڿ� ���� �ؽ��ڵ�
//		�ؽ��ڵ� = ��ġ�� ������� ������ ������ / �ּҰ�
//		 => ��������� ��ġ�� �ٸ��� �ؽ��ڵ嵵 �޶����ٰ� ��������

		A a1 = new A(3);
		A a2 = new A(3);

		System.out.println(a1 == a2); // false �ּҰ��� ���ؼ��̴�.
		System.out.println(a1.equals(a2)); // false
		// �ؽ��ڵ�� �ּҰ����� �����̴�.
		System.out.println(a1.hashCode() + " , " + a2.hashCode());

//		============================================================

		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); // false �ּҰ��� ���ؼ��̴�.
		System.out.println(b1.equals(b2)); //equals �������̵��ؼ� true���
		// �ؽ��ڵ�� �ּҰ����� �����̴�.
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		Set<B> setB = new HashSet<>();
		setB.add(b1);
		setB.add(b2);
		
		//�̷��� ���� �Ѵ� 3�̴��� �ᱹ �ּҰ����� �ߺ��� ��Ƴ��⶧����
		//������ �ΰ��� ���´�. 
		System.out.println(setB.size());
		
	}

}
