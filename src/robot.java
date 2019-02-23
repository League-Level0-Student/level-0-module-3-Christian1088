import org.jointheleague.graphical.robot.Robot;

public class robot {
	static Robot rob;

	public static void main(String[] args) {

		rob = new Robot();

		drawSquare(rob);
		drawTriangle(rob);
		drawCircle(rob);
	}

	public static void drawSquare(Robot rob) {
		rob.setX(300);
		rob.setY(300);

		for (int i = 0; i < 4; i++) {

			rob.setPenWidth(30);
			rob.setSpeed(100);
			rob.setRandomPenColor();
			rob.penDown();
			rob.turn(90);
			rob.move(100);

		}
	}

	public static void drawTriangle(Robot rob) {
		rob.setX(500);
		rob.setY(500);

		for (int i = 0; i < 3; i++) {
			rob.setPenWidth(30);
			rob.setSpeed(100);
			rob.setRandomPenColor();
			rob.penDown();
			rob.turn(120);
			rob.move(100);

		}

	}

	public static void drawCircle(Robot rob) {
		rob.setX(650);
		rob.setY(650);
		for (int i = 0; i < 360; i++) {
			rob.setPenWidth(30);
			rob.setSpeed(100);
			rob.setRandomPenColor();
			rob.penDown();
			rob.turn(1);
			rob.move(1);

		}
	}
}
