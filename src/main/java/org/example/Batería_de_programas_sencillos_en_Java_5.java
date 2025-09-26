package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_5 {
    static void main(){
        Scanner entrada = new Scanner(System.in);
    System.out.println("Dame el numero que quieres dividir");
    double num1 = entrada.nextDouble();
    System.out.println("Dame el divisor");
    double divisor = entrada.nextDouble();
    if ( divisor == 0){
        System.out.println("ERROR: no se puede dividir entre 0");
    }else {
        double  resultado = num1 / divisor;
        System.out.println("El resultado es " + resultado);
    }
    }
}
