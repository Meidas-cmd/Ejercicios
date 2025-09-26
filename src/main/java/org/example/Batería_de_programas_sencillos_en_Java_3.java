package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_3 {
    static void main(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Te pido un numero pls");
        double num1 = entrada.nextDouble();
        if ( 0 == num1){
            System.out.println("Tu numero no es ni positivo ni negativo es 0");
        }
        else{
            if (0 < num1){
                System.out.println("Tu numero es positivo");
        }
            else {
                System.out.println("Tu numero es negativo");
            }
        }
    }
}
