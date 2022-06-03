/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

/*

Stage 1: The user must enter a string that is greater than 6 characters long.

Stage 2: The user must enter a string that contains at least one lowercase “a”.

Stage 3: The user must enter a string that is between 5 and 15 characters long, and does not contain the letter “z”.

Stage 4: The user must enter an integer between 5 and 500.

Stage 5: The user must enter a negative integer.

Stage 6: The user must enter a positive, odd integer.

*/

package datavalidation.project;
import java.util.Scanner;


public class DataValidationProject {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        
        String input;
        
        System.out.println("Input a string that is greater than 6 characters.");
        input = stringInput.nextLine();
        
        if(input.length() > 6){
            System.out.println("hahahahaha");
        } else{
            System.out.println("wrong wrong wrong wrong wronnnnggg!!!");
        }
    }  
}
