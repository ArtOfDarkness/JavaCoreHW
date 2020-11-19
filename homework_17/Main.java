public class Main {
public static void main(String[] args) {

		Integer[] array = { 1, 24, -2, 57, 6, 23, -82, 17, 13, 72 };
		Collection collection = new Collection(array);
		System.out.println("Виводимо на екран масив від початку до кінця замінюючи непарні елементи на null:");
		Iterator iteratorForward = collection.createForwardIterator();

		while (iteratorForward.hasNext()) {
			Integer next = iteratorForward.next();
			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}
		System.out.println();
		System.out.println("Виводимо на екран масив через один елемент від кінця до початку:");
		Iterator iteratorBackward = collection.createBackwardIterator();

		while (iteratorBackward.hasNext()) {
		Integer next = iteratorBackward.next();
		System.out.println(next);
		}
		System.out.println();
		System.out.println("Виводимо на екран кожен третій непарний елемент масива від кінця до початку");
		Iterator iteratorAnonymous = collection.createAnonymousIterator();

		int i = 1;
		while (iteratorAnonymous.hasNext()) {
		Integer next = iteratorAnonymous.next();
		if (i % 3 == 0) {
			if (next % 2 != 0) {
				System.out.println(next);
				}
			}
		     i++;
		}
		System.out.println();
		System.out.println("Виводимо на екран кожен пятий парний елемент мінус 100 масива від початку до кінця:");
		Iterator iteratorLocal = collection.createLocalIterator();

		int j = 1;
		while (iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();

			if (j % 5 == 0) {
				if (next % 2 == 0) {
					System.out.println(next - 100);
				}
			}
			j++;
		}

		System.out.println();
		System.out.println("Виводимо на екран непарним кожен другий парний елемент масива від початку до кінця:");
		Iterator iteratorStatic = Collection.createStaticIterator();

		int k = 1;
		while (iteratorStatic.hasNext()) {
		Integer next = iteratorStatic.next();
		if (k % 2 == 0) {
			if (next % 2 == 0) {
				System.out.println(next + 1);
				}
			}
		k++;
		}
}
}
