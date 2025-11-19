package org.example;

import java.util.Random;

public class Matrices2 {
    static void main() {
        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(6)+2][aleatorio.nextInt(6)+2];

        for (int i = 0; i< matriz.length;i++){
            for (int j =0; j< matriz[i].length;j++){
                matriz[i][j]= aleatorio.nextInt(11);
            }
        }
        for (int fila[] : matriz){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
