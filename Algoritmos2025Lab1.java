/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmos2025lab1;

/**
 *
 * @author trejo
 */
public class Algoritmos2025Lab1 {

    public static void main(String[] args) {
        CalculadoraComplex calc = new CalculadoraComplex();
        NumImg num1 = new NumImg(3, 2);
        NumImg num2 = new NumImg(1, 7);
        NumImg resultado = calc.suma(num1, num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
        resultado = calc.resta(num1, num2);
        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resultado);
        resultado = calc.multiplicacion(num1, num2);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + resultado);
        resultado = calc.division(num1, num2);
        System.out.println("La división de " + num1 + " y " + num2 + " es " + resultado);
        CalculadoraUI calFig= new CalculadoraUI();
        calFig.setVisible(true);

    }
}
