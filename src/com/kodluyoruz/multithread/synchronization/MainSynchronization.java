package com.kodluyoruz.multithread.synchronization;

public class MainSynchronization {
    public static void main(String[] args) {
        Table table=new Table();
        Thread t1=new MyThread1(table);
        t1.setPriority(Thread.MAX_PRIORITY); //önceliklendirmek için ama garantisi yok
        Thread t2 = new Thread(new MyThread2(table));
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        table.printTable(1000);

        /*
        MIN_PRIORITY=1
        NORMAL_PRIORITY=5 bir priority belirtmezsek normal olarak baslar
        MAX_PRIORTY=10
        bir atama yaparsak ona göre işlem yaparız. Benim yarattığım thread diğerlerine göre biraz öncelikli ona göre favor et

         */
    }
}
