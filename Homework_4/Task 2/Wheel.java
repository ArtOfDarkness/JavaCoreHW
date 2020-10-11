public class Wheel {

	private double wheelSize;
	private String tyreType;
	
	public Wheel(double wheelSize, String tyreType) {
		this.wheelSize = wheelSize;
		this.tyreType = tyreType;
	}

	public double wheelSizeEnlarge (int coeff) {
		double newWheelSize = this.wheelSize * coeff;
		return newWheelSize;
	}
	
	public double getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(double wheelSize) {
		this.wheelSize = wheelSize;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	@Override
	public String toString() {
		return "Wheel [wheelSize=" + wheelSize + ", tyreType=" + tyreType + "]";
	}	
	
}
