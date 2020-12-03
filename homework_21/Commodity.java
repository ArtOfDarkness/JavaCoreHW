public class Commodity {

	@CommodityAnnotation("Use for the Name of Commodity")
	public String name;
	@CommodityAnnotation("Use for the Commodity's length")
	private int length;
	@CommodityAnnotation("Use for the Commodity's width")
	private int width;
	@CommodityAnnotation("Use for the Commodity's weight")
	private int weight;

	public Commodity() {
	}

	public Commodity(String name) {
		this.name = name;
	}

	public Commodity(String name, int length, int width) {
		this.name = name;
		this.length = length;
		this.width = width;
	}

	public Commodity(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void putOnShelf(int shelfNumber) {
		System.out.println("Товар поміщений на полицю №" + shelfNumber);
	}

	public void giveForSafekeeping(String person) {
		System.out.println("Робітник " + person + " прийняв товар на зберігання");
	}

	@Override
	public String toString() {
		return "Товар " + name + " (" + length + " x " + width + " см, " + weight + " кг)";
	}

}
