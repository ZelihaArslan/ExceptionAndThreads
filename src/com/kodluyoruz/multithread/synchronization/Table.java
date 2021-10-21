package com.kodluyoruz.multithread.synchronization;

public class Table {
    synchronized void printTable(int n) { //başına synchronizedekleyerek yine sıralı çalıştırabiliriz
     //   synchronized (this) { //table üzerinden synchronized(sıralı ) oluşturmak istersek bu şekilde ekleriz
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
       // }
    }
}
