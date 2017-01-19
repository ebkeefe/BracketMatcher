/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketmatcher2;


public class StackList2 implements Stack2{
    private Node2 head = new Node2('e', null);
        
    public StackList2(){
    }
    
    public void push(Character c){
        head.next = new Node2(c, head.next);
    }
    
    public Character pop(){
        Character answer = head.next.item;
        head.next = head.next.next;
        return answer;
        
    }
    
    public boolean isEmpty(){
        return (head.next==null);
    }
    
    
}
