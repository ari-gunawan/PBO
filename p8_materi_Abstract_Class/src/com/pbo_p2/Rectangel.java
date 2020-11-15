package com.pbo_p2;

public class Rectangel extends Shape {
    private int length, width;

    public  Rectangel(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return  length*width;
    }
    public String toString(){
        return "Rectangle";
    }
}
