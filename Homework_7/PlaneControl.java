public class PlaneControl {

	public void moveUp() {
		System.out.println("Літак пролетів вверх " + Move.move() + " км");
	}

	public void moveDown() {
		System.out.println("Літак пролетів вниз " + Move.move() + " км");
	}

	public void moveLeft() {
		System.out.println("Літак пролетів вліво " + Move.move() + " км");
	}

	public void moveRight() {
		System.out.println("Літак пролетів вправо " + Move.move() + " км");
	}
}
