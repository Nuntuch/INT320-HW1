/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//import javax.inject.Inject;
import service.QueueGenericImpl;
import service.StackGenericImpl;
import service.base.QueueGeneric;
import service.base.StackGeneric;

/**
 *
 * @author Nuntuch Thongyoo
 */
//@Inject

public class Main {
    public static void main(String[] args) {
      
        StackGeneric stackGenericObj =   new StackGenericImpl();
        QueueGeneric queueGenericObj = new QueueGenericImpl();
                
        
        
        
    }
}
