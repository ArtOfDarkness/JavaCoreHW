import java.io.Serializable;
import java.util.Scanner;

public enum Days implements Serializable {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	int serialNumber;

	Days(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String toLiteral(boolean fullType) {
		String dayToLiteralFull;
		String dayToLiteralShort;

		switch (Days.this) {
		case MONDAY:
			dayToLiteralFull = "Понеділок";
			dayToLiteralShort = "Пн.";
			break;
		case TUESDAY:
			dayToLiteralFull = "Вівторок";
			dayToLiteralShort = "Вт.";
			break;
		case WEDNESDAY:
			dayToLiteralFull = "Середу";
			dayToLiteralShort = "Ср.";
			break;
		case THURSDAY:
			dayToLiteralFull = "Четверг";
			dayToLiteralShort = "Чт.";
			break;
		case FRIDAY:
			dayToLiteralFull = "П'ятницю";
			dayToLiteralShort = "Пт.";
			break;
		case SATURDAY:
			dayToLiteralFull = "Суботу";
			dayToLiteralShort = "Сб.";
			break;
		case SUNDAY:
			dayToLiteralFull = "Неділю";
			dayToLiteralShort = "Нд.";
			break;
		default:
			dayToLiteralFull = dayToLiteralShort = "";
			break;
		}
		
		if (fullType)
			return dayToLiteralFull;
		else
			return dayToLiteralShort;
	}

	public static Days inputDay() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer returnedNumber = 0;
		Days foundDay = null;

		System.out.print("Введіть номер дня неделі: ");
		if (scanner.hasNextInt()) {
			int nextInt = scanner.nextInt();

			if (nextInt > 0 && nextInt <= Days.values().length) {
				returnedNumber = nextInt;
			} else
				System.err.println("Номер дня неделі повинен бути в діапазоні від 1 до 7!\n");
		} else
			System.err.println("Номер дня неделі введений некорректно!\n");

		for (Days day : Days.values()) {
			if (day.getSerialNumber() == returnedNumber) {
				foundDay = day;
			}
		}

		return foundDay;
	}
}
