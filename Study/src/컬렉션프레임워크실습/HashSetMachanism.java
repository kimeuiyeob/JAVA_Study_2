package �÷��������ӿ�ũ�ǽ�;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class A {
	int data;

	public A(int data) {
		super();
		this.data = data;
	}

// ================================================
	@Override
	public int hashCode() {
		// data�� ������ ������ hashCode�� �����Ѵ�.
		// �׷��� ���� ������ ������ ��ġ������ �����Ѵٴ� ���̴�.
		return Objects.hash(data);
	}

// ================================================
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			this.data = ((A) obj).data;
			return true;
		} else {
			return false;
		}
	}
}

// ================================================
public class HashSetMachanism {
	public static void main(String[] args) {
		Set<A> hSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		// equals �� hashcode �����Ǹ� ���� ������ �Ʒ� ������ false�����´�.
		// �� ������ new �����ν� ������ ��ġ�� �ٸ��� ������ ���� 3���� ���ϸ� �ȵȴ�.
		// �׷��� ���� �����Ƿ� ������ ������ ���ϰ� �������� ���� true�� ���ò���.
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() == a2.hashCode());

	}
}
