import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int menu() {
		System.out.println("-= КІНОТЕАТР =-");
		System.out.println("11 - створити новий кінотеатр");
		System.out.println("12 - зберегти кінотеатр в файл");
		System.out.println("13 - завантажити кінотеатр із файла");
		System.out.println("-ГРАФІК РОБОТИ КІНОТЕАТРА-");
		System.out.println("21 - створити/змінити графік роботи кінотеатра на день");
		System.out.println("22 - видалити графік роботи кінотеатра на день");
		System.out.println("23 - вивести графік роботи кінотеатра на неділю");
		System.out.println("-= ЗАЛИ КІНОТЕАТРА =-");
		System.out.println("31 - створити зал в кінотеатрі");
		System.out.println("32 - видалити зал із кінотеатра");
		System.out.println("33 - вивести список залів кінотеатра");
		System.out.println("-= ГРАФІК РОБОТИ ЗАЛА КІНОТЕАТРА =-");
		System.out.println("41 - створити/змінити графік роботи зала кінотеатра на день");
		System.out.println("42 - видалити графік роботи зала кінотеатра на день");
		System.out.println("43 - вивести графік роботи зала кінотеатра на неділю");
		System.out.println("-= РОЗКЛАД СЕАНСІВ ЗАЛА КІНОТЕАТРА =-");
		System.out.println("51 - створити/змінити графік сеансів зала кінотеатра на день");
		System.out.println("52 - видалити графік сеансів зала кінотеатра на день");
		System.out.println("53 - вивести розклад сеансів зала кінотеатра на неділю");
		System.out.println("-= СЕАНСИ ЗАЛА КІНОТЕАТРА НА ДЕНЬ =-");
		System.out.println("61 - добавити сеанс в розклад сеансів зала кінотеатра на день");
		System.out.println("62 - видалити сеанс із розклада сеансів зала кінотеатра на день");
		System.out.println("-= ФІЛЬМИ =-");
		System.out.println("71 - добавити фільм і набір сеансів в розклад зала кінотеатра");
		System.out.println("72 - видалити фільм із розкладу сеансів всіх залів кінотеатра");
		System.out.println("-= ВИХІД =-");
		System.out.println("0 - вийти із программи");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Зробіть вибір: ");
		int menuChoise = scanner.nextInt();

		return menuChoise;
	}

	public static void main(String[] args)
			throws NumberFormatException, IllegalTimeFormatException, IOException, ClassNotFoundException {
		Cinema cinema = null;

		while (true) {
			switch (menu()) {

			case 11: {
				cinema = Cinema.inputCinema();
				break;
			}

			case 12: {
				SerializeMethods.serialize(cinema, new File("Cinema.obj"));
				System.out.println("Кінотеатр \"" + cinema.getName() + "\" успішно збережений в файл!\n");
				break;
			}

			case 13: {
				cinema = (Cinema) SerializeMethods.deserialize(new File("Cinema.obj"));
				System.out.println("Кінотеатр \"" + cinema.getName() + "\" успешно завантажений із файла!\n");
				break;
			}

			case 21: {
				cinema.addTimeTableToCinema();
				break;
			}

			case 22: {
				cinema.removeTimeTableFromCinema();
				break;
			}

			case 23: {
				cinema.viewCinemaTimeTable();
				break;
			}

			case 31: {
				cinema.addHallToCinema();
				break;
			}

			case 32: {
				cinema.removeHallFromCinema();
				break;
			}

			case 33: {
				cinema.viewCinemaHalls();
				break;
			}

			case 41: {
				cinema.addTimeTableToHallInCinema();
				break;
			}

			case 42: {
				cinema.removeTimeTableFromHallInCinema();
				break;
			}

			case 43: {
				cinema.viewHallTimeTableInCinema();
				break;
			}

			case 51: {
				cinema.addScheduleToHallInCinema();
				break;
			}

			case 52: {
				cinema.removeScheduleFromHallInCinema();
				break;
			}

			case 53: {
				cinema.viewHallScheduleInCinema();
				break;
			}

			case 61: {
				cinema.addSeanceToScheduleInHallInCinema();
				break;
			}

			case 62: {
				cinema.removeSeanceFromScheduleInHallInCinema();
				break;
			}
			
			case 71: {
				cinema.addMovieToSeanceInScheduleInHallInCinema();
				break;
			}

			case 72: {
				cinema.removeMovieFromSeanceInScheduleInAllHallsInCinema();
				break;
			}
			
			case 0: {
				System.out.println("Надіюсь, Вам вдалось гідно оцінити весь функціонал нашого Кінотеатру! Всього найкращого!\n");
				System.exit(0);
				break;
			}

			default: {
				System.err.println("Такого пункту меню не існує!\n");
				break;
			}
			}
		}
	}
}
