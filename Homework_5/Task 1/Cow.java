public class Cow extends Pet {

	public Cow(String name) {
		super(name);
	}

	
@Override
void voice() {
	System.out.println("Я - корова " + super.getName() + ", Мууу-Мууу");
}

}
