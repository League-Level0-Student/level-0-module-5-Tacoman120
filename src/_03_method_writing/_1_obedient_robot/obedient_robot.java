package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	
	public static void main(String[] args) {
		
		String bob = JOptionPane.showInputDialog(null, "What shape do you want the robot to draw?"
				+ " Chose from square, circle, and triangle"
				+ " (please input you answer in the the same way it is typed in the options).");
		String e = JOptionPane.showInputDialog(null, "What color do you want the robot to draw?\n"
				+ "	 Chose from square, circle, and triangle\n"
				+ " (please input you answer in the the same way it is typed in the options).");
		if(bob.equals("square")) {
			drawSquare();
		}
		if(bob.equals("circle")&&(e.equals("red"))) {
			drawCircle();
		}
		if(bob.equals("triangle")) {
			drawTriangle();
		}

		
		
		
	}
static void drawSquare(){
Robot potato = new Robot();
potato.show();
potato.penDown();
potato.setSpeed(20);
		for(int i = 0; i<4; i++) {
			potato.move(120);
			potato.turn(90);
		}
	}
static void drawTriangle() {
	Robot potato = new Robot();
	potato.show();
	potato.penDown();
	potato.setSpeed(20);
	potato.turn(-90);
	for(int i = 0; i<3; i++) {
		potato.move(140);
		potato.turn(120);
		}
	}
static void drawCircle() {
	Robot potato = new Robot();
	potato.show();
	potato.penDown();
	potato.setSpeed(1000);
	for(int i = 0; i<360; i++) {
		potato.move(1);
		potato.turn(1);
		}
}
	

}
