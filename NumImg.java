package com.mycompany.algoritmos2025lab1;

/**
 *
 * @author trejo
 */

public class NumImg {
    private double real;
    private double img;

    public NumImg(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public NumImg() {
        this.real = 0;
        this.img = 0;
    }
    
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImg() {
        return img;
    }
    public void setImg(double img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return real + " + " + img + "i";
    }
}
