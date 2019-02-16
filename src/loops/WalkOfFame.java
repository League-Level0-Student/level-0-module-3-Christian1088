
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
          
		// 2. Make the robot draw a star shape. Hint: 144.
          drawStar(70, 70, rob);
          drawStar(160, 160, rob);
          drawStar(250, 250, rob);
          drawStar(340,340, rob);
          drawStar(430, 430, rob);
          drawStar(520,520, rob);
		// 3. Set the size of the star to 30.
         
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
public static void drawStar(int x, int y, Robot rob) {
	rob.setX(x);
    rob.setY(y);
    for (int i = 0; i < 5; i++) {
			
   		
        rob.setPenWidth(10);
        rob.setSpeed(100);
        rob.setRandomPenColor();
        rob.penDown();
        rob.turn(144);
        rob.move(150);
        }
}
}

