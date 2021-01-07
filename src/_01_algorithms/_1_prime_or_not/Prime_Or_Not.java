package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_Or_Not {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog(null, "Enter a number that you think is a prime number:");
	int num = Integer.parseInt(test);
	for (int i = 2; i < num; i++) {
		if (num % i==0)  {
			JOptionPane.showMessageDialog(null, "The number " + num + " is not a prime number.");
			return;
		}
	}
	JOptionPane.showMessageDialog(null, "The number " + num + " is a prime number.");
}
}
