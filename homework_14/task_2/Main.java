import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1 щоб добавити товар на полку");
		System.out.println("Введіть 2 щоб видалити товар з полки");
		System.out.println("Введіть 3 щоб замінити товар на полці");
		System.out.println("Введіть 4 щоб відсортувати товари на полці по їх назві");
		System.out.println("Введіть 5 щоб відсортувати товари на полці по їх довжині");
		System.out.println("Введіть 6 щоб відсортувати товари на полці по їх ширині");
		System.out.println("Введіть 7 щоб відсортувати товари на полці по їх вазі");
		System.out.println("Введіть 8 щоб вивести товар по його порядковому номеру розміщення на полці");
		System.out.println("Введіть 9 щоб вийти з программи");
	}

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				shelf.addCommodity();
				break;
			}

			case 2: {
				shelf.removeCommodity();
				break;
			}

			case 3: {
				shelf.replaceCommodity();
				break;
			}

			case 4: {
				shelf.sortByName();
				break;
			}

			case 5: {
				shelf.sortByLength();
				break;
			}

			case 6: {
				shelf.sortByWidth();
				break;
			}

			case 7: {
				shelf.sortByWeight();
				break;
			}

			case 8: {
				shelf.getCommodity();
				break;
			}

			case 9: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введіть число від 1 до 9!");
				break;
			}
			}
		}

	}

}
