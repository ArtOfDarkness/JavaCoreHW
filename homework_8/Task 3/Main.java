import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Введіть перше ціле число:");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("Введите друге ціле число");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();
				System.out.println("Сума введних чисел рівна" + (a + b));
			}

			else
				System.out.println("Помилка!Необхідно ввести ціле число");
		}

		else
			System.out.println("Помилка!Необхідно ввести ціле число");

	}
}
