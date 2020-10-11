public class Main {
	
	public static void main(String[] args) {
	
		FixedSalaryWorker id1234 = new FixedSalaryWorker("Інокентій", 7500); 
		HourlyWageWorker id2222 = new HourlyWageWorker("Валєра", 220, 45.77);
		
		id1234.salary();
		id2222.salary();
	}
}
