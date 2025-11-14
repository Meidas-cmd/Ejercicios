package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Modo3_Elimar {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeros[] = new int[10];
        for (int i = 0 ; i<numeros.length;i++){

            numeros[i] = aleatorio.nextInt(11);

        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        boolean comprobar = true;

        while (comprobar){
             comprobar = false;
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            for (int i=0;i<numeros.length;i++){
            if (i  != numeros.length-1 && numeros[i]==numeros[i+1]){
                System.out.println("Duplicado: " + numeros[i+1]);
                System.out.println(Arrays.toString(numeros));
                numeros[i] = aleatorio.nextInt(11);
                comprobar = true;
                }
            }
        }

    }
}
