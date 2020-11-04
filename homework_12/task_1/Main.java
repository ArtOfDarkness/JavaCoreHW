import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, щоб перевірити чи існує такий місяць);
				System.out.println("Введіть 2  щоб вивести всі місяці з такою ж порою року");
		System.out.println("Введіть 3, щоб вивести всі місяці з такою ж кількістю днів");
		System.out.println("Введіть 4, щоб вивести всі місяці з меншою кількістю днів");
		System.out.println("Введіть 5, щоб вивести всі місяці з великою кількістю днів");
		System.out.println("Введіть 6, щоб вивести наступну пору року");
		System.out.println("Введіть 7, щоб вивести минулу пору року");
		System.out.println("Введіть 8, щоб вивести всі місяці з парною кількістю днів");
		System.out.println("Введіть 9, щоб вивести всі місяці з непарною кількістю днів");
		System.out.println("Введіть 0, щоб перевірити чи парна кількість днів в введеному місяці");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Months> arrayListMonths = new ArrayList<Months>();
		for (Months monthValue : Months.values()) {
			arrayListMonths.add(monthValue);
		}

		ArrayList<Seasons> arrayListSeasons = new ArrayList<Seasons>();
		for (Seasons seasonValue : Seasons.values()) {
			arrayListSeasons.add(seasonValue);
		}

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				System.out.println("Програма перевірки існування введеного місяця");
				System.out.println("Введіть місяць:");
				String month1 = scanner.next();

				boolean flag = isMonthExists(arrayListMonths, month1);

				if (flag == true) {
					System.out.println("Введений місяць існує");
				} else
					System.out.println("Такого місяця немає");

				break;
			}

			case 2: {
				System.out.println("Програма виведення всіх місяців з введеної порою року");
				System.out.println("Введіть пору року");
				String season2 = scanner.next();

				boolean flag = false;

				for (Months months : arrayListMonths) {
					if (months.getSeason().name().equalsIgnoreCase(season2)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Пора року " + season2 + " в наступних місяцях");

					for (Months months2 : arrayListMonths) {
						if (months2.getSeason().toString().equalsIgnoreCase(season2)) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false)
					System.out.println("Таких місяців немає");

				break;
			}

			case 3: {
				System.out.println("Програма виведення всіх місяців з введенням кількістю днів");
				System.out.println("Введіть кількість днів:");
				int numberOfDays3 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayListMonths) {
					if (months.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Кількість днів " + numberOfDays3 + " в наступних місяцях:");

					for (Months months2 : arrayListMonths) {
						if (months2.getNumberOfDays() == numberOfDays3) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false)
					System.out.println("Таких месяців немає");

				break;
			}

			case 4: {
				System.out.println("Програма виведення всіх місяців з кількістю днів менше введеного");
				System.out.println("Введите кількість днів:");
				int numberOfDays4 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayListMonths) {
					if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Кількість днів менше " + numberOfDays4 + " в наступних місяцях":");

					for (Months months2 : arrayListMonths) {
						if (months2.getNumberOfDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false)
					System.out.println("Таких місяців немає");

				break;
			}

			case 5: {
				System.out.println("Програма виведення всіх місяців з кількістю днів більше введеного");
				System.out.println("Введіть кількість днів:");
				int numberOfDays5 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayListMonths) {
					if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Кількість днів більше " + numberOfDays5 + " в наступних місяцях:");

					for (Months months2 : arrayListMonths) {
						if (months2.getNumberOfDays() > numberOfDays5) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false)
					System.out.println("Таких місяців немає");

				break;
			}

			case 6: {
				System.out.println("Програма виведення наступної пори року");
				System.out.println("Введіть пору року:");
				String season6 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arrayListSeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Наступна пора року:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == (arrayListSeasons.size() - 1)) {
						i = 0;
						System.out.println(arrayListSeasons.get(i));
					} else {
						System.out.println(arrayListSeasons.get(i + 1));
					}
				}

				if (flag == false)
					System.out.println("Такої пори року немає");

				break;
			}

			case 7: {
				System.out.println("Програма виведення попередньої пори року");
				System.out.println("Введіть пору року:");
				String season7 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arrayListSeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Минула пора року:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == 0) {
						i = (arrayListSeasons.size() - 1);
						System.out.println(arrayListSeasons.get(i));
					} else {
						System.out.println(arrayListSeasons.get(i - 1));
					}
				}

				if (flag == false)
					System.out.println("Такої пори року немає");

				break;
			}

			case 8: {
				System.out.println("Програма виведення місяців з парною кількістю днів");

				for (Months months : arrayListMonths) {
					if (months.getNumberOfDays() % 2 == 0) {
						System.out.println(months);
					}
				}

				break;
			}

			case 9: {
				System.out.println("Програма виведення місяців з непарною кількістю днів");

				for (Months months : arrayListMonths) {
					if (months.getNumberOfDays() % 2 != 0) {
						System.out.println(months);
					}
				}

				break;
			}

			case 0: {
				System.out.println("Програма перевірки парності кількості днів у введеному місяці");
				System.out.println("Введіть місяць:");
				String month0 = scanner.next();

				boolean flag = isMonthExists(arrayListMonths, month0);

				if (flag == true) {
					Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));

					if (month.getNumberOfDays() % 2 == 0) {
						System.out.println("Кількість днів в місяці " + month0 + " - " + month.getNumberOfDays()
								+ ". Це число - парне");
					} else {
						System.out.println("Кількість днів в місяці " + month0 + " - " + month.getNumberOfDays()
								+ ". Це число - непарне");
					}
				}

				if (flag == false)
					System.out.println("Такого місяця немає");

				break;
			}

			default: {
				System.out.println("Введіть число від 0 до 9");

				break;
			}

			}
		}
	}

	static boolean isMonthExists(ArrayList <Months> arrayListMonths, String month) {
		boolean flag = false;

		for (Months months : arrayListMonths) {
			if (months.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}

		return flag;
	}

	static String firstUpperCase(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		} else {
			return string.substring(0, 1).toUpperCase() + string.substring(1);
		}
	}

}
