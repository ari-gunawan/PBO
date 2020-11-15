package com.pbo_p2;


public class triangel extends Shape{
    private int base,height;

    public triangel(int base, int height){
        this.base = base;
        this.height= height;
    }
    public double getArea(){
        return 0.5*base*height;
    }
    public String toString(){
        return "triangel";
    }
}
