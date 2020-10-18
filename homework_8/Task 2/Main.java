import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите ціле число");

		if (scanner.hasNextInt()) {
			if (scanner.nextInt() % 2 == 0) {
				System.out.println("Число є парним);
			} else
				System.out.println("Число є непарним");
		} else {
			System.out.println("Необхідно ввести ціле число");
		}
	}
}
