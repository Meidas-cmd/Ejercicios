package org.example;

import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios_ejemplo {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        //Ejercicio 1 A
        /*
        int  bingo[][] = new int[3][3];
        for (int i = 0 ; i< bingo.length;i++){
            for (int j = 0; j< bingo[0].length;j++){
                bingo[i][j] = aleatorio.nextInt(11);
            }
        }
        for (int fila[] : bingo){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        externo:
        for (int i = 0; i< bingo.length;i++){
            interno:
            for (int j = i;j< bingo[0].length;j++){
                System.out.print(bingo[i][j] + " ");
                break interno;
            }
        }
        */
        //Ejercicio 1 B
/*
        int  bingo[][] = new int[4][4];
        for (int i = 0 ; i< bingo.length;i++){
            for (int j = 0; j< bingo[0].length;j++){
                bingo[i][j] = aleatorio.nextInt(11);
            }
        }
        for (int fila[] : bingo){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        for (int i = 0; i< bingo.length;i++){
            interno:
            for (int j = bingo[0].length -1;j>0;){
                System.out.print(bingo[i][j-i] + " ");
                break interno;
            }
        }
*/
        //Ejercicio 2

        int matrizA[][]= new int[3][3];
        int matrizB[][] = new int[3][3];

        for (int i = 0 ; i< matrizA.length;i++){
            for (int j = 0; j< matrizA[0].length;j++){
                matrizA[i][j] = aleatorio.nextInt(11);
            }
        }

        for (int i = 0 ; i< matrizB.length;i++){
            for (int j = 0; j< matrizB[0].length;j++){
                matrizB[i][j] = aleatorio.nextInt(11);
            }
        }
        int matriz_final[][] = new int[3][3];
        for (int i = 0 ; i< matrizA.length;i++){
            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] > matrizB[i][j]){
                    matriz_final[i][j]=matrizA[i][j];
                }else{
                    matriz_final[i][j]=matrizB[i][j];
                }
            }
        }
        System.out.println("Matriz A");
        for (int fila[] : matrizA){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz B");

        for (int fila[] : matrizB){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz Final");

        for (int fila[] : matriz_final){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }



    }
}
