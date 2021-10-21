package com.kodluyoruz.multithread;

public class MainThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(MainThread2::print);
        Thread thread2=new Thread(MainThread2::print);
        thread.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());
    }

    public static void print(){
        //iki threadler arasında bir senkronizasyon olmadan ekrana yazdırır
        for (int i = 0; i < 100; i++) {
            System.out.printf("Count: %d Thread Name: %s \n ",i,Thread.currentThread().getName());
        }
}
}