package com.kodluyoruz.multithread.executors;

import java.util.concurrent.*;

public class MainExecutor {
    public static void main(String[] args) {
        //çalıştırmak istediğimiz taskları atayabilecegimiz bir servis
//        ExecutorService executorService =Executors.newSingleThreadExecutor(); //pull içinde tek thread olmasını
//        executorService.submit(()->{
//            System.out.println("Thread name: "+ Thread.currentThread().getName());
//        });
//        System.out.println("Thread Name: "+ Thread.currentThread().getName());
//        executorService.submit(() ->{
//            System.out.println("Thread Name: " +Thread.currentThread().getName());
//        });

        //void dönüş yapan metotlar: runnable metot
        //threadlerle işlem yaptırıp bunun sonucunda bir response sonucu alabiliyoruz, return dönen threadler gibi: callable

        Callable<Integer> task = ()-> {
            try {
                TimeUnit.SECONDS.sleep(10); //10 sn boyunca uyuyor
                return 123;
            }catch (InterruptedException e){
                throw new IllegalStateException("task interrupted",e);
            }
        };
        ExecutorService service =Executors.newFixedThreadPool(3); //3 tane threadten olusan bir havuz yarat bu havuza thread attıgımızda 3 üne paylastır.
        Future<Integer> integerFuture =service.submit(task); //task pasladık, future: ileriye dönük bir cevap verecek

        System.out.println("Is completed: "+integerFuture.isDone());
        Integer result=null;
        try {
             result = integerFuture.get(); //sonuç dönene kadar burada bloklanırız
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Future done? " +integerFuture.isDone());
        System.out.println("Result: " + result);

        service.shutdown(); //sistemin durmasını sağlar.
    }
}
