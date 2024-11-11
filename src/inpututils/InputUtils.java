/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 * InputUtilities to ask for input
 * BSc sept 2024
 * @author kheal
 */
public class InputUtils {
    /**
     * Prompts to user to enter some text. If not text will keep repeating prompt
     * 
     * @param prompt the question or prompt to the user
     * @return text entered by user
     */
    public String askUserForText (String prompt){
        
        Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter text only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[a-zA-Z!.?', ]+"));
        
        //the input must be text
        return(userInput);
        
    }
        /**
         * Ask user to enter integer value
         * if not an integer, ask again until input is valid
         * @param prompt the question or prompt to the user 
         * @return an int value entered by user
         */
        public int askUserForInt (String prompt){
            
              Scanner myKB = new Scanner(System.in);
              String userInput;
              
             do {
            System.out.println();
            System.out.println("You must enter numbers only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[0-9]+"));
        //must have a numeric input stored as a string
        
        return(Integer.parseInt(userInput));
        
        }
        
        /**
         * Ask user to enter a integer with a given maximum
         * if input is non-numeric OR if it is too big then repeat 
         * @param prompt prompt the question or prompt to the user
         * @param maxValue the maximum 
         * @return 
         */
        public int askUserForInt (String prompt, int maxValue){
        
         Scanner myKB = new Scanner(System.in);
            int userInput = maxValue+1;
        
         do {
            System.out.println(prompt);
            System.out.println("You must enter numbers less than " + maxValue + " only!");
            
             try{
                    //this might go wrong if user enters text
                    userInput = myKB.nextInt();
            }
             catch (Exception e){
                System.out.println("That was not a number!");
                myKB.nextLine(); // this prevents infinite loop
            }
            
            //keep going while input too big
        }while ( userInput > maxValue);
         
         return userInput;
        
        }

}