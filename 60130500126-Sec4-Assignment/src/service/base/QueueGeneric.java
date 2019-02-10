/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 * @param <Obj>
 */
public interface QueueGeneric<Obj> {

    public boolean isEmpty();

    public Obj getFront();

    public Obj dequeue();

    public void enqueue(Obj obj);

    public void clear();

}
