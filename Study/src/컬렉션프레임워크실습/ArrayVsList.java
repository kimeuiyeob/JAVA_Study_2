package �÷��������ӿ�ũ�ǽ�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		String[] array = { "��", "��", "��", "��", "��" };
		array[2] = null;
		array[4] = null;
		List<String> AL = new ArrayList<>();
		for (String string : array) {
			AL.add(string);
		}
		for (int i = 0; i < AL.size(); i++) {
			if (AL.get(i) == null) {
				AL.remove(i);
			}
		}
		AL.add("��");
		AL.add("��");
		Collections.sort(AL);
		System.out.println(AL);

	}
}
