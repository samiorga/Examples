
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make an array of ints
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = -17;
        nums[2] = 5;
        nums[3] = 100;
        nums[4] = 12;
        // | 10 | -17 | 5 | 100 | 12 | 
        //loop through array and print out values
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        //make new scanner
        Scanner input = new Scanner(System.in);
        //looop through array
        //get input from user
        for(int i = 0; i < nums.length; i++){
            System.out.print("Type in an integer: ");
            nums[i] = input.nextInt();
            System.out.println("You typed: " + nums[i]);
        }
        //adding up all numbers in the array
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
            System.out.println(total);
        }
        System.out.println("Your numbers add up to " + total);
        
        nums[0] = nums[1] + nums[2] * nums[3];
        System.out.println(nums[0]);
    }
}
