
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City kw = new City();
        
        // make walls
        new Wall(kw, 3,4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        
        //Make a Thing
        new Thing(kw, 3, 4);
        
        // Make the robot to live in the city
        Robot karel = new Robot(kw, 3, 4, Direction.EAST);
        Robot steve = new Robot(kw, 1,1, Direction.SOUTH);
        
        karel.turnLeft();
        karel.pickThing();
        karel.move();
        karel.move();
        steve.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        
        
        
        
        
    }

}
