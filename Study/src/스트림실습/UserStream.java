package ��Ʈ���ǽ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserStream {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		userList.add(new User("������", "�౸:��:�߱�", "�������� ���ƿ�"));
		userList.add(new User("������", "����:�籸:�౸", "�����ϴµ� �ٱ� �Ⱦ�"));
		userList.add(new User("�Ӹ��", "�ǾƳ�", "�Ҹ��� ���ƿ� �������Ƴʹ�����"));
		userList.add(new User("�Ҹ���", "��������:����", "�����ϴ� �Ҹ��� ����"));
		userList.add(new User("������", "����:�߱�", "��� ���ƿ�"));
		userList.add(new User("������", "����:�౸:��", "���ߵ� ���� ��� ����"));

		// �౸�� �����ϴ� ����� �������
//		Stream<User> streamUser = userList.stream();
//		long howManyPeopleLikeSoccer = streamUser.filter(i -> i.getHobby().contains("�౸")).count();
//		System.out.println(howManyPeopleLikeSoccer);

		// ���� ���� ���� ����� ��̰� ����
//		Stream<User> StreamUser1 = userList.stream();
//		StreamUser1.filter(i -> i.getName().charAt(0) == '��').forEach(i -> System.out.println(i.getHobby()));

		// ���� ���� �����͸� ��ȸ�Ͽ� �Ұ� ���뿡 ���Ƹ� ���� ����� ��������
//		Stream<User> StreamUser2 = userList.stream();
//		StreamUser2.filter(i -> i.getIntroduce().contains("����")).forEach(i -> System.out.println(i.getName()));

	}

}
