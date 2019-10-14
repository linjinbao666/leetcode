package learn;


import annotation.GuardedBy;

public class SynchronizedInteger {

    private int value;

    public synchronized int getValue(){return value;}

    public synchronized void setValue(int value){this.value = value;}




    public static void main(String[] args){


    }
}
