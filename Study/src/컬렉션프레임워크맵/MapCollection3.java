package �÷��������ӿ�ũ��;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection3 {
	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(2, "���ٶ�");
		map1.put(4, "�󸶹�");
		map1.put(1, "������");
		map1.put(3, "�ٶ�");
		map1.put(5, "�ٻ��");

		// map�� ����ϰ� �Ǹ� Ű�� ������� ��µȴ�.
		System.out.println(map1);

		// Map.entry�� ����Ͽ� -> entry�� Ű�� ����� �����Ѵ�.
		// map1.entrySet()�� ����ϰ� �Ǹ� Ű�� ������� ����.
		// �׷� Ű�� ������� ��µȴ�. �ᱹ �׳� ����ϴ� ���� �����ϴ�.
		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
		System.out.println(entrySet);

		// Ű�� �̾ƿ���������� keySet�� ����Ѵ�.
		Set<Integer> setKey = map1.keySet();
		System.out.println(setKey);

		// ������� �̾ƿ���������� values�� ����Ѵ�.
		Collection<String> setVal = map1.values();
		System.out.println(setVal);
	}

}
