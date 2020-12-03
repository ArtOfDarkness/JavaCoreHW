public class Main {
	
	public static void main(String[] args) {
		Printable eat = () -> System.out.println("Хочу їсти");
		Printable sleep = () -> System.out.println("Хочу спати!");
		Printable swim = () -> System.out.println("Хочу плавати!");
		Printable walk = () -> System.out.println("Хочу гуляти!");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}
