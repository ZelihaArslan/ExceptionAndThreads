package com.kodluyoruz.exception_handing;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainExceptionHandling {

    public static void main(String[] args) {
	// write your code here
       // print("Test");

        //bir hata oluştu ve biz bu hatayı try-catch blogu ile handle ettik,
        File file;
        try {
            FileInputStream inputStream=new FileInputStream("input.txt");
        } catch (FileNotFoundException ignored) { //ignored ile hata oldugu halde önemsiz oldugu için bize göstermedi
            System.out.println("File not found"); //olan hatayı kullanıcıya göstermek istersek kendimiz de yazabiliriz
        }
//belki kullanıcı sayı yerine yazı girerse hata olur bu bir runtime exception olur.
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
       int number = -1;
       try{
           number=scanner.nextInt();
       } catch (Exception e){
           System.out.println("Input hatalı");
       }finally {
           {
               System.out.println("Her zaman calışır");
           }
       }


       if(number !=-1){
           System.out.println("Input: "+number);
       }*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Radius: ");

        Circle circle=null;
        try {
            double radius = scanner.nextDouble();
            circle = new Circle(radius);
        }catch (IllegalArgumentException e){
            System.out.println("Hatalı veri "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Hatalı input formatı!");
        }
        if (circle != null) {
            try {
                circle.findArea();
            } catch (CustomRuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void print(String name){
        print(name);
    }
}
