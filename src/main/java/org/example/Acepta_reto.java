package org.example;

import java.util.Scanner;

public class Acepta_reto {
    static void main() {

        Scanner entrada = new Scanner(System.in);
        String vec = "";
        int filas = entrada.nextInt();
        if (filas<=50){
        int[][] vector = new int[filas][filas];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j] = entrada.nextInt();
            }
        }
        for (int fila[] : vector){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }
        }
    }
}



