package org.example;

import java.util.Formattable;
import java.util.Scanner;

public class Mensjaes_Space_Invaders {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String aux="";
        System.out.println("Cuantas columnas quieres: ");
        int columnas = entrada.nextInt();
        String matiz[][] = new String[columnas][3];

        for (int i = 0; i < matiz.length; i++) {
            String fila[] = entrada.next().split("");
            for (int j = 0; j < matiz[i].length; j++) {
                matiz[i][j] = fila[j];
            }
        }

        for (int i = 0; i < matiz[0].length; i++) {
            for (int j = 0; j < matiz.length; j++) {
                System.out.print(matiz[j][i]);
            }

        }
    }
}
