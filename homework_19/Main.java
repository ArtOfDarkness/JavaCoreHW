import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File fileEmployee = new File("Employee.obj");
		Employee employee = new Employee(18, "Андрій", 7777);
		System.out.println("Наш гравець у покер:");
		System.out.println(employee);

		System.out.println("Наш робітник після сереалізації/десереалізації:");
		Methods.serialize(employee, fileEmployee);
		System.out.println(Methods.deserealize(fileEmployee));

		System.out.println();

		File fileEmployeeList = new File("EmployeeList.obj");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		employeeList.add(new Employee(55, "Валєра", 13500));
		employeeList.add(new Employee(66, "Іван", 26900));
		employeeList.add(new Employee(77, "Інокентій", 10330));
		employeeList.add(new Employee(88, "Зеник", 7770));
		employeeList.add(new Employee(99, "Альоша", 3200));

		System.out.println("Список наших працівників:");
		for (Employee eachEmployee : employeeList) {
			System.out.println(eachEmployee);
		}

		System.out.println();

		System.out.println("Список наших працівників після сереалізації/десереалізації:");
		Methods.serialize((Serializable) employeeList, fileEmployeeList);

		List<Employee> employeeListDeserialized = new ArrayList<Employee>();
		employeeListDeserialized = (List<Employee>) Methods.deserealize(fileEmployeeList);

		for (Employee eachEmployee : employeeListDeserialized) {
			System.out.println(eachEmployee);
		}

	}

}
