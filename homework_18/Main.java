import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		MyMap<Integer, List<Integers>> newMap = new MyMap<>(100, new ArrayList<Integers>(Arrays.asList(new Integers("2"))));
		
		newMap.addNewEntry(200, new ArrayList<Integers>(Arrays.asList(new Integers("3"))));
		newMap.addNewEntry(300, new ArrayList<Integers>(Arrays.asList(new Integers("4"))));
		newMap.viewMap();
		newMap.removeEntry(100);
		newMap.viewMap();
		newMap.removeValue(200);
		newMap.viewKeysSet();
		newMap.viewValuesList();
		newMap.viewMap();
		
		MyMap<String, Integer> newMap1 = new MyMap<>("2", 100);

		newMap1.addNewEntry("3", 200);
		newMap1.addNewEntry("4", 300);
		newMap1.viewMap();
		newMap1.removeEntry("2");
		newMap1.viewMap();
		newMap1.removeValue("3");
		newMap1.viewKeysSet();
		newMap1.viewValuesList();
		newMap1.viewMap();
	}

	public static class Integers {
		String integer;
		public Integers(String integer) {
			this.integer = integer;
		}
		public String getInteger() {
			return integer;
		}
		public void setInteger(String integer) {
			this.integer = integer;
		}
		@Override
		public String toString() {
			return integer;
		}
	}
}
