package com.kodluyoruz.multithread.communication;

public class MainCommunication {
    public static void main(String[] args) {
        /*
        Bazı durumlarda birden fazla thread tarafından paylaşılan
         obje geçici olarak kullanıma uygun olmayabilir.
         Bu durumda thread objeyi kullanmak yerine wait() metodunu
          çağırarak kendini beklemeye alır ve
          diğer threadlerin işlemleri bitirmesi için beklemeye geçer.
          Bu durumu notify() yada notifyAll() metodlarını
          çağırarak obje üzerinde işlem yapmak için bekleyen
          diğer threadlere bildirir. O threadler de işlemlerini
          bitirince aynı biçimde notify() yada notifyAll() metodlarını
          çağırarak diğer bekleyen threadleri uyarır. wait(), notify() ve notifyAll() metodları
          Object sınıfından gelir ve synchronized kapsamı içinden çağrılmalıdır.
        wait(): metot ile bir thread beklemeye alınırken
        notify() metodu ile calışmaya devam eder.
         */
        final Customer customer= new Customer();
        new Thread(()-> customer.withdraw(15800)).start();
        new Thread(()-> customer.deposit(10000)).start();

    }
}
