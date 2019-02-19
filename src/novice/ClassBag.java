/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

/**
 *
 * @author ACER
 */
public class ClassBag {
    public int potion;
    public int custom;
    public int weapon;
    public int food;
    

 public ClassBag (){
     this.potion = 0;
     this.custom = 0;
     this.weapon = 0;
     this.food = 0;
       
       }
public void addItem(String select) {
        
        if("potion".equals(select))
            this.potion++;
        else if("custom".equals(select))
            this.custom++;
        else if("weapon".equals(select))
            this.weapon++;
        else if("food".equals(select))
            this.food++;
    }
 
}