package ���ٽĽǽ�;

//�پ��� ũ���� �迭�� ����� �������ִ� �������̽��̴�.
interface O {
	int[] abc(int length);
}

public class RefOfArrayConstructor {
	public static void main(String[] args) {

		// �迭�� ������ ����
		// 1�� �͸� �̳� Ŭ����
		O o1 = new O() {
			@Override
			public int[] abc(int length) {
				return new int[length];
			}
		};

		// ���ٽ�
		O o2 = length -> new int[length];

		// �迭�� ������ ����
		O o3 = int[]::new;

		int[] array1 = o1.abc(3);
		System.out.println(array1.length);
		int[] array2 = o2.abc(4);
		System.out.println(array2.length);
		int[] array3 = o3.abc(5);
		System.out.println(array3.length);

	}
}
