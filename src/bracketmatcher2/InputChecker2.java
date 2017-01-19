/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketmatcher2;
import java.util.Scanner;


public class InputChecker2 {
    
    
    Stack2 theStack;
    
    public InputChecker2(Stack2 s){
        theStack = s;
        
    }

    public String getInput(){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()){
            String answer = scan.next();
            return answer;
        }
        return null;
    }
    
    public boolean checkInput(String input){
        for (int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            if (c=='(' || c=='[' || c=='{'){
                theStack.push(c);
            }
            if (c==')' || c==']' || c=='}'){
                if (theStack.isEmpty()){return false;}
                if (match(theStack.pop(), c) == false){return false;}
                             
            }
        }
        if(theStack.isEmpty()){return true;}
        else{return false;}
     }
    
    private boolean match(Character a, Character b){
        if (a =='(' && b == ')'){return true;}
        if (a =='[' && b == ']'){return true;}
        if (a =='{' && b == '}'){return true;}
        return false;
    }
    
}
