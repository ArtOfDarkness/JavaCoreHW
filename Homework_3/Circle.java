public class Circle {

	private double radius;
	private double diameter;
	

	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}


	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
	    return diameter;
	}


	public double circleArea (double diameter) {
		double area = (Math.PI * diameter * diameter) / 4;
		return area;
	}
	
	public double circleLength (double radius) {
		double length = Math.PI * radius * 2;
		return length;
	}

	public void circleAreaConsole (double diameter) {
		double area = (Math.PI * diameter * diameter) / 4;
		System.out.println("Площа кола = " + area);
	}
	
	public void circleLengthConsole (double radius) {
		double length = Math.PI * radius * 2;
		System.out.println("Довжина кола = " + length);
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}  
		
}