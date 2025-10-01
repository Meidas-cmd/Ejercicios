package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_8 {
    static void main () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el primer lado del triangulo");
        double lado1 = entrada.nextDouble();
        System.out.println("Dame el segundo lado del triangulo");
        double lado2 = entrada.nextDouble();
        System.out.println("Dame el tercer lado del triangulo");
        double lado3 = entrada.nextDouble();
        if ( lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if ( lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
            System.out.println("Tu triangulo es escaleno");
        }else {
            System.out.println("Tu triangulo es isosceles");
        }
    }
}
