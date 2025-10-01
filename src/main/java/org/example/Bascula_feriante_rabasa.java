package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bascula_feriante_rabasa {
    static void main(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("*****BIENVENIDO AL RATÓN JUGUETÓN*****");
        System.out.println("Leyendo altura (cm)...");
        int altura = 0;
        boolean estado = true;
        do {
            try {
                altura = entrada.nextInt();
                estado = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }
        } while (estado);
            estado = true;
        final int ALTURA_MINIMA = 140;
        final int NEGATIVO = 0;
        final int ALTURA_MAXIMA = 230;
        if (altura < ALTURA_MINIMA) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN");
        }else if (altura <= NEGATIVO || altura >= ALTURA_MAXIMA ) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
        } else {
            System.out.println("Leyendo peso (kg)...");
            int peso = 0;
            do {
                try {
                    peso = entrada.nextInt();
                    estado = false;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un peso válido.");
                    entrada.nextLine();
                }
            } while (estado);
            int peso_minimo = altura*2/8;
            final int PESO_MAXIMO = 120;
            int peso_resta = PESO_MAXIMO-peso;
            if (peso < peso_minimo || peso_resta < NEGATIVO){
                System.out.println("No cumples las condiciones para subirte a la atraccion");
            }else {
                System.out.println("Pesas " + peso + "kg peso minimo calculado: " + peso_minimo +"kg " );
            }
        }

    }
}
