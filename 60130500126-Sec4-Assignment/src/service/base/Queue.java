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
public interface Queue<ObjG> {

    public boolean isEmpty();

    public ObjG getFront();

    public ObjG dequeue();

    public void enqueue(ObjG obj);//เพิ่มท้าย

    public void clear();

    public int size();
}
