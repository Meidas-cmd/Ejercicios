package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Elimianr_duplicado {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int[] vector = {1, 2, 2, 3, 4, 4, 5};
        int tam=0;
        int auxiliar[]=new int [vector.length];
        for (int i = 0; i <= vector.length-1; i++) {
            if (i == vector.length - 1) {
                auxiliar[i] = vector[i];
                tam++;
            }else if (vector[i] != vector[i + 1]) {
                auxiliar[i] = vector[i];
                tam++;
            }
        }
        System.out.println(Arrays.toString(auxiliar));
        System.out.println(tam);


        int limpio[]=new int[tam];
        int j=0;
        for (int i = 0; i < auxiliar.length; i++) {
            if (auxiliar[i]!=0) {
                limpio[i]= auxiliar[i];
                i++;

            }
        }

        System.out.println(Arrays.toString(limpio));
    }
}
