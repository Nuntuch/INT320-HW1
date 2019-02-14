package service;

import java.util.Arrays;
import service.base.Queue;
import service.base.Stack;

/**
 *
 * @author Nuntuch Thongyoo
 * @param <ObjG>
 */
public class StackAndQueueImpl<ObjG> implements Stack<ObjG>, Queue<ObjG> {

    /////For Dev
    public ObjG getValueByLocal(int value) {
        return array[value];
    }
    /////   

    public StackAndQueueImpl() {
        this.numlocal = 0;
    }

//    private int numlocal = 0;
    private int numlocal;
//    private List ArrayList = new ArrayList();
    private ObjG[] array = (ObjG[]) (new Object[10]);

    @Override
    public int size() {

        return numlocal;
    }

    @Override
    public void push(ObjG obj) {

//        if (this.numlocal == this.array.length) {
        if (this.numlocal > this.array.length - 1) {
//        if (this.numlocal%10 ==0) {

            System.out.println("Expand Space is on!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            ObjG[] arraytemp = (ObjG[]) (new Object[numlocal + 10]);
            for (int i = 0; i < numlocal; i++) {
                arraytemp[i] = this.array[i];

            }
            this.array = (ObjG[]) (new Object[numlocal + 15]);

            for (int i = 0; i < arraytemp.length; i++) {
                this.array[i] = arraytemp[i];

            }

        }
        System.out.println("Numlocal : " + numlocal + " Obj :  " + obj);
        this.array[numlocal] = obj;
        this.numlocal++;

    }

    @Override
    public ObjG pop() {//ดึงตัวท้ายออก1ตัว
        ObjG[] arraytemp = (ObjG[]) (new Object[numlocal - 2]);
        for (int i = 0; i < numlocal - 2; i++) {
            arraytemp[i] = this.array[i];

        }

        for (int i = 0; i < arraytemp.length; i++) {
            this.array[i] = arraytemp[i];

        }
        this.numlocal--;
//        return array[array.length - 1];
        return array[numlocal];
    }

    @Override
    public ObjG peek() {
        return array[numlocal - 1];
    }

    @Override
    public boolean isEmpty() {
        return numlocal == 0;
    }

    @Override
    public ObjG getFront() {
        return array[0];
    }

    @Override
    public ObjG dequeue() {//เอาหน้าออก
        ObjG[] arraytemp = (ObjG[]) (new Object[array.length]);
        for (int i = 1; i < array.length - 2; i++) {
            arraytemp[i - 1] = this.array[i];
            System.out.println("this.array[" + i + "] : " + this.array[i - 1]);
        }

        for (int i = 0; i < arraytemp.length; i++) {
            this.array[i] = arraytemp[i];

        }
        this.numlocal--;
//        return array[array.length-1];
        return array[0];
    }

    @Override
    public void enqueue(ObjG obj) {

        if (this.numlocal > this.array.length - 1) {
//        if (this.numlocal%10 ==0) {

            System.out.println("Expand Space is on!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            ObjG[] arraytemp = (ObjG[]) (new Object[numlocal + 10]);
            for (int i = 0; i < numlocal; i++) {
                arraytemp[i] = this.array[i];

            }
            this.array = (ObjG[]) (new Object[numlocal + 15]);

            for (int i = 0; i < arraytemp.length; i++) {
                this.array[i] = arraytemp[i];

            }

        }
        System.out.println("Numlocal : " + numlocal + " Obj :  " + obj);
//        System.out.println("Numlocal : " + numlocal);
        this.array[numlocal] = obj;
        this.numlocal++;

    }

    @Override
    public void clear() {
        array = (ObjG[]) (new Object[10]);
        this.numlocal = 0;
    }

    @Override
    public int search(ObjG obj) {

        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i])) {
                return i;
            }

        }

        return -1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StackAndQueueImpl<?> other = (StackAndQueueImpl<?>) obj;
        if (!Arrays.deepEquals(this.array, other.array)) {
            return false;
        }
        return true;
    }

}
