import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введіть текст");

		String text = scanner.nextLine();
		String textArray[] = text.split("[.!?]");

		System.out.println("Кількість слів в тексті - " + countWords(text));
		System.out.println("Кількість речень в тексті - " + countSentences(text));
		viewMostUsedWord(textArray[0]);
		viewMostUsedWord(text);
	}

	
	static int countWords(String text) {

		String textArray[] = text.split(" ");
		int counter = 0;

		for (int i = 0; i < textArray.length; i++) {

			if (textArray[i].length() > 1) {
				counter++;
			}
		}

		return counter;
	}

	
	static int countSentences(String text) {

		String textArray[] = text.split("[.!?]");
		int counter = 0;

		for (int i = 0; i < textArray.length; i++) {

			if (textArray[i].trim().length() > 1) {
				counter++;
			}
		}

		return counter;
	}

	
	static void viewMostUsedWord(String text) {

		String newText = deleteNonLiteralSymbols(text);
		String textArray[] = newText.toLowerCase().split(" ");

		int indexArray[] = { 0, -1 };
		int counter = 0;

		for (int i = 0; i < textArray.length; i++) {


			if (indexArray[1] < 0) {
				counter = 1;
			}

			else if (!textArray[indexArray[0]].equals(textArray[i])) {
				counter = 1;
			}

			else {
				continue;
			}

			for (int j = i + 1; j < textArray.length; j++) {

				if (textArray[i].equals(textArray[j])) {
					counter++;
				}
			}

			if (indexArray[1] <= counter) {
				indexArray[0] = i;
				indexArray[1] = counter;

			}

		}

		System.out.println(
				"Саме повторне слово: " + textArray[indexArray[0]] + " (зустрічається " + indexArray[1] + " раз)");
	}

	
	static String deleteNonLiteralSymbols(String text) {

		String newText = text.replaceAll("[.,:;!?@#$%^*(){}«»]", "");
		return newText;
	}
}
