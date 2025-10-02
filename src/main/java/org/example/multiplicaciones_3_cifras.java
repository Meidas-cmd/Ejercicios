package org.example;

import java.util.Scanner;

public class multiplicaciones_3_cifras {
    static void main (){
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        final int NUM_MIN = 99;
        final int NUM_MAX = 1000;
        do
        {
                /*Estoy pidiendo el primer numero de 3 cifras y guardandole en la variable num1*/
                System.out.println("Introduce el primer numero de 3 cifras: ");
                num1 = entrada.nextInt();
        } while ( num1 > NUM_MIN  && num1 < NUM_MAX);

        /*Estoy pidiendo el segundo numero de 3 cifras y guardandolo en la variable num2*/
        System.out.println("Introduce el segundo numero de 3 cifras: ");
        int num2 = entrada.nextInt();


        /* Estoy haciendo una variable multiplicando los dos numero que he pedido antes*/
        int resultado = num1*num2;










        System.out.println("El producto de la multiplicacion es: " + resultado);
        System.out.println("El proceso es: ");

    }
}
