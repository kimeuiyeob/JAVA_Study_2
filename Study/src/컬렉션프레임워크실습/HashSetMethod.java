package �÷��������ӿ�ũ�ǽ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String> hset1 = new HashSet<>();
		hset1.add("��");
		hset1.add("��");
		hset1.add("��");
		// �ߺ� ����
		// �Է� ������ ��� ������ �ٸ���.
		System.out.println(hset1);
//		=========================================
		Set<String> hset2 = new HashSet<>();
		List<String> list1 = new ArrayList<>();
		hset2.add("��");
		hset2.add("��");
		list1.add("��");
		list1.add("��");
		// Ÿ�Ը� ������ set addall �޼���� list��ü���� �������ִ�.
		hset2.addAll(list1);

		hset2.removeAll(list1);
		System.out.println(hset2);
//		=========================================
		if (hset2.contains("��")) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
//		=========================================
		// .iterator() iterator��ü�� �̾Ƴ��� �Լ�
		// �� terator.hasNext() �� ���� ���������� �����ü��ִ�.
		// .hasNext() �Ҹ�Ÿ���̿��� ���� ������ true���� next�� ���� ����Ѵ�.
		Iterator<String> iterator = hset2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		=========================================
		// ����Ʈ�� �迭�� �ٲٱ�
		// .toArray()�׳� �޼��带 ����ϸ� Ÿ���� ObjectŸ���̿��� Object�迭�� �޾�����Ѵ�.
		Object toObjectArr = hset2.toArray();
		// StringŸ������ ����� ������ �̷��� �����. [0]�� �ȿ� ���� �ִ¸�ŭ ũ�Ⱑ �����ȴ�.
		String[] toStringArr = hset2.toArray(new String[0]);
		System.out.println(Arrays.toString(toStringArr));
//		=========================================
		
		
	}
}
