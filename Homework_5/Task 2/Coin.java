public class Coin {

	static void throwCoin() {
		int throwResult = (int) (Math.random() * 2);
		
		if (throwResult == 1)
			System.out.println("Orel");
		else
			System.out.println("Reshka");
	}
	
}
