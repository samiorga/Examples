import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Hello World");    

    // create a new Scanner to read in values
      Scanner input = new Scanner(System.in);
 
      // create a String to store a word for later
      String myString;

      // create an integer to store a number
      int myInt;

      // Read in a single word from the user
      System.out.println("Please input a word");
      myString = input.next();

      // Read in an integer from the user
      System.out.println("Please input an integer");
      myInt = input.nextInt();

      // Output our sentence to the user letting them know what they entered
      System.out.println ("You input the word " + myString + " and the number " + myInt);


        //ask year of birth
        System.out.println("What year are you born?");
        
        int birthYear = input.nextInt();
        
        int age= 2015 - birthYear;
       
        //tell them theri age
        System.out.println("You are " + age + " years old!");
      
        
        
        if(age >+ 20){
            System.out.println("You are old!!!");
        }else if(age > 12 && age < 20){
            System.out.println("You are a teen.");
        }else{
            System.out.println("How are you doing this?");
        }

    
    
    
    }
}
