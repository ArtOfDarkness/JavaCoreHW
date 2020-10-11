public class Mainani {

	public static void main(String[] args) {
	
		Animal animal = new Animal ("Леопард", 20, 7);
		
		animal.viewAnimalInfo(animal.getName(), animal.getSpeed(), animal.getAge());
		
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		
		animal.viewAnimalInfo(animal.getName(), animal.getSpeed(), animal.getAge());

	}

}
