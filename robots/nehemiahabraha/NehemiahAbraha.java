package nehemiahabraha;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class NehemiahAbraha extends Robot {
    public void run(){
        //First write code that runs once
        //eg. set the color
        //get to a known position

        setBodyColor(Color.black);
        setGunColor(Color.red);
        setRadarColor(Color.yellow);
        setBulletColor(Color.blue);


        while(true){
            //this repeats forever until you die
            turnGunRight(360);
            



            /**ahead(100);
            turnGunRight(45);
            turnLeft(180);
            ahead(100);
            turnGunLeft(180);
            **/



            /**turnLeft(45);
            ahead(100);
            turnGunLeft(180);
            fire(20);
            back(100);
            **/
            
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){

        //This code is very simple and straight forward, what I am basically doing is charging at the robot until i eventually end it.
        //the robot will revaluate and scan the robot, with its radar turning 360.

        double oppBearing = e.getBearing();  // The bearing to the robaot that has been scannned

        double oppDistance = e.getDistance() - 45; // the distance that covers you and the opposing robot 

        turnRight(oppBearing);
        ahead(oppDistance);

        fire(200);
        scan();  // this scan method will scan again if the robot dodges or isnt there anymore, and will continue to charge again.



        
        
        
        
        /**if(e.getDistance() < 100){
            fire(3);
        }
        else{
            fire(1);
        }
        **/
    }

}
