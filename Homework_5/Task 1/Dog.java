public class Dog extends Pet {

	public Dog(String name) {
	   super(name);
	}

	
@Override
void voice() {
	System.out.println("Я - Пес " + super.getName() + ",Гаууу-Гаууу");
}

}
