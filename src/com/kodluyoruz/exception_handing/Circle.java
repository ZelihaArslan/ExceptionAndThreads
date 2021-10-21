package com.kodluyoruz.exception_handing;

public class Circle {
    private double radius;


    public Circle(double radius){
        if(radius <=0){
            throw new IllegalArgumentException("Radius 0 dan büyük olmalı ");
            //beklenmeyen bir veri girdiğinde exception patlar,kendimiz bir exception yazdık
        }
        this.radius=radius;
    }

    public double findArea() throws CustomRuntimeException {
        throw new CustomRuntimeException("Find area is not implemented");
    }

}
