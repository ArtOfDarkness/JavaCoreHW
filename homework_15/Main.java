import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1 щоб зареєструвати нового учасника зооклуба");
		System.out.println("Введіть 2 щоб добавити тварину учаснику зооклуба");
		System.out.println("Введіть 3 щоб видалити тварину в участника зооклуба");
		System.out.println("Введіть 4 щоб видалити участника із зооклуба");
		System.out.println("Введіть 5 щоб видалити введену тварину у всіх участників зооклуба");
		System.out.println("Введіть 6 щоб вивести зооклуб на екран");
		System.out.println("Введіть 0 щоб вийти з программи);
	}
	
	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				zooClub.addZooClubMember();
				break;
			}

			case 2: {
				zooClub.addAnimal();
				break;
			}

			case 3: {
				zooClub.removeAnimal();
				break;
			}

			case 4: {
				zooClub.removeZooClubMember();
				break;
			}

			case 5: {
				zooClub.removeAnimalFromAllMembers();
				break;
			}

			case 6: {
				zooClub.viewZooClub();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введіть число від 0 до 6!");
				break;
			}
			}
		}		

	}

}
