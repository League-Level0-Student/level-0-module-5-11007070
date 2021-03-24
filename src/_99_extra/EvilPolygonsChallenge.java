package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		rob.setSpeed(50);
		rob.penDown();
		//1. Create a new Robot

		//2. Set the speed to 100

		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like to draw with?", "Pick a Color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Yellow"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			rob.setPenColor(Color.red);
		}
		else if (colorChoice == 1) {
			rob.setPenColor(Color.blue);
		}
		else if (colorChoice == 2) {
			rob.setPenColor(Color.yellow);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String num = JOptionPane.showInputDialog("How many polygons would you like drawn?");
		int numP = Integer.parseInt(num);
		for (int i = 0; i < numP; i++) {
			for (int j = 0; j < 6; j++) {
				rob.move(100);
				rob.turn(72);
			}
			rob.turn(180);
		}
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

