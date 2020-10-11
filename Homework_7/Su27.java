
public class Su27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {

	int maxSpeed;
	String color;

	public Su27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Турбоприскорювааня запущено.Швидкість літака " + accSpeed + " км/год");
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("Запущено технологію СТЕЛС.Літак зник з радарів" + unvisibleTime + " cек");
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Активовано функцію ядерного удару.На об'єкт буде скинуто " + bombsAmount + " бомб");
	}

}
