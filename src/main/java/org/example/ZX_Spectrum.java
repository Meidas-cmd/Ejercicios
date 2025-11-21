package org.example;

import java.util.Scanner;

public class ZX_Spectrum {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        boolean estado = true;
        int ancho=0;
        int alto=0;
        while(estado) {
            System.out.println("*********** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ***********");
            System.out.println("Introduce la resolución de tu pantalla (ancho x alto)... ");
            System.out.println("Ancho: ");
             ancho = entrada.nextInt();
            System.out.println("Alto: ");
             alto = entrada.nextInt();
             if (ancho % 8 == 0 && alto % 8 == 0 && ancho <= 48 && alto <= 48){
                 estado = false;
             }
        }
        String matriz[][] = new String[ancho][alto];

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada pixel: ");
        for (int i = 0; i < matriz.length; i++) {
            boolean filaValida = false;

            while (!filaValida) {
                String fila[] = entrada.next().split("");
                filaValida = true; // asumimos que la fila es válida

                if (fila.length != matriz[i].length) {
                    System.out.println("La fila debe tener exactamente " + matriz[i].length + " caracteres.");
                    filaValida = false;
                }

                for (int j = 0; j < matriz[i].length; j++) {
                    if (!fila[j].matches("[a-oA-O]")) {
                        System.out.println("Has introducido un valor de pixel incorrecto (a-oA-O). Vuelve a intentarlo.");
                        filaValida = false; // la fila no es válida
                        break; // salimos del bucle de columnas para pedir toda la fila de nuevo
                    } else {
                        matriz[i][j] = fila[j];
                    }
                }
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
