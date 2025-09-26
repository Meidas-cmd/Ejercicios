package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_4 {
    static void main(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el primer numero ");
        double num1 = entrada.nextDouble();
        System.out.println("Dame el segundo numero ");
        double num2 = entrada.nextDouble();
        System.out.println("Dame el tercer numero ");
        double num3 = entrada.nextDouble();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
        System.out.println("ERROR: hay números introducidos que son iguales");
        }
        else {
            if (num1 < num2 && num1 < num3) {
            System.out.println(num1 +" es el mas pequeño de todos");
            } else if ( num2 < num1 && num2 < num3){
                System.out.println(num2 +" es el mas pequeño de todos");
            } else if (num3 < num1 && num3 <num2){
                System.out.println(num3 +" es el mas pequeño de todos");
            }
        }
    }
}
