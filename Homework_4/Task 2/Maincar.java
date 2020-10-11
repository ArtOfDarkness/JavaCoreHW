public class Maincar {

	public static void main(String[] args) {
		SteeringWheel sw = new SteeringWheel(40.5, "резина");
		Wheel wheel = new Wheel(175, "слик");
		Body body = new Body("жовтий");
		Car car = new Car(500, 5, sw, wheel, body);
				
		System.out.println(car);
				
		car.setEnginePower(1200);
		car.setNumberOfDoors(3);
		sw.setDiameter(sw.halfSteeringWheelDiameter());
		sw.setMaterial("Алькантара");
		wheel.setWheelSize(wheel.wheelSizeEnlarge(10));
		wheel.setTyreType("протектор");
		body.setColor("білий");
				
		System.out.println(car);
	}

}
