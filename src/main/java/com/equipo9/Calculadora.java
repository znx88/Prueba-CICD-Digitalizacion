package com.equipo9;
public class Calculadora {
    public int sumar(int a, int b) { return a + b; }
    public int multiplicar(int a, int b) { return a * b; }
    public static void main(String[] args) {
        System.out.println("Prueba CI/CD Equipo 9: " + new Calculadora().sumar(2, 3));
    }
}
