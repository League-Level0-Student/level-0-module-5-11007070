package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
public static void main(String[] args) {
	Robot bob = new Robot();
	
}
public static void drawSquare() {
	Robot bob = new Robot();
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
	Robot bob = new Robot();
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
String x = method("Hello");
System.out.println(x);
public static String method(String word) {
	return word;
} */

}
