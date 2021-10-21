package com.kodluyoruz.annotation;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override //annotation
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
