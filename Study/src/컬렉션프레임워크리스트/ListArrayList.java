package �÷��������ӿ�ũ����Ʈ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {

		String[] strArr = { "��", "��", "��", "��", "��", "��" };
		strArr[2] = null;
		strArr[5] = null;

		System.out.println(strArr.length);
		System.out.println(Arrays.toString(strArr)); //�迭��ü�� �ѹ��� ���
		
		for (String string : strArr) {
			System.out.println(string);
		}
		
		
		//�޼��带 �̿��Ͽ� �����÷��� ���� -> �̰Ŵ� �߰� ���� �Ұ���
		List<String> strList = Arrays.asList("��", "��", "��", "��", "��", "��");
		
		//��� �÷��� ��ü(list,set��)�� �ڽ��� �����и� ��� ����ϵ���
		//toString()�޼��带 �������̵� �س��Ҵ�.
		List<String> strList1 = new ArrayList<>();

		strList1.add("��");
		strList1.add("��");
		strList1.add("��");
		strList1.add("��");
		
		System.out.println(strList1); 
		
		
		
		
	}
}
