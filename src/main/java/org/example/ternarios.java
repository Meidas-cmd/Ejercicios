package org.example;

public class ternarios {
    static void main() {
        int a = 0;
        int b = 1;
        int c = -1;
        int resultado = 0;
        resultado = (++a == --b && ++b > c--) ? (a -= c) : (c = c - b);
        System.out.println(resultado);

    }
}
