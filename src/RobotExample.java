
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City kw = new City();

        // make walls
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);

        //Make a Thing
        new Thing(kw, 3, 4);
        //new Thing(kw, 2, 1);

        // Make the robot to live in the city
        Robot sam = new Robot(kw, 3, 4, Direction.EAST);
        Robot john = new Robot(kw, 1, 1, Direction.SOUTH);

        sam.turnLeft();
        sam.pickThing();
        sam.move();
        sam.move();
        john.move();
        //john.pickThing();
        sam.putThing();
        //john.move();
        //john.putThing();
        sam.turnLeft();
        //john.turnLeft();
        sam.move();
        //john.move();



    }
}
