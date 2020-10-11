public class Main2 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle ();
		Rectangle rect2 = new Rectangle (2, 5);
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println("Площа прямокутника №1 = " + rect1.rectArea (rect1.getLength(), rect1.getWidth()));
		System.out.println("Периметр прямокутника №1 = " + rect1.rectPerimeter (rect1.getLength(), rect1.getWidth()));
		
		System.out.println("Площа прямокутника №2 = " + rect2.rectArea (rect2.getLength(), rect2.getWidth()));
		System.out.println("Периметр прямокутника №2 = " + rect2.rectPerimeter (rect2.getLength(), rect2.getWidth()));
	
		System.out.println();

		
		Circle circle1 = new Circle (2.9, 5.8);
		Circle circle2 = new Circle (3.2, 6.4);
		
		System.out.println(circle1);
		System.out.println(circle2);
		
		System.out.println("Площа кола №1 = " + circle1.circleArea(circle1.getDiameter()));
		System.out.println("Довжина кола №1 = " + circle1.circleLength(circle1.getRadius()));
		
		System.out.println("Площа кола №2 = " + circle2.circleArea(circle2.getDiameter()));
		System.out.println("Довжина кола №2 = " + circle2.circleLength(circle2.getRadius()));
		
		System.out.println();
		
		circle1.circleAreaConsole(circle1.getDiameter());
		circle1.circleLengthConsole(circle1.getRadius());
		
		circle2.circleAreaConsole(circle2.getDiameter());
		circle2.circleLengthConsole(circle2.getRadius());
	}
}