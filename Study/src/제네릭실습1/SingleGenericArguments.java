package ���׸��ǽ�1;

class keyValue<K, V> {
	private K k;
	private V v;

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class SingleGenericArguments {
	public static void main(String[] args) {

		keyValue<String, Integer> kv1 = new keyValue<>();
		kv1.setK("���");
		kv1.setV(1000);

		String key1 = kv1.getK();
		int val1 = kv1.getV();

		System.out.println(key1 + " , " + val1);

//		==========================================

		keyValue<Integer, String> kv2 = new keyValue<>();
		kv2.setK(1000);
		kv2.setV("���");

		int key2 = kv2.getK();
		String val2 = kv2.getV();
		System.out.println(key2 + " , " + val2);

//		==========================================
		// void�� �������� �ʴ´�.
		keyValue<Integer, Void> kv3 = new keyValue<>();
		kv3.setK(3); // Ű���� ���
		kv3.getV();

	}
}
