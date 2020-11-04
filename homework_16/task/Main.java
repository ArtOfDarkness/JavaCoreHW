import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class commodity = Commodity.class;

		System.out.println("Ім'я классу: " + commodity.getName());
		System.out.println("Просте ім'я классу: " + commodity.getSimpleName());
		System.out.println("Модифікатор доступу классу: " + Modifier.toString(commodity.getModifiers()));
		System.out.println("Пакет поточного классу: " + commodity.getPackage());
		System.out.println("Батьківський класс: " + commodity.getSuperclass());
		System.out.println();

		System.out.println("Класс " + commodity.getSimpleName() + " володіє наступним набором полів: ");
		Field[] commodityFields = commodity.getDeclaredFields();
		for (Field field : commodityFields) {
			System.out.println("Поле " + field);
		}
		System.out
				.println("Загальне число всіх полів классу " + commodity.getSimpleName() + " - " + commodityFields.length);
		System.out.println();

		System.out.println("Класс " + commodity.getSimpleName() + " володіє наступним набором public полів: ");
		Field[] commodityPublicFields = commodity.getFields();
		for (Field field : commodityPublicFields) {
			System.out.println("Поле " + field);
		}
		System.out.println("Загальне число public полів класса " + commodity.getSimpleName() + " - " + commodityPublicFields.length);
		System.out.println();

		System.out.println("Класс " + commodity.getSimpleName() + " володіє наступним набором конструкторів: ");
		Constructor[] commodityConstructors = commodity.getConstructors();
		for (Constructor constructor : commodityConstructors) {
			System.out.println("Конструктор " + constructor);
		}
		System.out.println("Загальне число конструкторів класса " + commodity.getSimpleName() + " - " + commodityConstructors.length);
		System.out.println();

		System.out.println("Класс " + commodity.getSimpleName() + " володіє наступним набором методів: ");
		Method[] commodityMethods = commodity.getMethods();
		for (Method method : commodityMethods) {
			System.out.println("Метод " + method);
		}
		System.out.println("Загальне число методів класса " + commodity.getSimpleName() + " - " + commodityMethods.length);
		System.out.println();

		System.out.println("Добавим новий товар, використовуючи рефлексію:");
		Constructor<Commodity> constructor = commodity.getConstructor(String.class, int.class, int.class);
		Commodity newInstance = constructor.newInstance("Коробка", 25, 50);
		System.out.println(newInstance);
		System.out.println();

		System.out.println("Зміним назву товару, використовуючи рефлексію:");
		Field fieldName = commodity.getField("name");
		fieldName.set(newInstance, "Велика коробка");
		System.out.println(newInstance);
		System.out.println();

		System.out.println("Добавим вагу товару, використовуючи рефлексію:");
		Method commodityMethod = commodity.getMethod("setWeight", int.class);
		commodityMethod.invoke(newInstance, 49);
		System.out.println(newInstance);
		System.out.println();

		System.out.println("Виведем назву товара на консоль, використовуючи рефлексію:");
		commodityMethod = commodity.getMethod("getName", null);
		System.out.println("Назва вибраного товару - " + commodityMethod.invoke(newInstance, null));
		System.out.println();

		System.out.println("Помістим товар на вказану полку, використовуючи рефлексію:");
		commodityMethod = commodity.getMethod("putOnShelf", int.class);
		commodityMethod.invoke(newInstance, 23);
		System.out.println();

		System.out.println("Передамо товар вказаній людині на зберігання, використовуючи рефлексію:");
		commodityMethod = commodity.getMethod("giveForSafekeeping", String.class);
		commodityMethod.invoke(newInstance, "Громов А.А.");
	}

}
