package main;
//import javax.inject.Inject;

import service.StackAndQueueImpl;

/**
 *
 * @author Nuntuch Thongyoo
 */
//@Inject
public class Main {

    public static void main(String[] args) {

        TestStack();
        System.out.println("____________________________________________________");
        TestQueue();

    }

    public static void TestQueue() {

        StackAndQueueImpl TestS = new StackAndQueueImpl();

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());
        System.out.println("TestS.getFront() : " + TestS.getFront());
        System.out.println("TestS.enqueue(i); is start!!!");
        TestS.enqueue(1);
        TestS.enqueue(2);
        TestS.enqueue(3);
        TestS.enqueue(4);
        TestS.enqueue(5);
        TestS.enqueue(6);
        TestS.enqueue(7);
        TestS.enqueue(8);
        TestS.enqueue(9);
        TestS.enqueue(10);
        System.out.println("TestS Size : " + TestS.size());
        TestS.enqueue(11);
        TestS.enqueue(12);
        TestS.enqueue(13);
        TestS.enqueue(14);
        TestS.enqueue(15);
        System.out.println("TestS Size : " + TestS.size());
        TestS.enqueue(16);
        TestS.enqueue(17);
        TestS.enqueue(18);
        TestS.enqueue(19);
        TestS.enqueue(20);
        for (int i = 0; i < 20; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
        System.out.println("TestS Size : " + TestS.size());

//        TestS.pop();
//       TestS.push("Hi555++++++");
        for (int i = 0; i < 25; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS Size : " + TestS.size());

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());

        System.out.println("TestS.getFront() : " + TestS.getFront());

        System.out.println(" TestS.dequeue() : " + TestS.dequeue());

        for (int i = 0; i < 25; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS.getFront() : " + TestS.getFront());

        System.out.println("TestS.clear() is start");
        System.out.println("......................*");
        TestS.clear();
        System.out.println("Not Exception!!! Clear Complete !!!");
        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
        System.out.println("TestS Size : " + TestS.size());

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());

        System.out.println("TestS.getFront() : " + TestS.getFront());

    }

    public static void TestStack() {

        StackAndQueueImpl TestS = new StackAndQueueImpl();

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());
        System.out.println("TestS.push(i); is start!!!");
        TestS.push(1);
        TestS.push(2);
        TestS.push(3);
        TestS.push(4);
        TestS.push(5);
        TestS.push(6);
        TestS.push(7);
        TestS.push(8);
        TestS.push(9);
        TestS.push(10);
        System.out.println("TestS Size : " + TestS.size());
        TestS.push(11);
        TestS.push(12);
        TestS.push(13);
        TestS.push(14);
        TestS.push(15);
        System.out.println("TestS Size : " + TestS.size());
        TestS.push(16);
        TestS.push(17);
        TestS.push(18);
        TestS.push(19);
        TestS.push(20);
        for (int i = 0; i < 20; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
        System.out.println("TestS Size : " + TestS.size());

//        TestS.pop();
//       TestS.push("Hi555++++++");
        for (int i = 0; i < 25; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
        System.out.println(" TestS.peek() : " + TestS.peek());
        System.out.println("TestS Size : " + TestS.size());

        System.out.println("TestS.search(5) : " + TestS.search(5));

        System.out.println("TestS.pop() : " + TestS.pop());

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());

    }

}
