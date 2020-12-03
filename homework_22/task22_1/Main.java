public class Main {

	public static void main(String[] args) {
		Pet cow = () -> "Муууууу Я - корова";
		Pet cat = () -> "Мяууууу Я - кіт";
		Pet dog = () -> "Гав-гав-гав Я - пес";

		voice(cow.voice(), "Марта");
		voice(cat.voice(), "Мурка");
		voice(dog.voice(), "Макс");
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}

}
