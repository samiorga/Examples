
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 2015;
        int birthYear = 1998;
        int age = year - birthYear;
        System.out.println("Your age is: " + age);
        double area = 1836.36;
        boolean switchOn = year <= 1998;
        char firstLetter = 'A';
        
        City kw = new City();        
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        int moveAmount = 5;
        while(moveAmount > 0){
            karel.move();
            moveAmount = moveAmount - 1 ;
                                 // or -- ++
        }
        
        //moveAmount -= 5; moveAmount += 5;
        
        Robot tina = new Robot(kw, 2, 1, Direction.EAST);
        for(int moveCount = 5; moveCount > 0; moveCount = moveCount - 1){
            tina.move();
        }
         
        Robot sam = new Robot(kw, 3, 1, Direction.EAST);
        for(int moveAhead = 0; moveAhead < 5; moveAhead = moveAhead + 1){
            sam.move();
        }
        
    }
}
