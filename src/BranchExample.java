
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class BranchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();

        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        Robot sam = new Robot(kw, 4, 1, Direction.EAST);

        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 4, 6, Direction.EAST);

        if (karel.frontIsClear()) {
            karel.move();
        } else if (karel.canPickThing()) {
            karel.turnLeft();
            karel.move();
        } else if (karel.countThingsInBackpack() <= 10) {
        } else {
        }

        while (true) {
            if (sam.frontIsClear()) {
                sam.move();
            } else {
                break;
            }
            sam.turnLeft();
        }
    }
}
