package �˰���_���;

public class �ϳ���Ÿ�� {

	public static void hanoi(int number, int start, int end) {
		hanoiTower(number, start, end, 2);
	}

	public static void hanoiTower(int number, int start, int end, int other) {
		if (number == 1) {
			System.out.println(number + "������ " + start + "�� ��տ��� " + end + "�� ������� �̵�");
		} else {
			hanoiTower(number - 1, start, other, end);
			System.out.println(number + "������ " + start + "�� ��տ��� " + end + "�� ������� �̵�");
			hanoiTower(number - 1, other, end, start);
		}
	}

	public static void main(String[] args) {
		hanoi(3, 1, 3);
	}

}
