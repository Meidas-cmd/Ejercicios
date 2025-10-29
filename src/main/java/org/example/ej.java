package org.example;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class ej {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        /*LocalDateTime fecha = LocalDateTime.now();
        int anio = fecha.getYear();
        String numero="";
        String bisiesto ="";
        System.out.println("Dame un año");
        int año1 = entrada.nextInt();
        for (int i = anio; i>=año1;i--){
            int divisible100 = i % 100;
            int divisible4= i %4;
            int divisible400 = i %400;
            if ( divisible100 != 0 && divisible4 == 0){
                numero = Integer.toString(i);
                bisiesto += i + ",";
            } else if (divisible400 == 0) {
                numero = Integer.toString(i);
                bisiesto += i + ",";

            }

        }
        System.out.println(bisiesto);*/
        /*
        int num_ale = aleatorio.nextInt(100) + 1;
        System.out.println(num_ale);
        System.out.println("He pensado un numero");
        for (int i = 1;i <=10;i++){
            System.out.println("SAFFAS");
            int num = entrada.nextInt();
            if (num>num_ale){
                System.out.println("El numero es menor");
            } else if (num<num_ale) {
                System.out.println("Numero es mayor");
            }else  {
                System.out.println("Has acertado");
                return;
            }
        }
        */

    }
}
