package com.kodluyoruz.multithread.synchronization;

public class MyThread1 extends Thread{
    private final Table t;

    public MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
      //  synchronized (t) {//threadlerimin sıralı bir şekilde çalışmasını istersem synchronization eklerim
            t.printTable(5);
     //   }
    }
}
