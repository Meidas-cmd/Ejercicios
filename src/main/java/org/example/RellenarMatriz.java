package org.example;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class RellenarMatriz {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String nombres[][]= new String[2][3];

        for (int i = 0; i < nombres.length; i++) {
            String fila[] = entrada.next().split("");
            if (fila.length== nombres[0].length) {
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j]=fila[j];
                }
            } else {
                System.out.println("Tamaño incorrecto: ");
                i--;
            }
        }

    }
}
