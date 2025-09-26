package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_6 {
    static void main(){
        Scanner entrada = new Scanner(System.in);
        double b = 0;
        double h = 0;
        while (b <= 0){
            System.out.println("Dame el valor b");
             b = entrada.nextDouble();
        }
        while (h <= 0){
            System.out.println("Dame el valor h");
             h = entrada.nextDouble();
        }
        double area = b * h / 2;
        System.out.println("El area del triangulo es " + area);
    }
}
