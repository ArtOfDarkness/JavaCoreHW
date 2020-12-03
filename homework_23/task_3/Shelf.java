import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Shelf {

	ArrayList<Commodity> shelf = new ArrayList<Commodity>();

	Supplier<Commodity> getCommodity = () -> {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву товара:");
		String name = scanner.next();
		System.out.println("Введіть довжину товара, см:");
		int length = scanner.nextInt();
		System.out.println("Введіть ширину товара, см:");
		int width = scanner.nextInt();
		System.out.println("Введіть вагу товара, г:");
		int weight = scanner.nextInt();

		return new Commodity(name, length, width, weight);
	};

	public Optional<Commodity> findCommodity() {
		Commodity commodityTyped = getCommodity.get();

		Predicate<Commodity> isEqual = commodity -> commodity.getName().equalsIgnoreCase(commodityTyped.getName())
				&& commodity.getLength() == commodityTyped.getLength()
				&& commodity.getWidth() == commodityTyped.getWidth()
				&& commodity.getWeight() == commodityTyped.getWeight();
		Optional<Commodity> commodityFound = shelf.stream().filter(isEqual).findFirst();

		return commodityFound;
	}

	public void addCommodity() {
		Commodity commodity = getCommodity.get();

		shelf.add(commodity);
		System.out.println("Товар " + commodity.toString() + " успішно добавлений на полицю!");
	}

	public void removeCommodity() {
		Optional<Commodity> commodityFound = findCommodity();

		if (commodityFound.isPresent()) {
			shelf.remove(commodityFound.get());
			System.out.println("Товар " + commodityFound.get().toString() + " успішно видалений з полиці!");
		} else {
			System.out.println("Введеного товара немає на полці!");
		}
	}

	public void replaceCommodity() {
		Optional<Commodity> commodityFound = findCommodity();

		if (commodityFound.isPresent()) {
			System.out.println("Введіть товар для заміни:");
			Commodity newCommodityTyped = getCommodity.get();

			commodityFound.get().setName(newCommodityTyped.getName());
			commodityFound.get().setLength(newCommodityTyped.getLength());
			commodityFound.get().setWidth(newCommodityTyped.getWidth());
			commodityFound.get().setWeight(newCommodityTyped.getWeight());

			System.out.println("Введений товар успішно замінений на " + commodityFound.get().toString() + "!");
		} else {
			System.out.println("Введеного товара немає на полиці!");
		}
	}

	public void sortByName() {
		System.out.println("\n" + "До сортування товари розташовувалися на полиці в такому порядку:");
		shelf.forEach(System.out::println);

		System.out.println("\n" + "Після сортування порядок розташування товарів на полиці буде наступним:");
		shelf.stream().sorted(Comparator.comparing(Commodity::getName)).forEach(System.out::println);
	}

	public void sortByLength() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		shelf.forEach(System.out::println);

		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		shelf.stream().sorted(Comparator.comparing(Commodity::getLength)).forEach(System.out::println);
	}

	public void sortByWidth() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		shelf.forEach(System.out::println);
		
		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		shelf.stream().sorted(Comparator.comparing(Commodity::getWidth)).forEach(System.out::println);
	}

	public void sortByWeight() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		shelf.forEach(System.out::println);

		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		shelf.stream().sorted(Comparator.comparing(Commodity::getWeight)).forEach(System.out::println);
	}

	public void getCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть порядковий номер товара на полиці:");
		int i = scanner.nextInt();

		if (i < 0 || i > (shelf.size() - 1)) {
			System.out.println("Товара з таким порядковим номером немає на полиці!");
		} else {
			System.out.println("Під порядковим номером " + i + " на полиці находиться " + shelf.get(i).toString());
		}
	}
}
