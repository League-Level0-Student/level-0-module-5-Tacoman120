package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms {
	public static void main (String[]args) {
		boolean isPrime = true;
		String a = JOptionPane.showInputDialog(null, "Enter a number.");
		int b = Integer.parseInt(a);
		for(int c = 0; c < b; c++) {
			if(c > 1 && b%c == 0) {
				 isPrime = false;
				 System.out.println(c + " is not prime");
				 break;
			}
			
		}
		
		if(isPrime == true) {
			JOptionPane.showMessageDialog(null, "Your number is prime.");
		}else{
			JOptionPane.showMessageDialog(null, "Your number is NOT prime.");
		}

	}
	
}
