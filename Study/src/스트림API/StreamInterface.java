package ��Ʈ��API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInterface {
	public static void main(String[] args) {

		// �Ѱ��� ��������! �ѹ� ������ ��Ʈ���� ����� �ٽ� ����Ҽ� ������ ��ü �����Ϳ� ���� ó���� �̷������ ����ȴ�.
		List<String> nameList = Arrays.asList("lee", "kim", "park", "hong", "choi", "song");

		// ��Ʈ���� �÷��� ��ü���� �����Ҽ��ִ�. nameList�� List��ü�� �÷��ǰ�ü�� ������̹Ƿ�
		// .stream() �÷��ǿ� default�޼ҵ�� �ִ� �Լ��� ����Ҽ� �ִ�.
		Stream<String> strStream = nameList.stream();
		strStream.forEach(i -> System.out.print(i + " "));

		// �׷��� �Ʒ��Ͱ��� ��ü�� ���Ӱ� �������� ������ ���� �߻��Ѵ�.
		Stream<String> strStream2 = nameList.stream();
		strStream2.forEach(System.out::print);

		// stream�� ���������� �� �޼��带 �����ؼ� �� �����ؼ� ������� �����⶧����
		// �ѹ� ��Ʈ�� ��ü�� �����ؼ� �ű⼭ ���ϴ� ������� ������ ��Ʈ�� ��ü�� �ϳ��� ���� ����ϴ� ���� �幰��.

	}
}
