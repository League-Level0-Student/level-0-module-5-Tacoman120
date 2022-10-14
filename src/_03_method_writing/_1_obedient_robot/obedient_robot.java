package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot potato;
	
	public static void main(String[] args) {
		potato = new Robot();
		potato.show();
		String bob = JOptionPane.showInputDialog(null, "What shape do you want the robot to draw?\n"
				+ " Chose from square, circle, and triangle\n"
				+ " (please input you answer in the the same way it is typed in the options).");
		String e = JOptionPane.showInputDialog(null, "What color do you want the robot to draw?\n"
				+ "	 Chose from red, blue, and yellow\n"
				+ " (please input you answer in the the same way it is typed in the options).");
		if(bob.equals("square")) {
			if(e.equals("red")) {
				potato.setPenColor(255, 0, 0);
			}else if (e.equals("blue")) {
				potato.setPenColor(0, 0, 255);
			}else if (e.equals("yellow")) {
				potato.setPenColor(255, 255, 0);
			}
			drawSquare();
		}
		if(bob.equals("circle")) {
			if(e.equals("red")) {
				potato.setPenColor(255, 0, 0);
			}else if (e.equals("blue")) {
				potato.setPenColor(0, 0, 255);
			}else if (e.equals("yellow")) {
				potato.setPenColor(255, 255, 0);
			}
			drawCircle();
		}
		if(bob.equals("triangle")) {
			if(e.equals("red")) {
				potato.setPenColor(255, 0, 0);
			}else if (e.equals("blue")) {
				potato.setPenColor(0, 0, 255);
			}else if (e.equals("yellow")) {
				potato.setPenColor(255, 255, 0);
			}
			drawTriangle();
		}

		
		
		
	}
public static void drawSquare(){

potato.show();
potato.penDown();
potato.setSpeed(20);
		for(int i = 0; i<4; i++) {
			potato.move(120);
			potato.turn(90);
		}
	}
public static void drawTriangle() {
	potato.show();
	potato.penDown();
	potato.setSpeed(20);
	potato.turn(-90);
	for(int i = 0; i<3; i++) {
		potato.move(140);
		potato.turn(120);
		}
	}
public static void drawCircle() {
	potato.show();
	potato.penDown();
	potato.setSpeed(1000);
	for(int i = 0; i<360; i++) {
		potato.move(1);
		potato.turn(1);
		}
}
	

}
