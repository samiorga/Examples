
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
public class hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        new Wall(kw, 2, 4, Direction.EAST);

        new Thing(kw, 2, 4);

        Robot sam = new Robot(kw, 2, 2, Direction.EAST);

        while (sam.frontIsClear()) {
            sam.move();
        }

        sam.pickThing();





    }
}
