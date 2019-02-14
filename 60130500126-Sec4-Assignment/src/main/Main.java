/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        StackAndQueueImpl TestS = new StackAndQueueImpl();
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

    }

    public static void TempQueue3() {

        StackAndQueueImpl TestS = new StackAndQueueImpl();
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
    }

    public static void TempQueue2() {

        StackAndQueueImpl TestS = new StackAndQueueImpl();
        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());
        System.out.println("TestS Size : " + TestS.size());
        System.out.println("TestS GetFront : " + TestS.getFront());
        TestS.push("1A");
//        TestS.push(1+1);
        TestS.push("2B");
        TestS.push("3C");
        TestS.push("4D");

        System.out.println("TestS Size : " + TestS.size());
        System.out.println("TestS GetFront : " + TestS.getFront());
//      System.out.println("ALL Value Of TestS : "+TestS.toString());
//        System.out.println("getValueByLocal 0 :" +TestS.getValueByLocal(0));
//        System.out.println("getValueByLocal 1 :" +TestS.getValueByLocal(1));
        for (int i = 0; i < 5; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS GetFront : " + TestS.getFront());

        System.out.println("TestS dequeu : " + TestS.dequeue());

        System.out.println("TestS GetFront : " + TestS.getFront());

        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        TestS.push("555+");
        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());

        TestS.clear();
        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
        TestS.push("1");
        TestS.push("2");
        TestS.push("3");
        TestS.push("4");
        TestS.push("5");
        TestS.push("6");
        TestS.push("7");
        TestS.push("8");
        TestS.push("9");
        TestS.push("10");
        TestS.push("11");

        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }
    }

    public static void TempQueue() {

        StackAndQueueImpl TestS = new StackAndQueueImpl();
        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());
        System.out.println("TestS Size : " + TestS.size());
        System.out.println("TestS GetFront : " + TestS.getFront());
        TestS.push("1A" + 1);
//        TestS.push(1+1);
        TestS.push("2B");
        TestS.push("3C");
        TestS.push("4D");
        TestS.push("1");
        TestS.push("2");
        TestS.push("3");
        TestS.push("4");
        TestS.push("5");
        TestS.push("6");
        TestS.push("7");
        TestS.push("8");
        TestS.push("9");
        TestS.push("10");
        TestS.push("11");
        System.out.println("TestS Size : " + TestS.size());
        System.out.println("TestS GetFront : " + TestS.getFront());
//      System.out.println("ALL Value Of TestS : "+TestS.toString());
//        System.out.println("getValueByLocal 0 :" +TestS.getValueByLocal(0));
//        System.out.println("getValueByLocal 1 :" +TestS.getValueByLocal(1));
        for (int i = 0; i < 5; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS GetFront : " + TestS.getFront());

        System.out.println("TestS dequeu : " + TestS.dequeue());

        System.out.println("TestS GetFront : " + TestS.getFront());

        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        TestS.push("555+");
        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS.isEmpty() : " + TestS.isEmpty());

        TestS.clear();
        for (int i = 0; i < 10; i++) {

            System.out.println("getValueByLocal " + i + " :" + TestS.getValueByLocal(i));

        }

        System.out.println("TestS.size() : " + TestS.size());

    }

}
