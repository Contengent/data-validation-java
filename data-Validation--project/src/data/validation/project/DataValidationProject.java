package data.validation.project;
import java.util.Scanner;

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

public class DataValidationProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        
        int tempCheckInt;
        double tempCheckDouble;
        boolean completeCheck = false;
        
        final String TEST_ONE   = "Input a string with more then 6 characters";
        final String TEST_TWO   = "Input a string with a lowercase \"a\"";
        final String TEST_THREE = "Input a string with 5-15 characters";
        final String TEST_FOUR  = "Input a integer between 5-500";
        final String TEST_FIVE  = "Input a negative integer";
        final String TEST_SIX   = "Input a positive, odd integer";
        
        System.out.println("Welcome to my test.");
        System.out.println("\nI will request that you input a series of strings.");
        System.out.println("If you do anything incorrectly, the entire test will retart.");
        System.out.println("Ready? Lets begin!");
        
        do{
            if(newTest(TEST_ONE).length() > 6){
                System.out.println("Correct!");
                if(newTest(TEST_TWO).contains("a")){
                    System.out.println("Correct!");
                    tempCheckInt = newTest(TEST_THREE).length();
                    if(tempCheckInt >= 5 && tempCheckInt <= 15){
                        System.out.println("Correct!");
                        tempCheckInt = Integer.parseInt(newTest(TEST_FOUR));
                        if(tempCheckInt >= 5 && tempCheckInt <= 500){
                            System.out.println("Correct!");
                            tempCheckDouble = Double.parseDouble(newTest(TEST_FIVE));
                            if(tempCheckDouble < 0 && tempCheckDouble % 1 == 0){
                                System.out.println("Correct!");
                                tempCheckDouble = Double.parseDouble(newTest(TEST_SIX));
                                if(tempCheckDouble % 2 == 1 && tempCheckDouble > 0){
                                    System.out.println("Correct!");
                                    System.out.println("You have completed the test!");
                                    completeCheck = true;
            }   }   }   }   }   } // I thought this looked pretty cool.
            
            if (!completeCheck){
                System.out.println("Wrong!");
            }
            
        } while(!completeCheck);
        
    }
    
    public static String newTest(String question){
        Scanner stringInput = new Scanner(System.in);
        String input;
        
        System.out.println(question);
        input = stringInput.nextLine();
        
        return input;
    }
}
