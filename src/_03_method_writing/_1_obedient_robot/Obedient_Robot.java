package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot bob = new Robot();

	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape do you want to draw? (square, triangle, or circle?)");
		String penColor = JOptionPane.showInputDialog("What color would you like the shape to be? (red, orange, yellow, green, blue, or pink?)");
		bob.setPenWidth(300);
		if (penColor.equals("red")) {
			bob.setPenColor(Color.red);
		}
		else if (penColor.equals("orange")) {
			bob.setPenColor(Color.orange);
		}
		else if (penColor.equals("yellow")) {
			bob.setPenColor(Color.yellow);
		}
		else if (penColor.equals("green")) {
			bob.setPenColor(Color.green);
		}
		else if (penColor.equals("blue")) {
			bob.setPenColor(Color.blue);
		}
		else if (penColor.equals("pink")) {
			bob.setPenColor(Color.pink);
		}
		
		if (shape.equals("square")) {
			drawSquare();
		} else if (shape.equals("triangle")) {
			drawTriangle();
		} else if (shape.equals("circle")) {
			drawCircle();
		}

	}

	public static void drawCircle() {
		bob.penDown();
		for (int i = 0; i < 360; i++) {
			bob.move(1);
			bob.turn(1);
		}
	}

	public static void drawSquare() {
		bob.setSpeed(10);
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
	}

	public static void drawTriangle() {
		bob.setSpeed(10);
		bob.penDown();
		bob.move(100);
		bob.turn(120);
		bob.move(100);
		bob.turn(120);
		bob.move(100);
		bob.turn(120);
	}
	/*
	 * String x = method("Hello"); System.out.println(x); public static String
	 * method(String word) { return word; }
	 */

}
