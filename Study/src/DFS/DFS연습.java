package DFS;

public class DFS���� {

	// ��� �Լ��� ����ؼ� n������ �հ踦 ���϶�

	public static int recursiveSum(int n) {
		if (n == 1) {
			return 1; // ���̻� �ɰ����� �ʴ� �������� ���� ��ȯ�մϴ�.
		}
		return recursiveSum(n - 1) + n;
	}

	public static void main(String[] args) {
		int n = 10;

		System.out.println("1���� 10������ ��(����Լ�) : " + recursiveSum(n));
	}

}
