package �˰���_��ġ;

public class ������ã�� {
	public int solution(int[][] board) {

		// ���� ���� �������� �켱 ����
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		// ���� ��ǥ (4,7)
		int x = 0;
		int y = 0;

		// ������ ��ǥ
		int dogX = 0;
		int dogY = 0;

		int d1 = 0; // ����
		int d2 = 0; // ����

		int cnt = 0; // �� üũ

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 2) {
					x = i;
					y = j;
				}
				if (board[i][j] == 3) {
					dogX = i;
					dogY = j;
				}
			}
		}

		while (cnt < 10001) {

			cnt++;
			int nx = x + dx[d1];
			int ny = y + dy[d1];

			int dognx = dogX + dx[d2];
			int dogny = dogY + dy[d2];

			boolean flag1 = true;
			boolean flag2 = true;

			if (nx < 0 || ny < 0 || nx >= board.length || ny >= board.length || board[nx][ny] == 1) {
				d1 = (d1 + 1) % 4;
				flag1 = false;
			}

			if (dognx < 0 || dogny < 0 || dognx >= board.length || dogny >= board.length || board[dognx][dogny] == 1) {
				d2 = (d2 + 1) % 4;
				flag2 = false;
			}

			if (flag1) {
				x = nx;
				y = ny;
			}

			if (flag2) {
				dogX = dognx;
				dogY = dogny;
			}

			if (x == dogX && y == dogY) {
				break;
			}

			if (cnt == 10000) {
				return -1;
			}

		}

		return cnt;
	}

	public static void main(String[] args) {
		������ã�� T = new ������ã��();
		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 } };
		System.out.println(T.solution(arr1));
		int[][] arr2 = { { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 3 } };
		System.out.println(T.solution(arr2));
	}
}