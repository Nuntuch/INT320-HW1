/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.base;

import java.util.Vector;

/**
 *
 * @author Nuntuch Thongyoo
 */
public interface StackAndQueueGeneirc {

    public interface QueueGeneric<Obj> {

        public boolean isEmpty();

        public Obj getFront();

        public Obj dequeue();

        public void enqueue(Obj obj);

        public void clear();

    }

    public interface StackGeneric<Obj> {

        public void push(Obj obj);

        public Obj pop();

        public Obj peek();

        public boolean isEmpty();

    }

}
