package org.example;

import java.util.Scanner;

public class Bateria_pre_examen {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        //Ejercicio 1
        int num=0;
        String mayores="";
        String menores="";
        String iguales="";
        System.out.println("Cuantos numeros vas a introducir: (Ej- 1,2,10)");
        int cant = entrada.nextInt();
        for (int i = 1; i<=cant;i++){
            System.out.println(i +"Introduce el numero: ");
            num = entrada.nextInt();
            if (num < 0){
                menores += Integer.toString(num);
            } else if (num > 0) {
                mayores += Integer.toString(num);
            }else {
                iguales += Integer.toString(num);
            }
        }
        System.out.println("Mayores que 0 son: " + mayores);
        System.out.println("Menores que 0 son: " + menores);
        System.out.println("Iguales que 0 son: " + iguales);

    }
}
