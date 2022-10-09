package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	public static void main(String[] args) {
		
		Robot potato = new Robot();
		potato.show();
		potato.penDown();
		potato.setSpeed(20);
		for(int i = 0; i<4; i++) {
			potato.move(90);
			potato.turn(90);
			
		}
		
		
		
	}
}
