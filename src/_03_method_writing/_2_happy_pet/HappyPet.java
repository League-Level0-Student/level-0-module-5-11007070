package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String typePet;
	static String method;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		typePet = JOptionPane.showInputDialog("What kind of pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {	
		int task = JOptionPane.showOptionDialog(null, "What would you like to do in order to make your pet happy?", "Make Your Pet Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Cuddle", "Food", "Water", "Take a Walk", "Groom", "Clean up Poop" }, null);
			
			if (task == 0) {
				cuddlePet();
			}
			else if (task == 1) {
				feedPet();
			}
			else if (task == 2) {
				waterPet();
			}
			else if (task == 3) {
				walkPet();
			}
			else if (task == 4) {
				groomPet();
			}
			else if (task == 5) {
				cleanPoop();
			}
			
			if (happinessLevel >= 30) {
				JOptionPane.showMessageDialog(null, "Wow! You really do love your pet!");
				return;
			}
		}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	public static void cuddlePet() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys being cuddled.");
		happinessLevel += 15;
	}
	
	public static void feedPet() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys being fed.");
		happinessLevel += 10; 
	}
	
	public static void waterPet() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys drinking water.");
		happinessLevel += 10;
	}
	
	public static void walkPet() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys going on a walk.");
		happinessLevel += 15; 
	}
	
	public static void groomPet() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys being groomed.");
		happinessLevel += 5;
	}
	
	public static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "Your " + typePet + " enjoys watching you clean their poop.");
		happinessLevel += 5;
	}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}