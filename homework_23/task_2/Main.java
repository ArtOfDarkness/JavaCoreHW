import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Set<ArbitrarilyClass> ac = new HashSet<ArbitrarilyClass>();
		Consumer<ArbitrarilyClass> addToHashSet = arbitrarilyClassItem -> ac.add(arbitrarilyClassItem);
		addToHashSet.accept(new ArbitrarilyClass("String1", 11));
		addToHashSet.accept(new ArbitrarilyClass("String4", 77));
		addToHashSet.accept(new ArbitrarilyClass("String3", 33));
		addToHashSet.accept(new ArbitrarilyClass("String2", 55));
		addToHashSet.accept(new ArbitrarilyClass("String5", 99));

		System.out.println("HashSet виводить елементи в випадковому порядку");
		ac.forEach(System.out::println);

		Set<ArbitrarilyClass> ac1 = new LinkedHashSet<ArbitrarilyClass>();
		Consumer<ArbitrarilyClass> addToLinkedHashSet = arbitrarilyClassItem -> ac1.add(arbitrarilyClassItem);
		addToLinkedHashSet.accept(new ArbitrarilyClass("String1", 11));
		addToLinkedHashSet.accept(new ArbitrarilyClass("String4", 77));
		addToLinkedHashSet.accept(new ArbitrarilyClass("String3", 33));
		addToLinkedHashSet.accept(new ArbitrarilyClass("String2", 55));
		addToLinkedHashSet.accept(new ArbitrarilyClass("String5", 99));

		System.out.println();
		System.out.println("LinkedHashSet виводить елементи в порядку їх добавлення");
		ac1.forEach(System.out::println);

		Set<ArbitrarilyClass> ac2 = new TreeSet<ArbitrarilyClass>();
		Consumer<ArbitrarilyClass> addToTreeSet = arbitrarilyClassItem -> ac2.add(arbitrarilyClassItem);
		addToTreeSet.accept(new ArbitrarilyClass("String1", 11));
		addToTreeSet.accept(new ArbitrarilyClass("String4", 77));
		addToTreeSet.accept(new ArbitrarilyClass("String3", 33));
		addToTreeSet.accept(new ArbitrarilyClass("String2", 55));
		addToTreeSet.accept(new ArbitrarilyClass("String5", 99));

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку перевизначенному в Comparable (по замовчуванню)");
		ac2.forEach(System.out::println);

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку перевизначенному в Comparator");
		ac2.stream().sorted(new ArbitrarilyClassIntegerComparator()).forEach(System.out::println);
	}
}
