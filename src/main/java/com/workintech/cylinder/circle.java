package com.workintech.cylinder;

public class circle {

    private final double radius;

    public circle(double radius) {
        if(radius<0){
            this.radius=0;
        } else {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * 3;
    }
}
