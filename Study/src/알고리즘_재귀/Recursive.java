package �˰���_���;

public class Recursive {

	// *****
	// *****
	// ***** ����Լ��� �̷��� ���� ����

	public static void dfs(int number) {

		if (number == 0) {
			System.out.println("����");
			return;
		}
		dfs(number - 1);
		System.out.println(number);
		System.out.println("*****");
	}

	public static void main(String[] args) {
		dfs(5);
	}

}
