package ����Լ�;

public class RecursionFunctionPrac1 {

	// ��� �Լ� getSum()����
	public static int getSum(int i) {
		// ����Լ� Ż�� ����
		if (i < 10) {
			// 1�� �����ؼ� i�� 0���� �������� 10�� �ݺ�
			i++;
			// getSum()�Լ��� 10�� �ݺ��ؼ� i�� ������Ų��.
			return i += getSum(i);
		}
		// 10�� �ݺ��� ������ 0�� ������ ������ ������ �����Ѵ�.
		return 0;
	}

	public static void main(String[] args) {
//		========================================
		// for���� �̿��� ���� �հ�
//		int number = 10;
//		int sum = 0;
//		
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		========================================
		// ����Լ��� �̿��� ���� �հ�
		int sum = getSum(0);
		System.out.println(sum);

	}
}