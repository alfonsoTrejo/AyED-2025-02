package com.mycompany.algoritmos2025lab1;

import java.util.Arrays;

public class Pila<T> {
    private T[] elementos;
    private int tope;
    private int capacidad;

    public Pila() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = (T[]) new Object[capacidad];
        this.tope = -1;
    }

    public void push(T elemento) {
        if (estaLlena()) {
            redimensionar(capacidad * 2); // Duplica la capacidad cuando la pila esté llena
        }
        elementos[++tope] = elemento;
    }

    public T pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos[tope--];
    }

    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos[tope];
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == capacidad - 1;
    }

    public int tamano() {
        return tope + 1;
    }

    @SuppressWarnings("unchecked")
    private void redimensionar(int nuevaCapacidad) {
        elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        capacidad = nuevaCapacidad;
        System.out.println("Capacidad aumentada a: " + nuevaCapacidad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tope; i++) {
            sb.append(elementos[i]);
            if (i < tope) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
