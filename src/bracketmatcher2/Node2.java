/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketmatcher2;


public class Node2 {
    Character item;
    Node2 next;
    
    public Node2(Character c, Node2 n){
        this.next = n;
        this.item = c;
    }
    
    public Node2(Character c){
        this(c, null);
    }
    
           
    
}
