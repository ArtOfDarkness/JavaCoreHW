import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyMap<K, V> extends MyEntry<K, V> {

    private LinkedHashMap<K, V> map;

    public MyMap(K k, V v) {
        super(k, v);
        this.map = new LinkedHashMap<K, V>();
        this.map.put(k, v);
    }

    public void addNewEntry(K k, V v) {
        map.put(k, v);
    }

    public void removeEntry(K k) {
        map.remove(k);
    }

    public void removeValue(K k) {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            if (next.getKey().equals(k)) {
                next.setValue((V) "null");
            }
        }
    }

    public void viewKeysSet() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getKey().toString());
        }

        System.out.println();
    }

    public void viewValuesList() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getValue().toString());
        }

        System.out.println();
    }

    public void viewMap() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getKey().toString() + " -> " + next.getValue().toString());
        }

        System.out.println();
    }

}
