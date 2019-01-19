//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		// 5. Use an if/else statement to set the pen color that the user requested
		for (int i = 1; i < 5; i++) {
			String color = JOptionPane.showInputDialog("What color do you want the robot to draw?");
			if (color.equals("red")) {
				r2d2.setPenColor(255, 0, 0);
			} else if (color.equals("blue")) {
				r2d2.setPenColor(0, 255, 0);
				if(color.equals("green")){
					r2d2.setPenColor(0,0,225);
				}
			} else {
				r2d2.setRandomPenColor();

			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10

			// 2. Make the robot draw a shape (this will take more than one line of code)
			r2d2.penDown();
			r2d2.setSpeed(50);
			r2d2.move(100);
			r2d2.turn(90);

		}
	}
}
