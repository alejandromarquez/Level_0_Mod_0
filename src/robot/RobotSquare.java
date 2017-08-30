package robot;

import org.jointheleague.graphical.robot.Robot;
import org.omg.Messaging.SyncScopeHelper;


public class RobotSquare {
    public static void main(String[] args) throws Exception {
        // 1. Make a new cyborg
    	Robot pok=new Robot();
    	

        // 3. Put the robot's pen down
    	pok.penDown();


        // 6. Make the robot move as fast as possible
    	pok.setSpeed(10);


        // 5. Do everything below here 4 times
           for(int i=0;i<100;i++){
        	   System.out.println("hello");
        	   
           

           //         2. Move your robot 200 pixels
            pok.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
            pok.turn(240
            		);


    }
}
}
