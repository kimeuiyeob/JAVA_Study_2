package ����Լ�;

public class ���ѷ��� {
	// ����Լ��� �ڽ��� �������ϴ� �Լ��� �ǹ��Ѵ�.
	// �� �ڱ��ڽ��� ȣ���Ѵٴ� ���̴�.
	// �׷��Ƿ� �ݵ�� ���������� �ʿ��ϴ�. ���������� ���ٸ� ���ѷ����� ���Եɰ��̴�. => ���� �����÷ο�
	// ����Լ��� �������δ� ����Լ��� ���ص��� ������ �ڵ��� �������� ���Ἲ�� �������� ������
	// ����Լ��� ���ص��� ���ٸ� �ڵ带 �����ϱ� ����� ���� �ִ�.
	

	public static void main(String[] args) {
		recursiveTest(1);
	}

	public static void recursiveTest(int count) {
		System.out.println("count : " + count);
		count = count + 1;
		if (count <= 10) { // <==�׷��Ƿ� ���ǹ��� 10���� �Ǹ� �޼��� ȣ����ϰ� �ߴ�.
			recursiveTest(count);
		}
//		recursiveTest(count); <== �̷��� ���ѷ��� 1�� ��� �����ؼ� ��µȴ�.
	}

}
