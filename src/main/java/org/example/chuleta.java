package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class chuleta {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Integer vec[] = {10,2,4,80,1};
        int numeros[] = {90,23,11,11,23,90};
        //Para ver si el vector tiene algo Arrays.Aslist().contains()
        /*
        System.out.println(Arrays.asList(vec).contains(10));
        */
        //Para ordenar Arrays.sort()
        /*
        Arrays.sort(vec);
        System.out.println(Arrays.toString(vec));
        */
        // Busqueda binaria binarySearch() deberian de ser del mismo formato
        /*
        int pos = Arrays.binarySearch(vec, 4);
        System.out.println(pos);
        */
        //Para quitar numeros repetidos en vectores Arrays.stream().distinc().ToArray();
        /*
        int limpio[] = Arrays.stream(numeros).distinct().toArray();
        System.out.println(Arrays.toString(limpio));
        */
        //.matches("\\d{2}/\\d{2,4}") devuelve booleano

        //bucles anidados
        /*
        externo:
        for (int i =0;i<10;i++){
            System.out.println("Soy el esterno con i = " + i);
            interno:
            for (int j=10;j>0;j--){
                System.out.println("Soy el interno con j = " + j);
                if (j==5){
                    continue externo;
                }
                System.out.println("Hola " + (j+i));
            }

        }

        for (int fila[] : matriz){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("******************");
        */
        //Matrices

        int matriz[][] = {{3,2,1},{4,5,6},{7,8,9}};

        int natriz2[][] = new int[3][3];
        System.out.println(matriz[2][1]);
        System.out.println("******************");
        for (int i = 0;i< matriz.length;i++){

            for (int j = 0;j< matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        //For each
        int foreach[] ={1,2,3,4};
        for (int num : foreach){
            System.out.println(num);
        }
        System.out.println("******************");
        for (int fila[] : matriz){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("******************");

    }
}
