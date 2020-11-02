import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введіть слово з 5 букв:");

		String word = scanner.next();

		if (word.length() == 5) {
			String wordArray [] = word.split("");
			
			if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
				System.out.println("Введене слово " + word + " - паліндром!");
			} else {
				System.out.println("Введене слово" + word + " - не є паліндромом!");
			}
		} else {
			System.out.println("Необхідно ввести слово з 5 букв");
		}
	}
}
