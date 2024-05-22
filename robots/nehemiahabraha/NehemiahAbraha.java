package nehemiahabraha;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class NehemiahAbraha extends Robot {
    public void run(){
        //First write code that runs once
        //eg. set the color
        //get to a known position


        while(true){
            //this repeats forever until you die
            ahead(100);
            turnGunRight(180);
            turnLeft(45);
            ahead(100);
            turnRight(45);
            turnGunLeft(180);
    
            back(100);
            
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        fire(20);
    }
}
