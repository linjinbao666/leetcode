package learn;


import annotation.GuardedBy;

public class SynchronizedInteger {

    private volatile int value;

    public synchronized int getValue(){return value;}

    public synchronized void setValue(int value){this.value = value;}

    volatile boolean asleep;



    public static void main(String[] args){


    }
}
