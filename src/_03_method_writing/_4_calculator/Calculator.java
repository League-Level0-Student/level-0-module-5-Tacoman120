package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		int bob = 0;
		if(task==0) {
			bob = divide(number1, number2);
		}
		if(task==1) {
			bob = multiply(number1, number2);
		}
		if(task==2) {
			bob = subtract(number1, number2);
		}
		if(task==3) {
			bob = add(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
		String wow =result(bob);
		JOptionPane.showMessageDialog(null, wow);
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 static int add(int bob, int bo) {
		 int wow =(bob+bo);
		 return wow;
	 }
	 static int subtract(int bob, int bo) {
		 int wow =(bob-bo);
		 return wow;
	 }
	 static int multiply(int bob, int bo) {
		 int wow =(bob*bo);
		 return wow;
		 
	 }
	 static int divide(int bob, int bo) {
		 int wow =(bob/bo);
		 return wow;
	 }
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
static String result(int bob) {
	String bo = "Your answer is "+bob;
	return bo;
}
	
}
