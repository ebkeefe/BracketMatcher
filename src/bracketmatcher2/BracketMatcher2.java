/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketmatcher2;

import java.util.Scanner;


public class BracketMatcher2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Welcome...This program checks if brackets match");      
        while (true){
            Stack2 stackOne = new StackArray2();
            Stack2 stackTwo = new StackList2();
            InputChecker2 ic = new InputChecker2(stackOne);
            String input = ic.getInput();
            boolean answer = ic.checkInput(input);
            System.out.println("The brackets you entered are " + answer
            + " checked with a StackArray");
            InputChecker2 icTwo = new InputChecker2(stackTwo);
            answer = icTwo.checkInput(input);
            System.out.println("The brackets you entered are " + answer
            + " checked with a StackList");
                  
        }
    }
       
    static String getInput(){
        Scanner scan = new Scanner(System.in);
        String input = null;
        if (scan.hasNext()){
            input = scan.next();
        }
        return input;
    }
    
        
}
