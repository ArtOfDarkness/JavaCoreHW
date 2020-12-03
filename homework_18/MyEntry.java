public class MyEntry<K, V> {
	private K k;
	private V v;

	public MyEntry(K k, V v) {
		this.k = k;
		this.v = v;
	}

	public K getObject1() {
		return k;
	}

	public void setObject1(K k) {
		this.k = k;
	}

	public V getObject2() {
		return v;
	}

	public void setObject2(V v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "MyEntry [k=" + k + ", v=" + v + "]";
	}

}
