package org.example.Practica3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ISBN {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        boolean estado = true;
        int posicion = 0;
        char num1;
        int num2;
        int num3 = 0;
        int j = 1;
        int tamanyo = 0;
        int num5 = 0;
        String isbn = "0";
        System.out.println("-----------------");
        System.out.println("*Validador y reparador de ISBN*");
        System.out.println("-----------------");
        System.out.println("1-Validador ISBN");
        System.out.println("2-Reparador de ISBN");
        System.out.println("X-Salir");
        System.out.println("-----------------");
        String modo = entrada.next().toLowerCase();
        if (modo.equals("1") || modo.equals("2")) {
            System.out.println("Introduce un ISBN");
            isbn = entrada.next().toLowerCase();
            tamanyo = isbn.length();
        }
        if (tamanyo == 10) {
            switch (modo) {
                case "1":
                    for (int i = tamanyo - 1; i >= 0; i--) {
                        num1 = isbn.charAt(i);
                        if (num1 == 'x') {
                            num2 = 10;
                        } else {
                            num2 = Integer.parseInt(String.valueOf(num1));
                        }
                        num3 += num2 * j;
                        j = j + 1;
                    }
                    if (num3 % 11 == 0) {
                        System.out.println("ISBN valido");
                    } else {
                        System.out.println("ISBN no valido");
                    }
                    break;
                case "2":

                    for (int i = tamanyo - 1; i >= 0; i--) {
                        num1 = isbn.charAt(i);
                        if (num1 == 'x') {
                            num2 = 10;
                        } else if (num1 != '?') {
                            num2 = Integer.parseInt(String.valueOf(num1));
                        } else {
                            num2 = 0;
                            posicion = j;
                        }
                        num3 += num2 * j;
                        posicion = j;
                    }
                    if (num3 % 11 == 0) {
                        System.out.println("El numero es 0");
                    } else {
                        for (j = 1; num3 % 11 == 0; j++) {
                            num3 = num3 - num5;
                            num5 = posicion * j;
                            num3 = num3 + num5;
                        }
                        System.out.println("El numero es " + j);
                    }

                    break;
                case "x":
                    return;
                default:
                    System.out.println("No es un modo valido del programa");
                    break;
            }
        }else {
            System.out.println("El tamanño del ISBN es incorrecto");
        }
    }
}
