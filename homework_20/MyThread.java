public class MyThread extends Thread {

	int number;

	public MyThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		// int number = Main.getNumberFibonacci();

		int n0 = 0;
		int n1 = 1;
		int n2;

		if (number < 1) {
			System.out.println("Введене число негативне або рівне нулю!");
		} else if (number == 1) {
			System.out.println(n0);
		} else {
			System.out.print("Ряд чисел Фібоначчі по зростанню: " + n0 + " " + n1 + " ");

			for (int i = 2; i <= number - 1; i++) {
				n2 = n0 + n1;

				System.out.print(n2 + " ");

				n0 = n1;
				n1 = n2;
			}

			System.out.println();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
