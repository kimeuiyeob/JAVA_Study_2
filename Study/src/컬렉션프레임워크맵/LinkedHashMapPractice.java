package �÷��������ӿ�ũ��;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	
	public static void main(String[] args) {
		
		//LinkedHashMap 
		/*
		 * HashMap�� ����� �� �����ϴ�, ������ �Է¼����� ��¼����� ���� �ʴٴ°� �˼��ִ�. �׷����� LinkedHashMap Linked
		 * ���� ���� ���μ��� ������־ ����Ҷ��� �Է¼������ ����̵ȴ�.
		 * 
		 * LinkedHashSet�̶� �Ȱ��� �����̴�. HashSet �ߺ��� ������������ �Է���¼����� �ٸ���, ������ Linked�� �Է� ��¼���
		 * ����. ���� �����̶� �Ȱ��ٰ� �����ϸ�ȴ�.
		 */
		
		Map<Integer,String> LinkedHM = new LinkedHashMap<>();
		LinkedHM.put(3, "������");
		LinkedHM.put(2, "�����ٶ�");
		LinkedHM.put(1, "�����ٰ���");
		LinkedHM.put(4, "�����ٹٻ��");
		System.out.println(LinkedHM); //put������� ��µȴ�.
	
	}

}
