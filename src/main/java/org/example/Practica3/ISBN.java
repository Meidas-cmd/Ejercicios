package org.example.Practica3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ISBN {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        //Aqui he creado las variables que usaremos luego
        int posicion = 0;
        char num1;
        int num2;
        int num3 = 0;
        int j = 1;
        int k =0;
        int tamanyo = 0;
        String isbn = "0";
        //Aqui estoy haciendo un menu para mostrar en pantalla y coger el modo que quiere
        System.out.println("-----------------");
        System.out.println("*Validador y reparador de ISBN*");
        System.out.println("-----------------");
        System.out.println("1-Validador ISBN");
        System.out.println("2-Reparador de ISBN");
        System.out.println("X-Salir");
        System.out.println("-----------------");
        String modo = entrada.next().toLowerCase();
        //Aqui estoy haciendo un if para preguntar el ISBN si elige el modo donde se utilice el ISBN
        if (modo.equals("1") || modo.equals("2")) {
            System.out.println("Introduce un ISBN");
            isbn = entrada.next().toLowerCase();
            tamanyo = isbn.length();
        }
        //Este if es para comprobar el tamaño del isbn
        if (tamanyo == 10 || modo.equals("x")) {
            switch (modo) {
                //En el caso que pongan 1 hacemos el validador
                case "1":
                    //He usado un for para hacer un bucle y vaya pasando por todo el isbn y haga las operaciones matematicas necesarias
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
                    //si todo suama un numero divisible de 11 le pone un mensaje de que es valido sino le pone un mensaje de isbn no valido
                    if (num3 % 11 == 0) {
                        System.out.println("ISBN valido");
                    } else {
                        System.out.println("ISBN no valido");
                    }
                    break;
                case "2":
                    //Aqui hacemos el reparador haremos lo mismo que en el validador solo que en el momento que haya un ? guardamos la `posicion
                    for (int i = tamanyo - 1; i >= 0; i--) {
                        num1 = isbn.charAt(i);
                        if (num1 == 'x') {
                            num2 = 10;
                        } else if (num1 == '?') {
                            posicion = j;
                            num2 = 0;
                        } else {
                            num2 = Integer.parseInt(String.valueOf(num1));
                        }
                        num3 += num2 * j;
                        j = j + 1;
                    }
                    //Aqui empezamos a comprobar si con 0 ya es divisible sino del 1 al 10 vamos probando hasta que sea divisible
                    if (num3 % 11 == 0) {
                        System.out.println("El numero que falta es el 0");
                    } else {
                        for (k = 1; k <= 10; k++) {
                            int sumaTest = num3 + k * posicion;
                            if (sumaTest % 11 == 0) {
                                if (k == 10) {
                                    System.out.println("El numero que falta es X");
                                } else
                                    System.out.println("El número que falta es " + k);
                                break;
                            }
                        }
                    }
                    break;
                case "x":
                    //Si eligen esta opcion ponemos un mensaje de saliendo y se acaba el programa
                    System.out.println("Saliendo..");
            }
        }else {
            //Este es el mensaje si alguno de las respuesta no cumple con los requisitos.
            System.out.println(" ISBN incorrecto");
        }
    }
}
