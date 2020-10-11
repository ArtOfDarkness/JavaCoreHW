public class SteeringWheel {

	private double diameter;
	private String material;
	
	public SteeringWheel(double diameter, String material) {
		this.diameter = diameter;
		this.material = material;
	}

	public double halfSteeringWheelDiameter () {
		double newDiameter = this.diameter / 2;
		return newDiameter;
	}
	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + ", material=" + material + "]";
	}
		
}
