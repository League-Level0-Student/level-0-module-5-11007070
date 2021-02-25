package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[]args) {
	
	SkillPractice skills = new SkillPractice();
	skills.skill1();
	/*
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
	*/
}

void skill1() {
	String dime = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = Integer.parseInt(dime);
	int cents = dimes * 10;
	JOptionPane.showMessageDialog(null, "You have " + cents + " cents");
}
}
