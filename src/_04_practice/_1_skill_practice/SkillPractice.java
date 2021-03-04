package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[]args) {
	
	SkillPractice skills = new SkillPractice();
	//un-comment out which skill you would like to use
	//skills.skill1();
	//skills.skill2();
	//skills.skill3();
	//skills.skill4();
	//skills.skill5();
}

void skill1() {
	String dime = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = Integer.parseInt(dime);
	int cents = dimes * 10;
	JOptionPane.showMessageDialog(null, "You have " + cents + " cents");
	
	String height = JOptionPane.showInputDialog("How tall are you in inches?");
	int tall = Integer.parseInt(height);
	if (tall < 36) {
		JOptionPane.showMessageDialog(null, "Go eat your Wheaties!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You are at a good height! Keep up the good work!");
	}
}

void skill2() {
	for (int i = 0; i < 31; i+=3) {
		System.out.println(i);
	}
	
	/*
	Random randy = new Random();
	int x = randy.nextInt(11); //0-10
	int y = randy.nextInt(10-5+1)+5; //5-10
	int z = randy.nextInt(21)+10; //10-30
	*/
}

void skill3() {
	Random num = new Random();
	int num1 = num.nextInt(20);
	int num2 = num.nextInt(10);
	int difference = 0;
	
	if (num1 > num2) {
		difference = num1 - num2;
	}
	else if (num2 > num1) {
		difference = num2 - num1;
	}
	
	JOptionPane.showMessageDialog(null, "The difference between " + num1 + " and " + num2 + " is " + difference);
}

void skill4() {
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if (city.contentEquals("San Diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's Finest City");
	}
	else {
		JOptionPane.showMessageDialog(null, "You should move to San Diego, it's America's Finest City");
	}
	
	String numOfCars = JOptionPane.showInputDialog("How many cars does your family own?");
	int cars = Integer.parseInt(numOfCars);
	if (cars == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation");
	}
	else if (cars == 1) {
		String model = JOptionPane.showInputDialog("What is the model of car that your family owns?");
		String color = JOptionPane.showInputDialog("What color is said car?");
		JOptionPane.showMessageDialog(null, "Your family owns a " + model + " type car in the color " + color);
	}
	else if (cars > 1) {
		int wheels = cars * 2; 
		JOptionPane.showMessageDialog(null, "Your family owns " + wheels + " wheels among all of your cars");
	}
}

void skill5() {
	String school = JOptionPane.showInputDialog("What is the name of your school?");
	String adj = JOptionPane.showInputDialog("Using one word, how would you describe your school to be like?");
	JOptionPane.showMessageDialog(null, school + " sounds like a(n) " + adj + " type of school");
}
}
