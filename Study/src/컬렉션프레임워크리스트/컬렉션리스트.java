package �÷��������ӿ�ũ����Ʈ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class �÷��Ǹ���Ʈ {
	public static void main(String[] args) {

		// ó�� ��ü������ ����Ʈ�� ����뷮�� 10�� �����.
		// ��������� Ȯ���ϰ� add�� �����͸� ������ ����뷮�� �þ��.
		// �� ����� �׸�ŭ �پ���.

		List<String> aList1 = new ArrayList<>(); // ->capacity(10) �������Ȯ��
		// �̷��� ()50�� ������ ������ ��������� 50���� �ش�. �ٵ� �˾Ƽ� �þ�� �پ��� �Ű澵�ʿ����.
		List<String> aList2 = new Vector<>(50);
		List<String> aList3 = new LinkedList<>();

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		asList.toArray(); //object�� Ÿ������ ��ȯ�Ѵ�.

		//�迭�� ũ��� ������ �ʱ⶧���̴�.
		asList.set(0, 5); // -> ������ �����ϴ�.
		System.out.println(asList);

//		asList.add(3); <-Arrays.asList �������� ���� �ʱ�ȭ�ؼ� �߰� ���� �Ұ���
//		asList.remove(1);
		List<Integer> asList1 = new ArrayList<>();
		
		asList1.add(1);
		asList1.add(2);
		asList1.add(3);
		asList1.add(4);
		asList1.add(5);
		
		asList1.add(1, 10); //set�� �ε����� ���� �ٲٴ°Ű�
		//add�� ���ε����� ���� �ְ� ������ ������ �ڷ� �и���.

		System.out.println(asList1);

	}

}
