public class Mainn {

	public static void main(String[] args) {

		Robot robot = new Robot ();
		CoffeeRobot coffeeRobot = new CoffeeRobot();
		RobotDanser robotDanser = new RobotDanser();
		RobotCooker robotCooker = new RobotCooker();
		
		robot.work();
		coffeeRobot.work();
		robotDanser.work();
		robotCooker.work();
		
		System.out.println();
		
		Robot [] robotArray = new Robot [4];
		robotArray[0] = robot;
		robotArray[1] = coffeeRobot;
		robotArray[2] = robotDanser;
		robotArray[3] = robotCooker;
		
		for (int i = 0; i<robotArray.length; i++){
            robotArray[i].work();
		}
	}
}
