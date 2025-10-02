package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bascula_feriante_rabasa {
    static void main(){

        Scanner entrada = new Scanner(System.in);
        /* Estoy mostrando por pantalla los mensajes del feriante*/
        System.out.println("*****BIENVENIDO AL RATÓN JUGUETÓN*****");
        System.out.println("Leyendo altura (cm)...");
        int altura = 0;

        boolean estado = true;
        /* Estoy haciendo que el error que aparece en pantalla por poner letras cuadno es un int no aparezca y repita el mensaje pidiendolo hasta que cumpñla las condiciones*/
        do {
            try {
                altura = entrada.nextInt();
                estado = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }
        } while (estado);
        /* Vuelvo a poner el estado en true*/
        estado = true;
        /* Y defino alguans constatnes para poner limites en la altura*/
        final int ALTURA_MINIMA = 140;
        final int NEGATIVOS = 0;
        final int ALTURA_MAXIMA = 230;
        /* Empiezo a usar las constantes para hacer que si la altura no es mayor que la altura minima le ponga un mensaje en pantalla y si cumple las condiciones pase a leer el peso*/
        if (altura < ALTURA_MINIMA) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN");
        }else if (altura <= NEGATIVOS || altura >= ALTURA_MAXIMA ) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
        } else {
            System.out.println("Leyendo peso (kg)...");
            /* Lo mismo que con la altura controlo el error y hago que repita hasta que ponga un numero valido*/
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
            /* Calculo el peso minimo de los valores que me ha pasado el usuario y defino constantes*/
            int peso_minimo = altura*2/8;
            final int PESO_MAXIMO = 120;
            int peso_resta = PESO_MAXIMO-peso;
            /* Comparo los pesos para ver si cumple las condiciones sino le muestro por pantalla un mensaje y acaba programa y si las cumple manda un mensaje por pantalla diciendo lo que pesa y que pase*/
            if (peso < peso_minimo || peso_resta < NEGATIVOS){
                System.out.println("No cumples las condiciones para subirte a la atraccion");
            }else {
                System.out.println("Pesas " + peso + "kg peso minimo calculado: " + peso_minimo +"kg " );
            }
        }

    }
}
