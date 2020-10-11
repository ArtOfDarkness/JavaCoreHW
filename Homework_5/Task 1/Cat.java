public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}
	

@Override
void voice() {
	System.out.println("Я кіт" + super.getName() + ", Мяууу-Мяууу");
}

}
