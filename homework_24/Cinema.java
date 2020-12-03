import java.io.Serializable;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Cinema implements Serializable {

	private static final long serialVersionUID = -2991843421434092287L;
	private String name;
	private TimeTable cinemaTimeTable;
	private TreeSet<Hall> cinemaHalls;

	public Cinema(String name) {
		this.name = name;
		this.cinemaTimeTable = new TimeTable();
		this.cinemaHalls = new TreeSet<Hall>();
	}

	public String getName() {
		return name;
	}

	public static Cinema inputCinema() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введіть назву кінотеатра: ");
		String name = scanner.nextLine();
		if (name.equals("")) {
			System.err.println("Назву кінотеатра введено некорректно!");
			name = "-= Планета Кіно IMAX =-";
		}
		System.out.println("Кінотеатр \"" + name.toString() + "\" успішно створений!\n");
		return new Cinema(name);
	}

	public void addHallToCinema() {
		Hall cinemaHall = Hall.inputHall();
		cinemaHalls.add(cinemaHall);
		System.out.println("Кінозал \"" + cinemaHall.getName() + "\" успішно добавлений в кінотеатр \"" + name + "\"!\n");
	}

	public Optional<Hall> getHallFromSet(Hall cinemaHall) {
		Optional<Hall> hallFound = cinemaHalls.stream().filter(entry -> entry.getName().equals(cinemaHall.getName()))
				.findFirst();

		return hallFound;
	}

	public boolean removeHallFromCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			cinemaHalls.remove(hallFound.get());
			System.out.println(
					"Кінозал \"" + hallFound.get().getName() + "\" успішно видалений із кінотеатра \"" + name + "\"!\n");
			return true;
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатре \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addTimeTableToCinema() throws IllegalTimeFormatException {
		boolean isDone = cinemaTimeTable.addTimeTableEntry();
		if (isDone) {
			System.out.println("Графік роботи кінотеатра \"" + name + "\" успішно змінений!\n");
			return true;
		} else {
			System.err.println("Внести зміни в графік роботи кінотеатра \"" + name + "\" не вдалось!\n");
			return false;
		}
	}

	public boolean removeTimeTableFromCinema() {
		boolean isDone = cinemaTimeTable.removeTimeTableEntry();
		if (isDone) {
			System.out.println("Графік роботи кінотеатра \"" + name + "\" успішно змінений!\n");
			return true;
		} else {
			System.err.println("Внести зміни в графік роботи кінотеатра \"" + name + "\" не вдалось!\n");
			return false;
		}
	}

	public boolean addTimeTableToHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().addTimeTableToHall();

			if (isDone) {
				System.out.println("Графік роботи для \"" + hallFound.get() + "\" успішно добавлений в кінотеатр \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Внести зміни в графік роботи кінотеатра \"" + name + "\" не вдалось!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeTimeTableFromHallInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().removeTimeTableFromHall();

			if (isDone) {
				System.out.println("Графік роботи для \"" + hallFound.get() + "\" успішно видалений із кінотеатра \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Внести зміни в графік роботи кінотеатра \"" + name + "\" не вдалось!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addScheduleToHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().addScheduleToHall();

			if (isDone) {
				System.out.println("Розклад сеансів для \"" + hallFound.get() + "\" успішно добавлений в кінотеатр \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Внести зміни в розклад сеансів для \"" + hallFound.get() + "\" кінотеатра \""
						+ name + "\" не вдалось!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeScheduleFromHallInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().removeScheduleFromHall();

			if (isDone) {
				System.out.println("Розклад сеансів для \"" + hallFound.get() + "\" успішно видалений із кінотеатра \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Внести зміни в розклад сеансів для \"" + hallFound.get() + "\" кінотеатра \""
						+ name + "\" не вдалось!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатре \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addSeanceToScheduleInHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			Days day = Days.inputDay();
			if (day == null)
				return false;

			Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
					.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

			if (hallScheduleEntryFound.isPresent()) {
				Movie movie = Movie.inputMovie();
				boolean isDone = hallScheduleEntryFound.get().getValue().addSeance(movie);

				if (isDone)
					return true;
				else
					return false;
			} else {
				System.err.println(day.toLiteral(true) + " відсутній в розкладі сеансів для \"" + hallFound.get()
						+ "\" кінотеатра \"" + name + "\"!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатре \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeSeanceFromScheduleInHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			Days day = Days.inputDay();
			if (day == null)
				return false;

			Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
					.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

			if (hallScheduleEntryFound.isPresent()) {
				Movie movie = Movie.inputMovie();
				Seance removingSeance = Seance.inputSeance(movie);
				boolean isDone = hallScheduleEntryFound.get().getValue().removeSeance(removingSeance);

				if (isDone)
					return true;
				else
					return false;
			} else {
				System.err.println(day.toLiteral(true) + " відсутній в розкладі сеансів для \"" + hallFound.get()
						+ "\" кінотеатра \"" + name + "\"!\n");
				return false;
			}
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній у кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	public void addMovieToSeanceInScheduleInHallInCinema() throws IllegalTimeFormatException {
		Movie movie = Movie.inputMovie();

		boolean addOneMoreSeance;

		do {
			Hall cinemaHall = Hall.inputHall();

			Optional<Hall> hallFound = getHallFromSet(cinemaHall);

			if (hallFound.isPresent()) {
				Days day = Days.inputDay();
				if (day == null)
					return;

				Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
						.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

				if (hallScheduleEntryFound.isPresent()) {
					hallScheduleEntryFound.get().getValue().addSeance(movie);
				} else {
					System.err.println(day.toLiteral(true) + " відсутній в розкладі сеансів для \""
							+ hallFound.get() + "\" кінотеатра \"" + name + "\"!\n");
				}
			} else {
				System.err
						.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній у кінотеатрі \"" + name + "\"!\n");
			}

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			System.out.print("Добавити ще один сеанс? (true/false) ");
			addOneMoreSeance = scanner.nextBoolean();

			if (!addOneMoreSeance) {
				System.out.println("Ви відмовились від подальшого добавлення сеансів для даного фільма!\n");
			}

		} while (addOneMoreSeance);
	}

	public void removeMovieFromSeanceInScheduleInAllHallsInCinema() throws IllegalTimeFormatException {
		Movie movie = Movie.inputMovie();
		boolean isDone = false;

		for (Hall hall : cinemaHalls) {
			for (Days day : Days.values()) {
				Optional<Seance> seance = hall.getHallSchedule().entrySet().stream()
						.filter(entry -> entry.getKey().equals(day)).findFirst().get().getValue()
						.getMovieSeanceFromSet(movie);

				if (seance.isPresent()) {
					hall.getHallSchedule().entrySet().stream().filter(entry -> entry.getKey().equals(day)).findFirst()
							.get().getValue().removeSeance(seance.get());
					isDone = true;
				} else
					break;
			}
		}

		if (isDone) {
			System.out.println(movie.toString() + " успішно видалений із розкладу сеансів всіх залів кінотеатра!\n");
		} else {
			System.err.println("Видалити " + movie.toString()
					+ " із розкладу сеансів всіх залів кінотеатра не вдалось, тому що такого фільма немає в " + "розкладі кінтоеатра!\n");
		}
	}

	public void viewCinemaTimeTable() {
		System.out.print("Кінотеатр \"" + name + "\"\n");
		cinemaTimeTable.viewTimeTable();
		System.out.println();
	}

	public void viewCinemaHalls() {
		System.out.println("Список кінозалів кінотеатра \"" + name + "\":");
		cinemaHalls.forEach(System.out::println);
		System.out.println();
	}

	public boolean viewHallTimeTableInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			hallFound.get().viewHallTimeTable();
			return true;
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean viewHallScheduleInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			hallFound.get().viewHallSchedule();
			return true;
		} else {
			System.err.println("Кінозал \"" + cinemaHall.getName() + "\" відсутній в кінотеатрі \"" + name + "\"!\n");
			return false;
		}
	}

	@Override
	public String toString() {
		if (name == "-= Планета кіно IMAX =-") {
			return (String) name;
		} else
			return "Кінотеатр \"" + name + "\"";
	}
}
