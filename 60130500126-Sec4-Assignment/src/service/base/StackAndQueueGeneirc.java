package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 */

public interface StackAndQueueGeneirc<Obj> {

    public boolean isEmpty();

    public int size();

    public interface QueueGeneric<Obj> {

        public Obj getFront();

        public Obj dequeue();

        public void enqueue(Obj obj);

        public void clear();

    }

    public interface StackGeneric<Obj> {

        public void push(Obj obj);

        public Obj pop();

        public Obj peek();

    }

}

//public interface StackAndQueueGeneirc {
//
//    public interface QueueGeneric<Obj> {
//
//        public boolean isEmpty();
//
//        public Obj getFront();
//
//        public Obj dequeue();
//
//        public void enqueue(Obj obj);
//
//        public void clear();
//
//    }
//
//    public interface StackGeneric<Obj> {
//
//        public void push(Obj obj);
//
//        public Obj pop();
//
//        public Obj peek();
//
//        public boolean isEmpty();
//
//    }
//
//}
