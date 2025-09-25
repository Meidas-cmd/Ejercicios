package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?: ");
        String nombre = entrada.nextLine();
        System.out.println("A que curso vas: ");
        String curso = entrada.nextLine();
        System.out.println("Hola " + nombre + " ,bienvenido a " + curso + ".");
        System.out.println("Introduce un numero para sumarlo");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce un numero para sumarlo");
        int numero2 = entrada.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("El resultado de " + numero1 + "+" + numero2 + "=" + resultado);
    }
}

