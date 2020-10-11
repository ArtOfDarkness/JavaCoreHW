public class Main {
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		formatter.format("Number in exponential form(double): %e", 13d);
		System.out.println(formatter.toString());
		Formatter formatter2 = new Formatter();
		formatter2.format("Number in exponential form(float): %e", 66f);
		System.out.println(formatter2.toString());
	}
}