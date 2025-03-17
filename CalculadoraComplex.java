package com.mycompany.algoritmos2025lab1;

/**
 *
 * @author trejo
 */

public class CalculadoraComplex {
    
    public CalculadoraComplex(){    
    }

    public NumImg suma(NumImg num1, NumImg num2){
        double real = num1.getReal() + num2.getReal();
        double img = num1.getImg() + num2.getImg();
        return new NumImg(real, img);
    }
    
    public NumImg resta(NumImg num1, NumImg num2){
        double real = num1.getReal() - num2.getReal();
        double img = num1.getImg() - num2.getImg();
        return new NumImg(real, img);
    }
    
    public NumImg multiplicacion(NumImg num1, NumImg num2){
        double real = num1.getReal() * num2.getReal() - num1.getImg() * num2.getImg();
        double img = num1.getReal() * num2.getImg() + num1.getImg() * num2.getReal();
        return new NumImg(real, img);
    }

    public NumImg division(NumImg num1, NumImg num2){
        double denominador = num2.getReal() * num2.getReal() + num2.getImg() * num2.getImg();
        if (denominador == 0) {
            throw new ArithmeticException("División por un número complejo con módulo 0 no está definida.");
        }
        double real = (num1.getReal() * num2.getReal() + num1.getImg() * num2.getImg()) / denominador;
        double img = (num1.getImg() * num2.getReal() - num1.getReal() * num2.getImg()) / denominador;
        real = Math.round(real * 100.0) / 100.0;
        img = Math.round(img * 100.0) / 100.0;
    
        return new NumImg(real, img);
    }
}
