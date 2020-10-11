public class Car {

	private int enginePower;
	private int numberOfDoors;
	private SteeringWheel steeringWheel;
	private Wheel wheel;
	private Body body;
	
	public Car(int enginePower, int numberOfDoors, SteeringWheel steeringWheel, Wheel wheel, Body body) {
		this.enginePower = enginePower;
		this.numberOfDoors = numberOfDoors;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.body = body;
	}
	
	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public double getDiameter() {
		return steeringWheel.getDiameter();
	}
	
	public String getMaterial() {
		return steeringWheel.getMaterial();
	}

	public double getWheelSize() {
		return wheel.getWheelSize();
	}

	public String getTyreType() {
		return wheel.getTyreType();
	}
	
	public String getColor() {
		return body.getColor();
	}

	@Override
	public String toString() {
		return "Car [enginePower=" + enginePower + ", numberOfDoors=" + numberOfDoors + ", steeringWheelDiameter=" + getDiameter() + ", steeringWheelMaterial=" + getMaterial()+ ", wheelSize=" + getWheelSize() + ", tyreType=" + getTyreType() + ", color=" + getColor() + "]";
	}
		
}
