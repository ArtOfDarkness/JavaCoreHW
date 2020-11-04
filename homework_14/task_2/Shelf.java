import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Shelf {

	ArrayList<Commodity> shelf = new ArrayList<Commodity>();

	public void addCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву товара:");
		String name = scanner.next();
		System.out.println("Введіть довжину товара, см:");
		int length = scanner.nextInt();
		System.out.println("Введіть ширину товара, см:");
		int width = scanner.nextInt();
		System.out.println("Введіть вагу товара, г:");
		int weight = scanner.nextInt();

		Commodity commodity = new Commodity(name, length, width, weight);

		shelf.add(commodity);
		System.out.println("Товар " + commodity.toString() + " успішно добавлений на полку!");
	}

	public void removeCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву товара:");
		String name = scanner.next();
		System.out.println("Введіть довжину товара, см:");
		int length = scanner.nextInt();
		System.out.println("Введіть ширину товара, см:");
		int width = scanner.nextInt();
		System.out.println("Введіть вагу товара, г:");
		int weight = scanner.nextInt();

		boolean typeCorrect = isCommodityExists(shelf, name, length, width, weight);

		if (typeCorrect) {

			Iterator<Commodity> iterator = shelf.iterator();

			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();

				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLength() == length
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println("Товар " + nextCommodity.toString() + " успешно видалений з полки!");
				}
			}

		} else {
			System.out.println("Введенного товара немає на полці!");
		}
	}

	public void replaceCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву товара:");
		String name = scanner.next();
		System.out.println("Введіть довжину товара, см:");
		int length = scanner.nextInt();
		System.out.println("Введіть ширину товара, см:");
		int width = scanner.nextInt();
		System.out.println("Введіть вагу товара, г:");
		int weight = scanner.nextInt();

		boolean typeCorrect = isCommodityExists(shelf, name, length, width, weight);

		if (typeCorrect) {
			for (Commodity commodity : shelf) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("Введіть нову назву товара:");
					String newName = scanner.next();
					System.out.println("Введіть нову довжину товара, см:");
					int newLength = scanner.nextInt();
					System.out.println("Введіть нову ширину товара, см:");
					int newWidth = scanner.nextInt();
					System.out.println("Введіть нову вагу товара, г:");
					int newWeight = scanner.nextInt();
					commodity.setName(newName);
					commodity.setLength(newLength);
					commodity.setWidth(newWidth);
					commodity.setWeight(newWeight);
					System.out.println("Введенний товар успішно замінений на " + commodity.toString() + "!");
				}
			}
		} else {
			System.out.println("Введенного товара немає на полці!");
		}
	}

	public void sortByName() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityNameComparator());
		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByLength() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityLengthComparator());
		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWidth() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityWidthComparator());
		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWeight() {
		System.out.println("До сортування товари розташовувалися на полиці в такому порядку:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityWeightComparator());
		System.out.println("Після сортування порядок розташування товарів на полиці буде наступним:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void getCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть порядковий номер товару на полиці:");
		int i = scanner.nextInt();
		
		if (i < 0 || i > (shelf.size() - 1)) {
			System.out.println("Товара з таким порядковим номером нема на полці!");
		} else {
			System.out.println("Під порядковим номером " + i + " на полці знаходиться " + shelf.get(i).toString());
		}
	}
	
	static boolean isCommodityExists(ArrayList<Commodity> shelf, String name, int length, int width, int weight) {
		boolean flag = false;

		for (Commodity commodity : shelf) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
					&& commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}

		return flag;
	}
}
