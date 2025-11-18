package org.example;

import java.util.Scanner;

public class bateria_pre_matrices {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        //Ejercicio 2
        System.out.println("Cuanta altura quieres");
        int altura = entrada.nextInt();
        externo:
        for (int i = 0;i<=altura;i++){

            interno:
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*
        //Ejercicio 3
        System.out.println("Dame el maximo; ");
        int max = entrada.nextInt();
        externo:
        for(int i = 1; i<=9;i++){
            interno:
            for (int j=1;j<=10;j++){
                System.out.println(i +" x " + j  + " = " + (i*j));
                if ((i*j)>=max){
                    break externo;
                }
            }
        }
        */

        //Ejercicio 4
        System.out.println("Introduzca el valor max: ");
        int max = entrada.nextInt();
        externo:
        for (int i = 2;i<=max;i++){


            for (int j =2; j<=i;j++){

                if (i%j==0 && i != j){
                    continue externo;

                }
            }
            System.out.println(i + " ");
        }
    }
}
