package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad_case {
    static void main() {
        int anyo_nacimiento_int = 0;
        Scanner entrada = new Scanner(System.in);

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        final int ANYO_MINIMO = 1900;

        System.out.println("Que modo quieres estan 1 y 2: ");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");
        int modo = entrada.nextInt();
        switch (modo){
            case 1:
                System.out.println("Introduce tu año de nacimiento");
                String anyo_nacimiento = entrada.next();
                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (NumberFormatException e) {
                    System.out.println("Formato no numerico: ");
                    return;
                }
                break;
            case 2:
                int edad=0;

                System.out.println("Introduce tu edad:");
                if (entrada.hasNextInt()){
                    edad = entrada.nextInt();

                } else {
                    System.out.println("No has introducido un numero");
                    return;
                }
                if (edad >= 0 && edad<=125){
                    anyo_nacimiento_int = anyo_actual - edad;
                    System.out.println("Tu año de nacimiento es "+ anyo_nacimiento_int);
                }else {
                    System.out.println("Edad incorrecta: ");
                }
                break;
            default:
                System.out.println("Modo incorrecto");
                break;
        }
        if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual) {
            if (anyo_nacimiento_int <= 1927) {
                System.out.println("Generación sin bautizar: ");
            } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {
                System.out.println("Generación Silent: ");

            } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                System.out.println("Baby Boomers ");

            } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                System.out.println("Generación X ");

            } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                System.out.println("Generación Y o Millennials: ");
            } else if (anyo_nacimiento_int >= 1995) {
                System.out.println("Generación Z o Centennials: ");

            }
        }else {
            System.out.println("Edad o año  no valida");
        }
    }
}
