package �÷��������ӿ�ũ��;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		// TreeSet<E>
		// Set �������̽��� ������ ���� Ŭ����
		// ������ ���Ҹ� ������ ���·� �����ϸ� ��������� ��������
		// �Է¼����� ������� ũ������� ��� (������Ҵ� ��� �񱳰� �����ؾ��Ѵ�) -> �̷��� ũ������� �����ϱ⶧��
		// �����ʹ� ������������ ���ĵȴ�.

		TreeSet<Integer> treeSet = new TreeSet<>();

		int[] intArry = { -5, -3, -9, 6, 4, -2, 6, 1, 0, 3 };
		// treeSet�� ������ ������ ������������ ���ĵǼ� ��µȴ�.
		for (int i = 0; i < intArry.length; i++) {
			treeSet.add(intArry[i]);
		}
		System.out.println(treeSet);

	}
}
