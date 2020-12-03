public class Main {

	public static void main(String[] args) {
		Viewable numberValue = message -> System.out.println(message);

		numberValue.view("float min = " + Float.MIN_VALUE);
		numberValue.view("float max = " + Float.MAX_VALUE);
		numberValue.view("double min = " + Double.MIN_VALUE);
		numberValue.view("double max = " + Double.MAX_VALUE);
	}

}
