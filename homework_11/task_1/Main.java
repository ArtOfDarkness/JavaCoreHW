import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Integer array[] = new Integer[getRandomValueFromRange(5, 20)];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomValueFromRange(-1000, 1000);
		}

		System.out.println("Початковий масив: " + Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("Початковий масив: відсортований по зростанню: " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Початковий масив: відсортований по спаданню: " + Arrays.toString(array));

	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}
