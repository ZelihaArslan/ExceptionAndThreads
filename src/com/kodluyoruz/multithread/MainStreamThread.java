package com.kodluyoruz.multithread;

import java.util.List;
import java.util.stream.Stream;

public class MainStreamThread {
    public static void main(String[] args) {
        Stream.iterate(10, i ->i+1)
       //         .parallel() sırayla çalısmamasını sağlıyo
                .filter(i -> i>1000)
                .limit(100)
                .forEach(System.out::println);
    }
}
