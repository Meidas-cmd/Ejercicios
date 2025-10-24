package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BateriaT2_Bucles {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        //Ejercicio 1
        String contrasenya = "hola" ;
        System.out.println("Introduce la contraseña");
        String con1 = entrada.next();

        for ( int i=1;con1!=contrasenya; i++) {
            System.out.println("Intento" + i);
                System.out.println("Introduce la contraseña");
                con1 = entrada.next();
        }
        */
        /*
        //Ejercicio 2
        System.out.println("Dime un nuemro");
        int num1 = entrada.nextInt();
        for (int i=1;i<=num1;num1--){
            System.out.println(num1);
        }
         */
        /*
        //Ejercicio 3
        for (int i = 1;i<=50;i++){
            int mult = i % 3;
            if (mult==0){
                System.out.println(i);
            }
        }
         */
        /*
        //Ejercicio 4
        char letra;
        System.out.println("Dime una palabra");
        String pal = entrada.next();
        int num = pal.length();

        for (int i =0;i<num;i++){
            letra = pal.charAt(i);
            System.out.println(letra);
        }
         */
        /*
        //Ejercicio5
        System.out.println("Introduce el numero que queires la tabla:");
        int num1 = entrada.nextInt();
        for (int i=1;i<=10;i++){
            int resultado = i*num1;
            System.out.println(num1 + " X " + i + " = "+resultado);
        }
        */
        /*
        //Ejercicio 6.1
        int num2 =0;
        int resultado=0;
        System.out.println("Cuantos nuemros quieres sumar");
        int num1 = entrada.nextInt();
        for (int i =1;i<=num1;i++){
            System.out.println("Inserta nº"+i);
            num2= entrada.nextInt();
            resultado = resultado + num2;
        }
        System.out.println(resultado);
        */
        /*
        //Ejercicio 6.2
        int resultado=1;
        System.out.println("Que numero quieres saber su factorial");
        int num1 = entrada.nextInt();
        for (int i=1;i<=num1;i++){
            resultado=i*resultado;
        }
        System.out.println(resultado);
        */
        /*
        //Ejercicio 7
        char letra;
        System.out.println("Dime una palabra");
        String pal = entrada.next();
        int num = pal.length();

        for (int i =num -1;i>=0;i--){
            letra = pal.charAt(i);
            System.out.print(letra);
        }
    */
    }
}
