package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Batería_ejercicios_sobre_matrices {
    static void main() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        //Ejercicio 1
        /*
        System.out.println("Matrices(3x3): ");
        int matriz[][] = new int[3][3];
        int posfila = 0;
        int poscolumna=0;
        boolean estado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Número a buscar: ");
        int buscar = entrada.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]==buscar){
                    posfila = i;
                    poscolumna = j;
                    estado = true;
                }
            }
        }
        System.out.println("Salida: ");
        if (estado) {
            System.out.println("El numero " + buscar + " se encuentra en la posicion " + posfila +" " + poscolumna);
        } else {
            System.out.println("No esta el numero: " + buscar);
        }
        */
        //Ejercicio 2
        /*
        int tamanyo = aleatorio.nextInt(1,6);
        int matriz[][] = new int[tamanyo][tamanyo];
        int resultado=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorio.nextInt(1, 11);
            }
        }
        System.out.println("Matriz: ");
        for (int fila[] : matriz){
            for (int columna : fila ){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Suma de fila: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado += matriz[i][j];
            }
            System.out.println(" Fila " + (i+1) + ":" + resultado);
            resultado=0;
        }
        System.out.println("Suma de columnas: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado += matriz[j][i];
            }
            System.out.println(" Columna " + (i+1) + ":" + resultado);
            resultado=0;
        }
        */
        //Ejercicio 3
        /*
        int resultado=0;
        System.out.println("Cuantos alumnos tienes: ");
        int alumnos = entrada.nextInt();
        System.out.println("Cuantas asignaturas tienes: ");
        int asignaturas = entrada.nextInt();
         String matriz[][]=new String[alumnos+1][asignaturas+1];
         matriz[0][0] = "Estudiantes";
         for (int j = 1; j < matriz[0].length; j++) {
                System.out.println("Introduce el nombre del estudiante: " + j);
                matriz[j][0]= entrada.next();
         }
        for (int j = 1; j < matriz.length; j++) {
            System.out.println("Introduce el nombre de la asignatura: " + j);
            matriz[0][j]= entrada.next();
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.println("Dame la nota de " + matriz[0][j] + " para la asignatura de " + matriz[i][0] );
                matriz[i][j]=entrada.next();
            }
        }
        for (String fila[] : matriz){
            for (String columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                resultado += Integer.parseInt(matriz[i][j]);
            }
            System.out.println("Nota media de " + matriz[0][i] + " es " + (resultado/ (matriz.length-2)));
            resultado=0;
        }
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                resultado += Integer.parseInt(matriz[j][i]);
            }
            System.out.println("Nota media de " + matriz[i][0] + " es " + (resultado/ (matriz.length-2)));
            resultado=0;
        }
        */
    }
}
