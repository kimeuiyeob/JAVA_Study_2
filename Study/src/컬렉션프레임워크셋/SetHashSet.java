package �÷��������ӿ�ũ��;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {
	
	public static void main(String[] args) {
		
		Set<String> setPrac = new HashSet<>();
		
		setPrac.add("��");
		setPrac.add("��");
		setPrac.add("��");
		setPrac.add("��"); //�ߺ��Ǿ� �������.
		
		System.out.println(setPrac); 
		System.out.println(setPrac.size()); //�ߺ����� �Ǽ� ������ 3���̴�.
		

		for (int i = 0; i < setPrac.size(); i++) {
//			System.out.println(setPrac.get(i)); <=�̰� �ȵȴ�. �ε����� �̷���������ʱ⶧����
		}
		//�̶� ����ϴ°� iterator()�̴� => ���� ���� �ϳ��� �����Ҷ�
		//�ε����� ������ ���� �ʴ� set�� ���� �����Ҷ� ����ϴ°� Iterator ��ü�̴�.
		//Iterator��°� �ݺ��̶�� �ǹ̸� �����ִ�.
		Iterator<String> iter = setPrac.iterator();
		
		//hasNext�� ������ ����ų ���� �ִ�? ��� �޼���
		//������ true�ϱ� while�� ������ ����.
		while(iter.hasNext()) {
			System.out.println("Iterator setPrac ���� �� : " + iter.next());
		}
		
		//�׸��� forEach�����ε� ���� ���� �����ü��ִ�.
		//forEach�� ���հ�ü���� ���� kim�� ��� ����ϴ°��̴�.
		for (String kim : setPrac) {
			System.out.println("ForEach setPrac ���� �� : " + kim);
		}
		
		
	}

}
