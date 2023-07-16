package �˰���;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//�ڵ� ����ߴµ� ȿ���� �׽�Ʈ���� ��� �Ұ� -> Stack ����غ���!!
public class ¦���������ϱ� {
	public int solution(String s) {

		List<String> strList = new ArrayList<>();
		for (Character c : s.toCharArray()) {
			strList.add(c + "");
		}
		for (int i = 0; i < strList.size() - 1; i++) {
			if (strList.get(i).equals(strList.get(i + 1))) {

				strList.remove(i);
				strList.remove(i);

				i -= 2;
				if (i < -1) {
					i = -1;
				}
			}
		}
		if (strList.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

//		s	result
//		baabaa	1
//		cdcd	0

	// =====================================================
	// ȿ���� -> �������� Ǯ��
	public int solution2(String s) {
		
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {

			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		if (stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

}
