package �˰���_���;

public class �Ǻ���ġ���� {

	public static int pibonachi(int number) {

		if (number <= 1) {
			return number;
		}
		return pibonachi(number - 1) + pibonachi(number - 2);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(pibonachi(i) + " ");
		}
	}

}
