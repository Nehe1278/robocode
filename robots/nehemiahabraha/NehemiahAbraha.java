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
            //int square = ahead(100) + turnLeft(45) + ahead(100) + turnLeft(45) + ahead(100) + turnLeft(45) + ahead(100);
            
            
            ahead(100);
            turnGunRight(45);
            turnLeft(180);
            ahead(100);
            turnGunLeft(180);



            /**turnLeft(45);
            ahead(100);
            turnGunLeft(180);
            fire(20);
            back(100);
            **/
            
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        if(e.getDistance() < 100){
            fire(3);
        }
        else{
            fire(1);
        }
        
    }
}
