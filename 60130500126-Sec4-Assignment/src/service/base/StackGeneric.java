/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 */
public interface StackGeneric <Obj>{
//    public abstract int OrderToEntryOutTheRoom();
    
    public void push(Obj obj);

   public Obj pop();

   public Obj peek();

   public boolean isEmpty();
    
    
    
}
