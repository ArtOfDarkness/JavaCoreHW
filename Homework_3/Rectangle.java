public class Rectangle {

	private int length;
	private int width;
	
Rectangle () {
		this.length = 10;
		this.width = 15;
	}
		
Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	

}
Rectangle()
{

	width=75;
	length=25;
}
public int perimeter(){
	return width*2+length*2;
}
public int area(){
	return width*length;
}
}