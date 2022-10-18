package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	 static String bob;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 bob = JOptionPane.showInputDialog(null, "What is your favorite pet?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(happinessLevel<100) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "give your pet water", "cuddle with your pet", "feed your pet", "take a walk with your pet", "groom your pet", "clean up your pet's poop", "kill your pet" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
 if(task==0) {
	 giveYourPetWater();
 }
 if(task==1) {
	 cuddleWithYourPet();
 }
 if(task==2) {
	 feedYourPet();
 }
 if(task==3) {
	 takeAWalkWithYourPet();
 }
 if(task==4) {
	 groomYourPet();
 }
 if(task==5) {
	 cleanUpYourPetsPoop();
 }
 if(task==6) {
	 killYourPet();
 }
 if(happinessLevel<100) {
 JOptionPane.showMessageDialog(null, "Your "+bob+" is "+happinessLevel+"% statisfied with your efforts");
 }
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
		
		JOptionPane.showMessageDialog(null, "you really love your pet");
		
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void giveYourPetWater() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" drinks the water happily");
		happinessLevel+=5;
	}
	public static void  cuddleWithYourPet() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" sighs contently");
		happinessLevel+=10;
	}
	public static void feedYourPet() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" eats the food happily");
		happinessLevel+=7.5;
	}
	public static void takeAWalkWithYourPet() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" walks up to you excitedly");
		happinessLevel+=10;
	}
	public static void groomYourPet() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" smiles happily");
		happinessLevel+=15;
	}
	public static void cleanUpYourPetsPoop() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" stares at you with a smug look on his face");
		happinessLevel+=5;
	}
	public static void killYourPet() {
		JOptionPane.showMessageDialog(null, "Your "+bob+" smiles happily as the last of his life slips away");
		happinessLevel+=100;
	}
	
	
}