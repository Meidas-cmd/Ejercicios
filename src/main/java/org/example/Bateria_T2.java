package org.example;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria_T2 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        // Explicacion de StringString y sus diferentes modos
        String frase= "Al palo juanfran del Atletico de Madrid palo";

        //Te dice el tamaño del string
        int tamanyo = frase.length();
        System.out.println(tamanyo);

        //Te pone el caracter que hay en la posicion que elijas en este caso 8
        System.out.println(frase.charAt(8));

        // Coge de la posicion 8 a la 16
        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        // Coge todo el string a partir de la posicion 17
        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        //Busca la palabra palo en el string
        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        //desde la posicion 10 busca la palabra palo
        int posicion2 = frase.indexOf("palo",10);
        System.out.println(posicion2);

        //Pasamos la frase a mayusculas
        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        //Pasamos la frase a minusculas
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        // Quitamos los espacios de la izq. derch.
        String base_datos = "Raul            ";
        System.out.println(base_datos.trim() + " - " + base_datos + "-");

        // Compara los string y te dice si es igual o no con true y false y habra que usar trim para quitar espacios y asi comparar bien
        boolean igual = base_datos.trim().equals("Manolo");
        System.out.println(igual);

        //Para ver si son iguales ignorando las mayusculas
        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("Raul");
        System.out.println(igual_sin_mayusculas);

        //Cambias las palabras que quieres por la que pongas
        String frase_remplazo = frase.replace("palo","Florentino");
        System.out.println(frase_remplazo);
        */
        /*
        //Ejercicio 1
        System.out.println("Introduce una palabra o frase");
        String frase = entrada.nextLine();
        //A
        System.out.println("A");
        System.out.println(frase);

        //B
        System.out.println("B");
        int tamanyo = frase.length();
        System.out.println(tamanyo);

        //C
        System.out.println("C");
        String sin_espacio  = frase.replace(" ","-");
        System.out.println(sin_espacio);

        //D
        System.out.println("D");
        int mitad = tamanyo / 2;
        String primer_mitad = frase.substring(0,mitad);
        String segunda_mitad = frase.substring(mitad);
        System.out.println("Primera mitad del texto es " + primer_mitad + "La segunda mitad del texto es " + segunda_mitad);

        //E
        System.out.println("E");
        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);
         */
        /*
        //Ejercicio 2
        System.out.println("Introduce la primera cadena de caracteres");
        String frase1 = entrada.nextLine();
        System.out.println("Introduce la segunda cadena de caracteres");
        String frase2 = entrada.nextLine();

        int tamanyo_1 = frase1.length();
        int tamnyo_2 = frase2.length();

        if ( tamanyo_1 > tamnyo_2){
            System.out.println("La " + frase1 + "es mayour que la " + frase2);
        }else if (tamnyo_2 > tamanyo_1){
            System.out.println("La " + frase2 + "es mayour que la " + frase1);
        }else {
            System.out.println("Las dos frases son iguales");
        }
        */
        /*
        //Ejercicio 3
        System.out.println("Introduce los numeros");
        int numero = entrada.nextInt();
        System.out.printf("Cuantas cifras quieres eliminar");
        int delete = entrada.nextInt();

        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();
        int sobrante = tamanyo - delete;

        String resultado = numero_string.substring(0,sobrante);
        System.out.println(resultado);
        */
        /*
        //Ejercicio 4
        System.out.println("Introduce una cadena de palabras");
        String frase = entrada.nextLine();
        System.out.println("Que palabra quieres quitar");
        String palabra = entrada.nextLine();

        int frase_tamnyo = frase.length();
        int palabra_tamnyo = palabra.length();

        String frase_sin = frase.replace(palabra,"");
        int sin_tamanyo = frase_sin.length();
        int total = frase_tamnyo - sin_tamanyo;
        int veces = total / palabra_tamnyo;
        System.out.println(veces);
        */
        //Ejercicio 5

        /*
        //TEMA 2 Practica 1 Numero de la suerte
        //Estoy creando variables y constantes
        int TAMNYO_FECHA = 10;
        boolean estado = false;
        int dia = 0;
        int mes = 0;
        int anyo = 0;
        //Estoy pidiendo la fecha para guardarla en la variable fecha
        System.out.println("Introduce una fecha con este formato(dd-mm-aaaa)");
        String fecha = entrada.nextLine();
        //Primero compruebo que haya introducido 10 caracteres sean numeros o letras y lo hago con length
        int tamnyo = fecha.length();
            if (tamnyo == TAMNYO_FECHA) {
            //Ahora empiezo a comprobar el formato sea correcto
            char buscar_formato1 = fecha.charAt(2);
            char buscar_formato2 = fecha.charAt(5);
            char formato = '-';
            if (buscar_formato1 == formato && buscar_formato2 == formato) {
                //Despues de comprobar el formato cogo los "numeros" para comprobar que sean numeros y no otro caracter
                String num1 = fecha.substring(0, 2);
                String num2 = fecha.substring(3, 5);
                String num3 = fecha.substring(6);

                try {
                    //Uso el parseInt para comprobar que sean numeros y aprovecho para cambiarlos de String a int
                    dia = Integer.parseInt(num1);
                    mes = Integer.parseInt(num2);
                    anyo = Integer.parseInt(num3);
                    //esta variable sirve para no repetir dos mensajes
                    estado = true;

                } catch (Exception e) {
                    System.out.println("No has introducido numeros en la fecha: ");
                }
            }else {System.out.println("Formato incorrecto: ");}
                //el if es para comprobar que los numeros sean numeros y asi continaur
                if (estado == true) {
                     //Ahora empiezo a poner los limites de la fecha
                    if (dia >= 1 && dia <= 31 && anyo <= 2025 && anyo >= 1900 && mes >= 1 && mes <= 12 ) {
                            //Empiezo ha hacer los procedimientos para la numerologia y mostrarlos en pantalla
                            int suma = dia + mes + anyo;
                            System.out.println(dia + "+" + mes + "+" + anyo + "=" + suma);
                            String ult_anyo = Integer.toString(suma);
                            //aqui cogo un numero en string
                            String num_uno = ult_anyo.substring(0, 1);
                            String num_dos = ult_anyo.substring(1, 2);
                            String num_tres = ult_anyo.substring(2, 3);
                            String num_cuatro = ult_anyo.substring(3, 4);
                            // Lo paso a numero con parseInt
                            int suma1 = Integer.parseInt(num_uno);
                            int suma2 = Integer.parseInt(num_dos);
                            int suma3 = Integer.parseInt(num_tres);
                            int suma4 = Integer.parseInt(num_cuatro);
                            //sumo los numeros para ver cual es el numero de la suerte
                            int total = suma1 + suma2 + suma3 + suma4;
                            System.out.println(suma1 + "+" + suma2 + "+" + suma3 + "+" + suma4 + "=" + total);
                            System.out.println("Tu numero de la suerte es = " + total);

                        } else {
                           //Por si no cumple los limites de la fecha
                            System.out.println("Formato incorrecto: ");
                        }
                    }
                }
            }
        }
         */

    } }




