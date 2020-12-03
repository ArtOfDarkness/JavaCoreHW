import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		Supplier<Integer> menu = () -> {
			System.out.println();
			System.out.println("Введіть 1, щоб добавити фракцію в Верховну Раду");
			System.out.println("Введіть 2, щоб видалити фракцію із Верховної Ради");
			System.out.println("Введіть 3, щоб вивести всі фракції в Верховній Раді");
			System.out.println("Введіть 4, щоб очистити введену фракцію");
			System.out.println("Введіть 5, щоб вивести введену фракцію");
			System.out.println("Введіть 6, щоб добавити депутата в фракцію");
			System.out.println("Введіть 7, щоб видалити депутата із фракції");
			System.out.println("Введіть 8, щоб вивести список хабарників");
			System.out.println("Введіть 9, щоб вивести самого більшого хабарника");

			Scanner scanner = new Scanner(System.in);
			int menuChoise = scanner.nextInt();
			
			return menuChoise;
		};

		while (true) {
			switch (menu.get()) {

			case 1: {
				SupremeCouncil.getInstance().addDeputyGroup();
				break;
			}

			case 2: {
				SupremeCouncil.getInstance().removeDeputyGroup();
				break;
			}

			case 3: {
				SupremeCouncil.getInstance().getAllDeputyGroups();
				break;
			}

			case 4: {
				SupremeCouncil.getInstance().clearDeputyGroup();
				break;
			}

			case 5: {
				SupremeCouncil.getInstance().getDeputyGroup();
				break;
			}

			case 6: {
				SupremeCouncil.getInstance().addDeputyToDeputyGroup();
				break;
			}

			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromDeputyGroup();
				break;
			}

			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromDeputyGroup();
				break;
			}

			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromDeputyGroup();
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
