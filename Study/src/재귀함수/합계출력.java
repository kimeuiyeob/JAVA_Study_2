package ����Լ�;

public class �հ���� {

	public static void main(String[] args) {
		int N = 5;
		System.out.print("1���� " + N + "������ �հ� : " + PlusPlus(5));
	}

	public static int PlusPlus(int n) {
		// n�� 0�� ��� return
		if (n == 0)
			return 0;
		return n += PlusPlus(n - 1); // ����Լ� ����
	}
}