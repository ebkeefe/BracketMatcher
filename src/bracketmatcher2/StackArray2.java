/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketmatcher2;

import java.util.ArrayList;


public class StackArray2 implements Stack2{
    
    Character[] theList = new Character[20];
    int index = 0;
    //empty when current index is -1
    
    public StackArray2(){
    }
    
    public void push(Character c){
        theList[index] = c;
        index++;
    }
    public Character pop(){
        Character temp = theList[index-1];
        theList[index-1]=null;
        index--;
        return temp;
        
    }
    public boolean isEmpty(){
        return index==0;
    }
    
}
