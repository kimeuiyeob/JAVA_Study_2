package ���׸�Ŭ����_�������̽��ǹ���;

public class ���׸�Ŭ����2 {

	public static void main(String[] args) {

		// �̷��� ���׸��� ��� �ø����� �ְ� ���߿� ��ü �����Ҷ� Ÿ���� �������ټ��ִ�.
		KeyValue<String, Integer> keyVal = new KeyValue<>();
		keyVal.setKey("����Ű��"); // �׷��� Ű�� ��Ʈ������ �ްԵǰ�
		keyVal.setValue(300); // �߷��� ��Ʈ�� �޴´�.
		System.out.println(keyVal.getKey() + " " + keyVal.getValue());

	}

}

class KeyValue<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
