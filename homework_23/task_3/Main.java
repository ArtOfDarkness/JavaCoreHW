import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		Supplier<Integer> menu = () -> {
			System.out.println();
			System.out.println("Введіть 1, щоб добавити товар на полку");
			System.out.println("Введіть 2, щоб видалити товар з полки");
			System.out.println("Введіть 3, щоб замінити товар на полці");
			System.out.println("Введіть 4, щоб посортовати товари на полці по їх назві");
			System.out.println("Введіть 5, щоб посортовати товари на полці по їх довжині");
			System.out.println("Введіть 6, щоб посортовати товари на полці по їх ширині");
			System.out.println("Введіть 7, щоб посортовати товари на полці по їх вазі");
			System.out.println("Введіть 8, щоб вивести товар по його порядковому номеру розміщення на полці");
			System.out.println("Введіть 9, щоб вийти з программи");

			Scanner scanner = new Scanner(System.in);
			int menuChoise = scanner.nextInt();

			return menuChoise;
		};

		Shelf shelf = new Shelf();

		while (true) {

			switch (menu.get()) {

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
