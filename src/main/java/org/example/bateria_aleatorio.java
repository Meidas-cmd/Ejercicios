package org.example;

import java.util.Random;
import java.util.Scanner;

public class bateria_aleatorio {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio= new Random();
        /*
        //Ejercicio 1
        int num1 = aleatorio.nextInt(6)+1;
        int num2 = aleatorio.nextInt(6)+1;
        int suma = num1+num2;
        System.out.println("El dado numero 1 da: " + num1);
        System.out.println("El dado numero 2 da: " + num2);
        System.out.println("El resultado es: " + suma);
        */
        /*
        //Ejercicio 2
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String letra = "";
        for (int i =0;i<12;i++){
             letra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }
        System.out.println(letra);
         */
        /*
        //Ejercicio 3
        System.out.println("Dime el minimo");
        int min = entrada.nextInt();
        System.out.println("Dime el maximo");
        int max = entrada.nextInt();
        System.out.println("Cuantos numeros quieres");
        int cant = entrada.nextInt();
        for (int i = 0; i<cant; i++){
            int num_ale = aleatorio.nextInt(max - min + 1) + min;
            System.out.println(num_ale);
        }
        */
/*
        //Ejercicio 4
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String letra = "";
        String mayusculas =caracteres.substring(0,26);
        String minusculas =caracteres.substring(27,52);
        String numeros =caracteres.substring(53);
        int tamanyo = aleatorio.nextInt(8,12)+1;
        int cont = 0;
        for (int i =0;i<tamanyo;i++){
            if (cont == 0){
                letra += numeros.charAt(aleatorio.nextInt(numeros.length()-1));
                cont = 1;
            } else if (cont==1) {
                letra += minusculas.charAt(aleatorio.nextInt(minusculas.length()-1));
                cont = 2;
            } else if (cont == 2) {
                letra += mayusculas.charAt(aleatorio.nextInt(mayusculas.length()-1));
                cont = 3;

            }else {
                letra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
            }
        }
        System.out.println(letra);
*/
    }
}
